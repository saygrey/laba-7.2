package com.saygrey;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Test{
    Test(){}
    Test(String testdate, String testtype, String testaccuracy, String labid){
        this.testdate=testdate;
        this.testaccuracy=testaccuracy;
        this.testtype=testtype;
        this.labid=labid;

    }
    @JsonProperty("testdate")
    private String testdate;
    @JsonProperty("testtype")
    private String testtype;
    @JsonProperty("testaccuracy")
    private String testaccuracy;
    @JsonProperty("labid")
    private String labid;
}
