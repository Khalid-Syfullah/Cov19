package com.ece.cov19.DataModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashBoardNumberModel {
    @SerializedName("numberOfDonors")
    @Expose
    private String numberOfDonors;

    @SerializedName("numberOfPatients")
    @Expose
    private String numberOfPatients;

    @SerializedName("numberOfMyPatients")
    @Expose
    private String numberOfMyPatients;


    @SerializedName("numberOfRequests")
    @Expose
    private String numberOfRequests;

    @SerializedName("numberOfResponses")
    @Expose
    private String numberOfResponses;

    @SerializedName("eligibility")
    @Expose
    private String eligibility;
    @SerializedName("lastdate")
    @Expose
    private String lastdate;

    @SerializedName("serverMsg")
    @Expose
    private String serverMsg;

    public String getNumberOfMyPatients() {
        return numberOfMyPatients;
    }

    public String getNumberOfDonors() {
        return numberOfDonors;
    }

    public String getNumberOfPatients() {
        return numberOfPatients;
    }

    public String getNumberOfRequests() {
        return numberOfRequests;
    }

    public String getNumberOfResponses() {
        return numberOfResponses;
    }

    public String getEligibility() {
        return eligibility;
    }

    public String getLastdate() {
        return lastdate;
    }

    public String getServerMsg() {
        return serverMsg;
    }
}
