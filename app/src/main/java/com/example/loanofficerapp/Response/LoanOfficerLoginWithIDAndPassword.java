package com.example.loanofficerapp.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoanOfficerLoginWithIDAndPassword {

    @SerializedName("LoanOfficerid")
    @Expose
    private String loanOfficerid;

    @SerializedName("TokenString")
    @Expose
    private String tokenString;


    public String getLoanOfficerid() {return loanOfficerid;}

    public void setLoanOfficerid(String loanOfficerid) {this.loanOfficerid = loanOfficerid;}


    public String getTokenString() {return tokenString;}

    public void setTokenString(String tokenString) {this.tokenString = tokenString;}



}
