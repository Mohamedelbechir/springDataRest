package com.bechir.springboot.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor

public class HospitalisationId implements Serializable {
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medecin medecin;
    private LocalDateTime dateEntree = LocalDateTime.now();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(patient.getId()).append("_").append(medecin.getId());
        return builder.toString();
    }

}