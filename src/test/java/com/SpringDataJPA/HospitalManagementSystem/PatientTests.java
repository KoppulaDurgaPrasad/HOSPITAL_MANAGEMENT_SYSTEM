package com.SpringDataJPA.HospitalManagementSystem;

import com.SpringDataJPA.HospitalManagementSystem.dto.BloodGroupCountResponseEntity;
import com.SpringDataJPA.HospitalManagementSystem.entity.Patient;
import com.SpringDataJPA.HospitalManagementSystem.entity.type.bloodGroupType;
import com.SpringDataJPA.HospitalManagementSystem.repository.PatientRepository;
import com.SpringDataJPA.HospitalManagementSystem.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@SpringBootTest
public class PatientTests {

    @Autowired
    private  PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository()
    {
       List<Patient> patientList =  patientRepository.findAllPatientWithAppointment();
      System.out.println(patientList);

       // Patient p1 = new Patient();
      //  patientRepository.save(p1);
    }

    @Test
    public void testTransactionMethods()
    {
//        Patient patient = patientService.getPatientById(1L);
       // Patient patient = patientRepository.findByName("A2");
        //List<Patient> patientList = patientRepository.findByBirthDateOrMail(LocalDate.of(2006,02,12),"A1@gmail.com");
    //    List<Patient> patientList = patientRepository.findByNameContaining("A");
       // List<Patient> patientList = patientRepository.findByBloodGroup(bloodGroupType.B_POSITIVE);

//      List<Object[]> bloodGroupList =patientRepository.countEachBloodGroupType();
//      for(Object[] objects:bloodGroupList)
//          System.out.println(objects[0]+" "+objects[1]);
//
//        List<Patient> patientList = patientRepository.findAllPatients();
//        for(Patient patient:patientList)
//            System.out.println(patient);

//        int rowsUpdated = patientRepository.updateNameWithId("A1", 1L);
//        System.out.println(rowsUpdated);

//        List<BloodGroupCountResponseEntity> bloodGroupList =patientRepository.countEachBloodGroupType();
//      for(BloodGroupCountResponseEntity bloodGroupCountResponse:bloodGroupList)
//          System.out.println(bloodGroupCountResponse);

        Page<Patient> patientList = patientRepository.findAllPatients(PageRequest.of(0,2));
        for(Patient patient:patientList)
            System.out.println(patient);
   }

}
