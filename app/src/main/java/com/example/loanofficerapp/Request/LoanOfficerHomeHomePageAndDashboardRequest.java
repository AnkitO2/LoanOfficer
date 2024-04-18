package com.example.loanofficerapp.Request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoanOfficerHomeHomePageAndDashboardRequest {

    @SerializedName("LoanOfficerid")
    @Expose
    private String loanOfficerid;
    @SerializedName("TokenString")
    @Expose
    private String tokenString;

    public String getLoanOfficerid() {
        return loanOfficerid;
    }

    public void setLoanOfficerid(String loanOfficerid) {
        this.loanOfficerid = loanOfficerid;
    }

    public String getTokenString() {
        return tokenString;
    }

    public void setTokenString(String tokenString) {
        this.tokenString = tokenString;
    }
}
