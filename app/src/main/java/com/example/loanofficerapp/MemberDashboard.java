package com.example.loanofficerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.loanofficerapp.databinding.MemberDashboardBinding;
import com.google.android.material.navigation.NavigationView;

public class MemberDashboard extends AppCompatActivity {
private MemberDashboardBinding binding;
SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MemberDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        sharedPreferences =getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);

        binding.memberId.setText(sharedPreferences.getString("employeeId",""));
        binding.tokenId.setText(sharedPreferences.getString("token",""));

        binding.menuIcon.setOnClickListener(v -> {
            binding.drawerLayout1.openDrawer(GravityCompat.START);
        });

        binding.navigationView1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.Loan1) {
                    Intent intent = new Intent(MemberDashboard.this,HomeActivity.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan2) {
                    Intent intent = new Intent(MemberDashboard.this,MemberRequest.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan3) {
                    Intent intent = new Intent(MemberDashboard.this, MemberRegistrationList.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan4) {
                    Intent intent = new Intent(MemberDashboard.this,RepaymentList.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);
                } else if (itemId == R.id.Loan5) {
                    Intent intent = new Intent(MemberDashboard.this,LoginActivity.class);
                    intent.putExtra("employeeId",""+sharedPreferences.getString("employeeId",""));
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("loginStatus", "");
                    editor.apply();
                    startActivity(intent);
                }return true;
            }
        });
    }
}