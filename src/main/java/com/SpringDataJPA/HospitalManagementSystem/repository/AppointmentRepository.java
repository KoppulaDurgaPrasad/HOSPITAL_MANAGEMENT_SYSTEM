package com.SpringDataJPA.HospitalManagementSystem.repository;

import com.SpringDataJPA.HospitalManagementSystem.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}