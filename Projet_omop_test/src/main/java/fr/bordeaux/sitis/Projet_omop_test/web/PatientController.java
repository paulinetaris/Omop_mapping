package fr.bordeaux.sitis.Projet_omop_test.web;

import fr.bordeaux.sitis.Projet_omop_test.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService ;
    @PostMapping("/id_patient")
    public ResponseEntity<String> insertPersonMapping() {
        patientService.idMapping();
        return ResponseEntity.ok("person_mapping table populated successfully");
    }
}



