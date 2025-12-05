package com.SpringDataJPA.HospitalManagementSystem.dto;

import com.SpringDataJPA.HospitalManagementSystem.entity.type.bloodGroupType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BloodGroupCountResponseEntity {

    private bloodGroupType BloodGroupType;
    private Long count;

}
