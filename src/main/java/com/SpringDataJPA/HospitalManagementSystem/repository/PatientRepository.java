package com.SpringDataJPA.HospitalManagementSystem.repository;


import com.SpringDataJPA.HospitalManagementSystem.dto.BloodGroupCountResponseEntity;
import com.SpringDataJPA.HospitalManagementSystem.entity.Patient;
import com.SpringDataJPA.HospitalManagementSystem.entity.type.bloodGroupType;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient,Long>
{


    Patient findByName(String name);
     // Optional<Patient> findByBirthDateOrMail(LocalDate birthDate, String mail);
     List<Patient> findByBirthDateOrMail(LocalDate birthDate, String mail);

     List<Patient> findByBirthDateBetween(LocalDate startDate,LocalDate endDate);

     List<Patient> findByNameContaining(String query);


     @Query("select p from Patient p where p.bloodGroup=?1")
     List<Patient> findByBloodGroup(@Param("bloodGroup") bloodGroupType bloodGroup);

     @Query("select p from Patient p where p.birthDate>:birthDate")
     List<Patient> findByBornAfterDate(@Param("birthDate")LocalDate birthDate);

     @Query("select new com.SpringDataJPA.HospitalManagementSystem.dto.BloodGroupCountResponseEntity( p.bloodGroup , count(p)) from Patient p group by p.bloodGroup")
     //List<Object[]> countEachBloodGroupType();
     List<BloodGroupCountResponseEntity> countEachBloodGroupType();

     @Query(value = "select * from patient",nativeQuery = true)
     Page<Patient> findAllPatients(Pageable pageable);

     @Transactional
     @Modifying
     @Query("update Patient p set p.name= :name where p.id=:id")
     int updateNameWithId(@Param("name")String name,@Param("id")Long id);


     // @Query("SELECT p FROM Patient p LEFT JOIN FETCH p.appointments a LEFT JOIN FETCH a.doctor ")
     @Query("SELECT p FROM Patient p LEFT JOIN FETCH p.appointments")
     List<Patient> findAllPatientWithAppointment();
}
