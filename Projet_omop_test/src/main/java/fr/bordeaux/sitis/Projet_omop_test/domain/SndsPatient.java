package fr.bordeaux.sitis.Projet_omop_test.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tab_patient", schema="synthetic_snds")
public class SndsPatient {
        //Attributes
        @Id
        @Column(name="pat_id")
        private String id;
        //Constructors
        //Empty constructor
        public SndsPatient(){}

        public SndsPatient(String id) {
            this.id = id;
        }

        //Getters and Setters
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
        // To string
        @java.lang.Override
        public java.lang.String toString() {
            return "SndsPatient{" +
                    "id='" + id + '\'' +
                    '}';
        }
    }

