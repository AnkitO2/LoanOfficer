package com.example.loanofficerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;


import com.example.loanofficerapp.Request.LoanOfficerHomePageAndDashboardRequest;
import com.example.loanofficerapp.Response.LoanOfficerHomePageAndDashboardResponse;
import com.example.loanofficerapp.Response.MemberRegistrationList;
import com.example.loanofficerapp.Retrofit.RetrofitClient;
import com.example.loanofficerapp.databinding.ActivityHomeBinding;
import com.google.android.material.navigation.NavigationView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        sharedPreferences =getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        homePage();
        setContentView(binding.getRoot());
        binding.menuIcon.setOnClickListener(v -> {
            binding.drawerLayout1.openDrawer(GravityCompat.START);
        });

        binding.navigationView1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.Loan1) {
                    Intent intent = new Intent(HomeActivity.this,MemberDashboard.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan2) {
                    Intent intent = new Intent(HomeActivity.this, MemberRegistrationList.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan3) {
                    Intent intent = new Intent(HomeActivity.this, MemberList.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan4) {
                    Intent intent = new Intent(HomeActivity.this,RepaymentList.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan5) {
                    Intent intent = new Intent(HomeActivity.this,LoginActivity.class);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("loginStatus", "");
                    editor.apply();
                    startActivity(intent);
                }return true;
            }
        });
    }

void homePage(){
    LoanOfficerHomePageAndDashboardRequest request =  new LoanOfficerHomePageAndDashboardRequest();
    request.setemployeeId(getIntent().getStringExtra("employeeId"));
    request.setTokenString(getIntent().getStringExtra("token"));
    RetrofitClient.getClient().Dashboard(request).enqueue(new Callback<LoanOfficerHomePageAndDashboardResponse>() {
        @Override
        public void onResponse(Call<LoanOfficerHomePageAndDashboardResponse> call, Response<LoanOfficerHomePageAndDashboardResponse> response) {
        if (response.body().getMessage().equalsIgnoreCase("Successful")){
            Log.d("Response", "Body: " + response.body().toString());
           binding.homeData1.setText(response.body().getMessage());
           binding.home1.setText(response.body().getLoanOfficerHomePageAndDashboard().getAadharNo());
           binding.home2.setText(response.body().getLoanOfficerHomePageAndDashboard().getContactNo());
           binding.home3.setText(response.body().getLoanOfficerHomePageAndDashboard().getDob());
           binding.home4.setText(response.body().getLoanOfficerHomePageAndDashboard().getDepartmentName());
           binding.home5.setText(response.body().getLoanOfficerHomePageAndDashboard().getEmailId());
           binding.home6.setText(response.body().getLoanOfficerHomePageAndDashboard().getEmpJoinDate());
           binding.home7.setText(response.body().getLoanOfficerHomePageAndDashboard().getEmployeeId());
           binding.home8.setText(response.body().getLoanOfficerHomePageAndDashboard().getEmployeeName());
           binding.home9.setText(response.body().getLoanOfficerHomePageAndDashboard().getEmployeeType());
           binding.home10.setText(response.body().getLoanOfficerHomePageAndDashboard().getFinYear());
           binding.home11.setText(response.body().getLoanOfficerHomePageAndDashboard().getGender());
           binding.home12.setText(response.body().getLoanOfficerHomePageAndDashboard().getGuardianName());
           binding.home13.setText(response.body().getLoanOfficerHomePageAndDashboard().getIdType());
           binding.home14.setText(response.body().getLoanOfficerHomePageAndDashboard().getMarital());
           binding.home15.setText(response.body().getLoanOfficerHomePageAndDashboard().getMobileNo());
           binding.home16.setText(response.body().getLoanOfficerHomePageAndDashboard().getQualification());
           binding.home17.setText(response.body().getLoanOfficerHomePageAndDashboard().getReligion());

        } else {
            Intent intent = new Intent(HomeActivity.this,LoginActivity.class);
            startActivity(intent);
        }
        }
        @Override
        public void onFailure(Call<LoanOfficerHomePageAndDashboardResponse> call, Throwable t) {
            Toast.makeText(HomeActivity.this,"Something went wrong",Toast.LENGTH_SHORT).show();
        }
    });
  }
}