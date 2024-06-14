package com.example.loanofficerapp.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GroupLoanApplicationReport {
    @SerializedName("ApplicationAmount")
    @Expose
    private String applicationAmount;
    @SerializedName("ApplicationDate")
    @Expose
    private String applicationDate;
    @SerializedName("ApplicationId")
    @Expose
    private String applicationId;
    @SerializedName("BranchName")
    @Expose
    private String branchName;
    @SerializedName("CenterName")
    @Expose
    private String centerName;
    @SerializedName("GLoanTypeNo")
    @Expose
    private String gLoanTypeNo;
    @SerializedName("GroupName")
    @Expose
    private String groupName;
    @SerializedName("InterestMethod")
    @Expose
    private String interestMethod;
    @SerializedName("InterestRate")
    @Expose
    private String interestRate;
    @SerializedName("LoanCycle")
    @Expose
    private String loanCycle;
    @SerializedName("LoanFunder")
    @Expose
    private String loanFunder;
    @SerializedName("LoanId")
    @Expose
    private String loanId;
    @SerializedName("LoanOfficerName")
    @Expose
    private String loanOfficerName;
    @SerializedName("LoanPurpose")
    @Expose
    private String loanPurpose;
    @SerializedName("LoanStatus")
    @Expose
    private String loanStatus;
    @SerializedName("LoanTerm")
    @Expose
    private String loanTerm;
    @SerializedName("MemberId")
    @Expose
    private String memberId;
    @SerializedName("MemberName")
    @Expose
    private String memberName;

    public String getApplicationAmount() {
        return applicationAmount;
    }

    public void setApplicationAmount(String applicationAmount) {
        this.applicationAmount = applicationAmount;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getGLoanTypeNo() {
        return gLoanTypeNo;
    }

    public void setGLoanTypeNo(String gLoanTypeNo) {
        this.gLoanTypeNo = gLoanTypeNo;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getInterestMethod() {
        return interestMethod;
    }

    public void setInterestMethod(String interestMethod) {
        this.interestMethod = interestMethod;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getLoanCycle() {
        return loanCycle;
    }

    public void setLoanCycle(String loanCycle) {
        this.loanCycle = loanCycle;
    }

    public String getLoanFunder() {
        return loanFunder;
    }

    public void setLoanFunder(String loanFunder) {
        this.loanFunder = loanFunder;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getLoanOfficerName() {
        return loanOfficerName;
    }

    public void setLoanOfficerName(String loanOfficerName) {
        this.loanOfficerName = loanOfficerName;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public String getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

}
