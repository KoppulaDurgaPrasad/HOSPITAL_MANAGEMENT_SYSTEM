package com.SpringDataJPA.HospitalManagementSystem.service;

import com.SpringDataJPA.HospitalManagementSystem.entity.Patient;
import com.SpringDataJPA.HospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

 private final PatientRepository patientRepository;

    @Transactional
    public Patient getPatientById(Long id) {

       Patient p1= patientRepository.findById(id).orElseThrow();
       Patient p2= patientRepository.findById(id).orElseThrow();
       p1.setName("DP");
       return p1;
    }
}
