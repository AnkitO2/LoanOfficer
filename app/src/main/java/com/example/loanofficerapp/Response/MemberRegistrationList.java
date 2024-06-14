package com.example.loanofficerapp.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MemberRegistrationList {
    @SerializedName("Age")
    @Expose
    private String age;
    @SerializedName("BranchName")
    @Expose
    private String branchName;
    @SerializedName("DOB")
    @Expose
    private String dob;
    @SerializedName("Gender")
    @Expose
    private String gender;
    @SerializedName("GroupOfficerName")
    @Expose
    private String groupOfficerName;
    @SerializedName("GuardianName")
    @Expose
    private String guardianName;
    @SerializedName("MemberFormNo")
    @Expose
    private String memberFormNo;
    @SerializedName("MemberId")
    @Expose
    private String memberId;
    @SerializedName("MemberJoinDate")
    @Expose
    private String memberJoinDate;
    @SerializedName("MemberProfileStatus")
    @Expose
    private String memberProfileStatus;
    @SerializedName("MobileNo")
    @Expose
    private String mobileNo;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGroupOfficerName() {
        return groupOfficerName;
    }

    public void setGroupOfficerName(String groupOfficerName) {
        this.groupOfficerName = groupOfficerName;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getMemberFormNo() {
        return memberFormNo;
    }

    public void setMemberFormNo(String memberFormNo) {
        this.memberFormNo = memberFormNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberJoinDate() {
        return memberJoinDate;
    }

    public void setMemberJoinDate(String memberJoinDate) {
        this.memberJoinDate = memberJoinDate;
    }

    public String getMemberProfileStatus() {
        return memberProfileStatus;
    }

    public void setMemberProfileStatus(String memberProfileStatus) {
        this.memberProfileStatus = memberProfileStatus;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

}
