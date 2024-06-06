package com.example.loanofficerapp.Request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoanOfficerHomePageAndDashboardRequest {
    @SerializedName("EmployeeId")
    @Expose
    private String employeeId;
    @SerializedName("TokenString")
    @Expose
    private String tokenString;

    public String getemployeeId() {
        return employeeId;
    }

    public void setemployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTokenString() {
        return tokenString;
    }

    public void setTokenString(String tokenString) {
        this.tokenString = tokenString;
    }

}
