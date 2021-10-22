package com.saygrey;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Converter {

    private final static String baseFile = "patients.json";
    private final static String testFile = "patientsTest.json";

    public static void toJSON(Patients patients,Boolean variant){
        ObjectMapper mapper = new ObjectMapper();
        try {
            if(variant)
                mapper.writeValue(new File(baseFile), patients);
            else
                mapper.writeValue(new File(testFile), patients);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("json created!");
    }

    public static Patients toJavaObject() {
        ObjectMapper mapper = new ObjectMapper();
        Patients patients=new Patients();
        try {
            patients= mapper.readValue(new File(baseFile), Patients.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return patients;
    }

}