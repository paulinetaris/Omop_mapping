package fr.bordeaux.sitis.Projet_omop_test.domain;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;


@Entity
@Table(name="person_mapping",schema="omop")
public class OmopPersonMapping {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence-generator")
        @SequenceGenerator(name="sequence-generator", sequenceName = "omop.seq_patient" , schema="omop" , initialValue = 2, allocationSize = 1)
        //Attributes
        @Column(name="person_id")
        private Integer idOmop;

        @Column(name="person_ide")
        private String idSnds ;

        //Constructors
        //empty constructor
        public OmopPersonMapping(){}
        //constructors
        public OmopPersonMapping(Integer idOmop) {
            this.idOmop = idOmop;}

        public OmopPersonMapping(String idSnds) {
            this.idSnds = idSnds;}

    /*for later :
         * public OmopPersonMapping(SndsPatientDTO, sndsPatientDTO){
         * SndsPatientDTO (qui contient le person_id issu de la table de mapping obtenu par jointrure entre OmopPersonMapping et SndsPatient)
         * } */

        //Getters and Setters

        public Integer getIdOmop() {
            return idOmop;
        }

        public void setIdOmop(Integer idOmop) {
            this.idOmop = idOmop;
        }

        public String getIdSnds() {
            return idSnds;
        }

        public void setIdSnds(String idSnds) {
            this.idSnds = idSnds;
        }

    //To string

    @Override
    public String toString() {
        return "OmopPersonMapping{" +
                "idOmop=" + idOmop +
                ", idSnds='" + idSnds + '\'' +
                '}';
    }
}

