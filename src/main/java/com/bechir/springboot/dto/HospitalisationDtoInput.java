package com.bechir.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalisationDtoInput {
    private Long idMedecin;
    private Long idPatient;

}