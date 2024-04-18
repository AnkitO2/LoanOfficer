package com.example.loanofficerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.example.loanofficerapp.Request.LoanOfficerLoginWithIDAndPasswordRequest;
import com.example.loanofficerapp.Response.LoanOfficerLoginWithIDAndPasswordResponse;
import com.example.loanofficerapp.Retrofit.RetrofitClient;
import com.example.loanofficerapp.databinding.ActivityLoginBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    SharedPreferences sharedPreferences;
    String loanOfficerid ="", password ="" , token="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        sharedPreferences =getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);

        binding.loginBtn.setOnClickListener( v -> {
            if (binding.usernameInputEditText.getText().toString().isEmpty()){
                Toast.makeText(this, "Please enter User Id", Toast.LENGTH_SHORT).show();
            } else if (binding.passwordInputEditText.getText().toString().isEmpty()) {
                Toast.makeText(this, "please enter password", Toast.LENGTH_SHORT).show();
            }
            else {
                userLogin();
            }
        });
    }
void userLogin(){
    LoanOfficerLoginWithIDAndPasswordRequest request = new LoanOfficerLoginWithIDAndPasswordRequest();
    request.setLoanOfficerid(binding.usernameInputEditText.getText().toString());
    request.setPassword(binding.passwordInputEditText.getText().toString());
    RetrofitClient.getClient().LoginIdAndPassword(request).enqueue(new Callback<LoanOfficerLoginWithIDAndPasswordResponse>() {
        @Override
        public void onResponse(Call<LoanOfficerLoginWithIDAndPasswordResponse> call, Response<LoanOfficerLoginWithIDAndPasswordResponse> response) {
        if (response.body().getLoginMessage().equalsIgnoreCase("LoanOfficer Login Successfull")){
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("loginStatus", response.body().getLoginMessage());
            editor.apply();
            Toast.makeText(LoginActivity.this,""+response.body().getLoginMessage(),Toast.LENGTH_SHORT).show();

            SharedPreferences.Editor  loanOfficerid= sharedPreferences.edit(); // Corrected variable name
            loanOfficerid.putString("loanOfficerid", response.body().getLoanOfficerLoginWithIDAndPassword().getLoanOfficerid());
            loanOfficerid.apply();

            SharedPreferences.Editor token = sharedPreferences.edit();
            token.putString("token", response.body().getLoanOfficerLoginWithIDAndPassword().getTokenString());
            token.apply();

            Toast.makeText(LoginActivity.this, ""+response.body().getLoanOfficerLoginWithIDAndPassword().getLoanOfficerid(), Toast.LENGTH_SHORT).show();
            Intent intent =  new Intent(LoginActivity.this,MemberDashboard.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(LoginActivity.this,"response is not successfully"+response.body().getLoginMessage(),Toast.LENGTH_SHORT).show();
        }

        }
        @Override
        public void onFailure(Call<LoanOfficerLoginWithIDAndPasswordResponse> call, Throwable t) {
            Toast.makeText(LoginActivity.this,"Something went wrong",Toast.LENGTH_SHORT).show();
        }
    });
   }
}