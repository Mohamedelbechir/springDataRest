package com.bechir.springboot;

import com.bechir.springboot.models.Hospitalisation;
import com.bechir.springboot.models.HospitalisationId;
import com.bechir.springboot.models.Medecin;
import com.bechir.springboot.models.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Patient.class, Medecin.class,
				Hospitalisation.class);

	}

}
