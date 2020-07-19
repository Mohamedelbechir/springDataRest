package com.bechir.springboot.daos;

import com.bechir.springboot.models.Medecin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface DaoMedecin extends JpaRepository<Medecin, Long> {
    
}