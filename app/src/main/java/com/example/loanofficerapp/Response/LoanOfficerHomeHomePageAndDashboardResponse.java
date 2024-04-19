package com.example.loanofficerapp.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoanOfficerHomeHomePageAndDashboardResponse {
    @SerializedName("LoanOfficerHomeHomePageAndDashboard")
    @Expose
    private LoanOfficerHomeHomePageAndDashboard loanOfficerHomeHomePageAndDashboard;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Status")
    @Expose
    private Boolean status;

    public LoanOfficerHomeHomePageAndDashboard getLoanOfficerHomeHomePageAndDashboard() {
        return loanOfficerHomeHomePageAndDashboard;
    }

    public void setLoanOfficerHomeHomePageAndDashboard(LoanOfficerHomeHomePageAndDashboard loanOfficerHomeHomePageAndDashboard) {
        this.loanOfficerHomeHomePageAndDashboard = loanOfficerHomeHomePageAndDashboard;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
