package com.saygrey;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Patient{
    Patient(){}
    Patient(String surname, String lastname, String patronymic, String birthdate,String OMSnumber){
        this.surname=surname;
        this.lastname=lastname;
        this.patronymic=patronymic;
        this.birthdate=birthdate;
        this.OMSnumber=OMSnumber;
    }
    @JsonProperty("surname")
    private String surname;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("patronymic")
    private String patronymic;
    @JsonProperty("birthdate")
    private String birthdate;
    @JsonProperty("OMSnumber")
    private String OMSnumber;
    @JsonProperty("tests")
    private ArrayList<Test> tests =new ArrayList<Test>();
    protected void addTest(String testdate, String testtype, String testaccuracy, String labid){
        tests.add(new Test(testdate, testtype, testaccuracy, labid));
    }
}