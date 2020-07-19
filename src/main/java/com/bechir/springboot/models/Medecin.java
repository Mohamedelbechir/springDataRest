package com.bechir.springboot.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Medecin {
    @Id
    @GeneratedValue
    private Long id;
    private Long cin;
    // ? FetchType.EAGER  pour charger la relation en même temps que l'entité
    @OneToMany(mappedBy = "id.medecin"/*, fetch = FetchType.LAZY*/)  // on charge à la demande
    private List<Hospitalisation> hospitalisations = new ArrayList<Hospitalisation>();
    private String nom;
    private String prenom;

}