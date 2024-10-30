package fr.bordeaux.sitis.Projet_omop_test.service;


import fr.bordeaux.sitis.Projet_omop_test.domain.OmopPersonMapping;
import fr.bordeaux.sitis.Projet_omop_test.repository.PatientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
// call the method from the repository to execute the query
    public void idMapping(){
        patientRepository.insertPersonMapping();
    }
}
