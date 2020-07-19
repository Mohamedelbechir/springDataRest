package com.bechir.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.bechir.springboot.daos.DaoHospitalisation;
import com.bechir.springboot.models.Hospitalisation;

@RestController
public class HospitalisationController {
    @Autowired
    private DaoHospitalisation daoHospitalisation;

   /*  @GetMapping(value = "hospitalisations")
    public ResponseEntity<List<Hospitalisation>> findAll() throws Exception{
        try {
            var list = daoHospitalisation.findAll();
            return new ResponseEntity<>(list, HttpStatus.OK);

        } catch (Exception e) {
            throw e;
        }

    }
 */
}