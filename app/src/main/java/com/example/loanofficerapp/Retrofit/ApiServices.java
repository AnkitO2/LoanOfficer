package com.example.loanofficerapp.Retrofit;
import com.example.loanofficerapp.Request.LoanOfficerLoginWithIDAndPasswordRequest;
import com.example.loanofficerapp.Response.LoanOfficerLoginWithIDAndPasswordResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiServices {

@POST("Service/LoanOfficerLoginWithIDAndPassword")
Call<LoanOfficerLoginWithIDAndPasswordResponse>LoginIdAndPassword(@Body LoanOfficerLoginWithIDAndPasswordRequest loanOfficerLoginWithIDAndPasswordRequest);

}