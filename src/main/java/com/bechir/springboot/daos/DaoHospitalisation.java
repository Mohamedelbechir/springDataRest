package com.bechir.springboot.daos;

import com.bechir.springboot.models.Hospitalisation;
import com.bechir.springboot.models.HospitalisationId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DaoHospitalisation extends JpaRepository<Hospitalisation, HospitalisationId> {

}