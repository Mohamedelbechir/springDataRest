package com.bechir.springboot.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HospDtoForPatientListing {
    private LocalDateTime dateEntree;
    private LocalDateTime dateSortie;
    private String nomPatient;
    private String nomMedecin;
    private String prenomMedecin;

}