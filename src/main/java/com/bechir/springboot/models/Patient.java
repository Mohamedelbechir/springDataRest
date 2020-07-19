package com.bechir.springboot.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Patient {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    @OneToMany(mappedBy = "id.patient"/*, fetch = FetchType.LAZY*/)
    private List<Hospitalisation> hospitalisations = new ArrayList<Hospitalisation>();

}