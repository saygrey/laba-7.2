package com.saygrey;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
public class Patients {
    @JsonProperty("patients")
    ArrayList<Patient> patients=new ArrayList<Patient>();
    protected void addPatient(String surname, String lastname, String patronymic, String birthdate,String OMSnumber){
        patients.add(new Patient(surname, lastname, patronymic, birthdate, OMSnumber));

    }
    protected void addTestToPatient(int patientId,String testdate, String testtype, String testaccuracy, String labid){
        patients.get(patientId).addTest(testdate, testtype, testaccuracy, labid);
    }
}