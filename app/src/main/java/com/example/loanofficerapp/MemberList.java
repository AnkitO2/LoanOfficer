package com.example.loanofficerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.loanofficerapp.Request.MemberRegistrationListRequest;
import com.example.loanofficerapp.Response.MemberRegistrationList;
import com.example.loanofficerapp.Response.MemberRegistrationListResponse;
import com.example.loanofficerapp.Retrofit.RetrofitClient;
import com.example.loanofficerapp.databinding.ListMemberBinding;
import com.google.android.material.navigation.NavigationView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MemberList extends AppCompatActivity {
    SharedPreferences sharedPreferences;
private ListMemberBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ListMemberBinding.inflate(getLayoutInflater());
        sharedPreferences =getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);

        memberList();
        setContentView(binding.getRoot());

        binding.menuIcon.setOnClickListener(v -> {
            binding.drawerLayout1.openDrawer(GravityCompat.START);
        });
        binding.navigationView1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.Loan1) {
                    Intent intent = new Intent(MemberList.this,HomeActivity.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan2) {
                    Intent intent = new Intent(MemberList.this, MemberRegistration.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan3) {
                    Intent intent = new Intent(MemberList.this,MemberDashboard.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan4) {
                    Intent intent = new Intent(MemberList.this,RepaymentList.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan5) {
                    Intent intent = new Intent(MemberList.this,LoginActivity.class);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("loginStatus", "");
                    editor.apply();
                    startActivity(intent);
                }return true; // Return true to indicate that the item click is handled
            }
        });
    }

    void memberList(){
        MemberRegistrationListRequest request =new MemberRegistrationListRequest();
        request.setEmployeeId(getIntent().getStringExtra("employeeId"));
        request.setTokenString(getIntent().getStringExtra("token"));
        request.setFromDate("null");
        request.setToDate("null");

        RetrofitClient.getClient().memberList(request).enqueue(new Callback<MemberRegistrationListResponse>() {
            @Override
            public void onResponse(Call<MemberRegistrationListResponse> call, Response<MemberRegistrationListResponse> response) {
                if (response.body().getMessage().equalsIgnoreCase("Successful")){
                    Log.d("Response", "Body: " + response.body().toString());
                    List<MemberRegistrationList>list = response.body().getMemberRegistrationList();
                    if (list.size()>0){
                        binding.recyclerview.setLayoutManager(new LinearLayoutManager(MemberList.this, RecyclerView.VERTICAL,false));
                        binding.recyclerview.setAdapter(new MemberListAdapter(list ,MemberList.this));
                    }

                }else {
                    Toast.makeText(MemberList.this, "response is not successfully", Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(MemberList.this,LoginActivity.class);
                    startActivity(intent);
                }
            }
            @Override
            public void onFailure(Call<MemberRegistrationListResponse> call, Throwable t) {
                Toast.makeText(MemberList.this, "Something went wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}