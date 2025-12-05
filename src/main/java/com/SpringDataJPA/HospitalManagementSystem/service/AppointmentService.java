package com.SpringDataJPA.HospitalManagementSystem.service;


import com.SpringDataJPA.HospitalManagementSystem.entity.Appointment;
import com.SpringDataJPA.HospitalManagementSystem.entity.Doctor;
import com.SpringDataJPA.HospitalManagementSystem.entity.Patient;
import com.SpringDataJPA.HospitalManagementSystem.repository.AppointmentRepository;
import com.SpringDataJPA.HospitalManagementSystem.repository.DoctorRepository;
import com.SpringDataJPA.HospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.print.Doc;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;


    @Transactional
    public Appointment createNewAppointment(Appointment appointment,Long doctorId,Long patientId)
    {
        Doctor doctor=doctorRepository.findById(doctorId).orElseThrow();
        Patient patient = patientRepository.findById(patientId).orElseThrow();

        if (appointment.getId() != null) {
            throw new IllegalArgumentException("Appointment should not already exist");
        }

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        patient.getAppointments().add(appointment); // to maintain consistency

      return appointmentRepository.save(appointment);

    }
    @Transactional
    public  Appointment reAssignAppointmentToAnotherToAnotherDoctor(Long appointmentId,Long doctorId)
    {
        Appointment appointment = appointmentRepository.findById(appointmentId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setDoctor(doctor); // this will automatically call the update, because it is dirty

        doctor.getAppointments().add(appointment); // just for bidirectional

        return appointment;
    }
}
