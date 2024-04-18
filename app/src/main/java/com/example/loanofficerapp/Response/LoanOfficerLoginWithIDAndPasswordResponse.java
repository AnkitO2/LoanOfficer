package com.example.loanofficerapp.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoanOfficerLoginWithIDAndPasswordResponse {

    @SerializedName("LoanOfficerLoginWithIDAndPassword")
    @Expose
    private LoanOfficerLoginWithIDAndPassword loanOfficerLoginWithIDAndPassword;
    @SerializedName("LoginMessage")
    @Expose
    private String loginMessage;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Status")
    @Expose
    private Boolean status;


    public LoanOfficerLoginWithIDAndPassword getLoanOfficerLoginWithIDAndPassword() {
        return loanOfficerLoginWithIDAndPassword;
    }

    public void setLoanOfficerLoginWithIDAndPassword(LoanOfficerLoginWithIDAndPassword loanOfficerLoginWithIDAndPassword) {
        this.loanOfficerLoginWithIDAndPassword = loanOfficerLoginWithIDAndPassword;
    }


    public String getLoginMessage() {
        return loginMessage;
    }

    public void setLoginMessage(String loginMessage) {
        this.loginMessage = loginMessage;
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
