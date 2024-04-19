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

import com.example.loanofficerapp.Request.LoanOfficerHomeHomePageAndDashboardRequest;
import com.example.loanofficerapp.Response.LoanOfficerHomeHomePageAndDashboardResponse;
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
                    intent.putExtra("loanOfficerid",""+sharedPreferences.getString("loanOfficerid",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan2) {
                    Intent intent = new Intent(HomeActivity.this,MemberRequest.class);
                    intent.putExtra("loanOfficerid",""+sharedPreferences.getString("loanOfficerid",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan3) {
                    Intent intent = new Intent(HomeActivity.this,MemberList.class);
                    intent.putExtra("loanOfficerid",""+sharedPreferences.getString("loanOfficerid",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan4) {
                    Intent intent = new Intent(HomeActivity.this,RepaymentList.class);
                    intent.putExtra("loanOfficerid",""+sharedPreferences.getString("loanOfficerid",""));
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
    LoanOfficerHomeHomePageAndDashboardRequest request =  new LoanOfficerHomeHomePageAndDashboardRequest();
    request.setLoanOfficerid(getIntent().getStringExtra("loanOfficerid"));
    request.setTokenString(getIntent().getStringExtra("token"));

    RetrofitClient.getClient().Dashboard(request).enqueue(new Callback<LoanOfficerHomeHomePageAndDashboardResponse>() {
        @Override
        public void onResponse(Call<LoanOfficerHomeHomePageAndDashboardResponse> call, Response<LoanOfficerHomeHomePageAndDashboardResponse> response) {
        if (response.body().getMessage().equalsIgnoreCase("Successful")){
            Log.d("Response", "Body: " + response.body().toString());
           binding.homeData1.setText(response.body().getMessage());
           binding.home1.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getAadharNo());
           binding.home2.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getContactNo());
           binding.home3.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getDob());
           binding.home4.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getDepartmentName());
           binding.home5.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getDesignationName());
           binding.home6.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getEmailId());
           binding.home7.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getEmpJoinDate());
           binding.home8.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getEmployeeId());
           binding.home9.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getEmployeeName());
           binding.home10.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getEmployeeNo());
           binding.home11.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getEmployeeType());
           binding.home12.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getFinYear());
           binding.home13.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getGender());
           binding.home14.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getGuardianName());
           binding.home15.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getIdType());
           binding.home16.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getMarital());
           binding.home17.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getMobileNo());
           binding.home18.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getQualification());
           binding.home19.setText(response.body().getLoanOfficerHomeHomePageAndDashboard().getReligion());
        } else {
            Intent intent = new Intent(HomeActivity.this,LoginActivity.class);
            startActivity(intent);
        }

        }
        @Override
        public void onFailure(Call<LoanOfficerHomeHomePageAndDashboardResponse> call, Throwable t) {
            Toast.makeText(HomeActivity.this,"Something went wrong",Toast.LENGTH_SHORT).show();
        }
    });
  }
}