package com.bechir.springboot.daos;

import com.bechir.springboot.models.Patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface DaoPatient extends JpaRepository<Patient, Long> {

}