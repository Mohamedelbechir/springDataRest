package com.bechir.springboot.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDtoListing {
    private Long id;
    private String nom;
    private String prenom;
    private List<HospDtoForPatientListing> hospDtoForPatientListings;

}