package com.example.loanofficerapp.Request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoanOfficerLoginWithIDAndPasswordRequest {
    @SerializedName("EmployeeId")
    @Expose
    private String employeeId;
    @SerializedName("Password")
    @Expose
    private String password;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
