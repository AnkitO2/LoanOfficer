package com.example.loanofficerapp.Response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MemberRegistrationListResponse {
    @SerializedName("MemberRegistrationList")
    @Expose
    private List<MemberRegistrationList> memberRegistrationList;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Status")
    @Expose
    private Boolean status;

    public List<MemberRegistrationList> getMemberRegistrationList() {
        return memberRegistrationList;
    }

    public void setMemberRegistrationList(List<MemberRegistrationList> memberRegistrationList) {
        this.memberRegistrationList = memberRegistrationList;
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
