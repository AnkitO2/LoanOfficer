package com.example.loanofficerapp.Request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GroupLoanApplicationReportRequest {
    @SerializedName("EmployeeId")
    @Expose
    private String employeeId;
    @SerializedName("FromDate")
    @Expose
    private String fromDate;
    @SerializedName("SearchId")
    @Expose
    private String searchId;
    @SerializedName("ToDate")
    @Expose
    private String toDate;
    @SerializedName("TokenString")
    @Expose
    private String tokenString;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getTokenString() {
        return tokenString;
    }

    public void setTokenString(String tokenString) {
        this.tokenString = tokenString;
    }
}
