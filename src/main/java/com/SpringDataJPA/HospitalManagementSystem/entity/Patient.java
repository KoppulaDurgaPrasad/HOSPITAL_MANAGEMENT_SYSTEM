package com.SpringDataJPA.HospitalManagementSystem.entity;

import com.SpringDataJPA.HospitalManagementSystem.entity.type.bloodGroupType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@ToString
@Getter
@Setter
@Table(
        name = "patient",
        uniqueConstraints = {
                @UniqueConstraint(name = "unique_patient_email", columnNames = {"mail"}),
                @UniqueConstraint(name = "unique_patient_name_birthdate", columnNames = {"name", "birth_date"})
        },
        indexes = {
                @Index(name = "idx_patient_birth_date", columnList = "birth_date")
        }

)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 40)
    private String name;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(unique = true, nullable = false)
    private String mail;

    
    private String gender;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private bloodGroupType bloodGroup;

    @OneToOne(cascade = {CascadeType.ALL},orphanRemoval = true)
    @JoinColumn(name="patient_insurance_id",nullable = true) // Owning Side
    private Insurance insurance;

    @OneToMany(mappedBy = "patient",cascade = {CascadeType.REMOVE},orphanRemoval = true,fetch = FetchType.EAGER)
    private List<Appointment> appointments = new ArrayList<>();
}


