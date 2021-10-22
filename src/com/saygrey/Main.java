package com.saygrey;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Patients patients=new Patients();
        patients.addPatient("surnameEX1","lastnameEX1","patronymicEX1",
                "birthdateEX1","OMSnumberEX1");
        patients.addTestToPatient(0,"testdateEX1","testtypeEX1","testaccuracyEX1","labidEX1");
        patients.addPatient("surnameEX2","lastnameEX2","patronymicEX2",
                "birthdateEX2","OMSnumberEX2");
        patients.addTestToPatient(1,"testdateEX21","testtypeEX21","testaccuracyEX21","labidEX21");
        patients.addTestToPatient(1,"testdateEX22","testtypeEX22","testaccuracyEX22","labidEX22");
        Converter.toJSON(patients,true);
        Patients patients1=Converter.toJavaObject();
        Converter.toJSON(patients1,false);
    }
}
