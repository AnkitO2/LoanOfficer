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

import com.example.loanofficerapp.Request.GroupLoanApplicationReportRequest;
import com.example.loanofficerapp.Response.GroupLoanApplicationReportResponse;
import com.example.loanofficerapp.Response.MemberRegistrationList;
import com.example.loanofficerapp.Retrofit.RetrofitClient;
import com.example.loanofficerapp.databinding.ReportApplicationBinding;
import com.google.android.material.navigation.NavigationView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApplicationReport extends AppCompatActivity {
ReportApplicationBinding binding;
SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ReportApplicationBinding.inflate(getLayoutInflater());
        sharedPreferences =getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        setContentView(binding.getRoot());

        binding.menuIcon.setOnClickListener(v -> {
            binding.drawerLayout1.openDrawer(GravityCompat.START);
        });

        binding.navigationView1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.Loan1) {
                    Intent intent = new Intent(ApplicationReport.this,MemberDashboard.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan2) {
                    Intent intent = new Intent(ApplicationReport.this, MemberRegistrationList.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan3) {
                    Intent intent = new Intent(ApplicationReport.this, MemberList.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan4) {
                    Intent intent = new Intent(ApplicationReport.this,RepaymentList.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan5) {
                    Intent intent = new Intent(ApplicationReport.this,LoginActivity.class);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("loginStatus", "");
                    editor.apply();
                    startActivity(intent);
                }return true;
            }
        });
    }
    void applicationReport(){
        GroupLoanApplicationReportRequest request = new GroupLoanApplicationReportRequest();
        request.setEmployeeId(getIntent().getStringExtra("employeeId"));
        request.setTokenString(getIntent().getStringExtra("token"));
        request.setSearchId("");
        request.setFromDate("");
        request.setToDate("");
        RetrofitClient.getClient().reportList(request).enqueue(new Callback<GroupLoanApplicationReportResponse>() {
            @Override
            public void onResponse(Call<GroupLoanApplicationReportResponse> call, Response<GroupLoanApplicationReportResponse> response) {
                if (response.body().getMessage().equalsIgnoreCase("Successful")){
                    Log.d("Response", "Body: " + response.body().toString());


                }else {
                    Toast.makeText(ApplicationReport.this, "response is not successfully", Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(ApplicationReport.this,LoginActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onFailure(Call<GroupLoanApplicationReportResponse> call, Throwable t) {
                Toast.makeText(ApplicationReport.this,"Something went wrong",Toast.LENGTH_SHORT).show();
            }
        });
    }
}