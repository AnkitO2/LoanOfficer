package com.example.loanofficerapp.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GroupLoanApplicationReportResponse {
    @SerializedName("GroupLoanApplicationReport")
    @Expose
    private List<GroupLoanApplicationReport> groupLoanApplicationReport;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Status")
    @Expose
    private Boolean status;

    public List<GroupLoanApplicationReport> getGroupLoanApplicationReport() {
        return groupLoanApplicationReport;
    }

    public void setGroupLoanApplicationReport(List<GroupLoanApplicationReport> groupLoanApplicationReport) {
        this.groupLoanApplicationReport = groupLoanApplicationReport;
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
