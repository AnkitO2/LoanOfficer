package com.example.loanofficerapp.Request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoanOfficerLoginWithIDAndPasswordRequest {

    @SerializedName("LoanOfficerid")
    @Expose
    private String loanOfficerid;
    @SerializedName("Password")
    @Expose
    private String password;

    public String getLoanOfficerid() {
        return loanOfficerid;
    }

    public void setLoanOfficerid(String loanOfficerid) {
        this.loanOfficerid = loanOfficerid;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
