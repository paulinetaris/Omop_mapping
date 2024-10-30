package fr.bordeaux.sitis.Projet_omop_test.repository;

import fr.bordeaux.sitis.Projet_omop_test.domain.OmopPersonMapping;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<OmopPersonMapping, String> {
    // we are modifying data with update so modifying and transactional because of update
    @Transactional
    @Modifying
    /* it is needed to insert the two columns at the same time and the other with the sequence created in the domain OmopPersonMapping
    * so we will not have issues with a column with null values while it is not allowed by the databases constraints*/
    @Query(value = "insert into omop.person_mapping (person_id, person_ide) " +
            "SELECT nextval('omop.seq_patient'), pat_id " +
            "FROM synthetic_snds.tab_patient", nativeQuery = true)
    // when there is a query it seems like we have to add a method
    void insertPersonMapping();

}




    /*
     * sql request
     * @Query(value="
     * UPDATE person_mapping
     * SET person_mapping.person_ide=tab_patient.pat_id
     * FROM omop.person_mapping inner join synthetic_snds.tab_patient on omop.person_mapping.person_ide=synthetic_snds.tab_patient.pat_id;"
     * ,nativeQuery = true) */


