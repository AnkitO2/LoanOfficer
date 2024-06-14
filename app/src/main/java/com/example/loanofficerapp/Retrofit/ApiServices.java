package com.example.loanofficerapp.Retrofit;
import com.example.loanofficerapp.Request.GroupLoanApplicationReportRequest;
import com.example.loanofficerapp.Request.LoanOfficerHomePageAndDashboardRequest;
import com.example.loanofficerapp.Request.LoanOfficerLoginWithIDAndPasswordRequest;
import com.example.loanofficerapp.Request.MemberRegistrationListRequest;
import com.example.loanofficerapp.Response.GroupLoanApplicationReportResponse;
import com.example.loanofficerapp.Response.LoanOfficerHomePageAndDashboardResponse;
import com.example.loanofficerapp.Response.LoanOfficerLoginWithIDAndPasswordResponse;
import com.example.loanofficerapp.Response.MemberRegistrationListResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiServices {
 @POST("Service/LoanOfficerLoginWithIDAndPassword")
 Call<LoanOfficerLoginWithIDAndPasswordResponse>LoginIdAndPassword(@Body LoanOfficerLoginWithIDAndPasswordRequest loanOfficerLoginWithIDAndPasswordRequest);

 @POST("Service/LoanOfficerHomePageAndDashboard")
 Call<LoanOfficerHomePageAndDashboardResponse>Dashboard(@Body LoanOfficerHomePageAndDashboardRequest loanOfficerHomePageAndDashboardRequest);

 @POST("Service/MemberRegistrationList")
 Call<MemberRegistrationListResponse>memberList(@Body MemberRegistrationListRequest memberRegistrationListRequest);

@POST("Service/GroupLoanApplicationReport")
 Call<GroupLoanApplicationReportResponse>reportList(@Body GroupLoanApplicationReportRequest groupLoanApplicationReportRequest);
}