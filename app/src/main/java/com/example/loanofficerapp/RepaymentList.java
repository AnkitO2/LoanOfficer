package com.example.loanofficerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.loanofficerapp.databinding.ListRepaymentBinding;
import com.google.android.material.navigation.NavigationView;

public class RepaymentList extends AppCompatActivity {
    SharedPreferences sharedPreferences;
private ListRepaymentBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ListRepaymentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        sharedPreferences =getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);

        binding.menuIcon.setOnClickListener(v -> {
            binding.drawerLayout1.openDrawer(GravityCompat.START);
        });

        binding.navigationView1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == R.id.Loan1) {
                    Intent intent = new Intent(RepaymentList.this,MemberRequest.class);
                    intent.putExtra("loanOfficerid",""+sharedPreferences.getString("loanOfficerid",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);

                } else if (itemId == R.id.Loan2) {
                    Intent intent = new Intent(RepaymentList.this,MemberList.class);
                    intent.putExtra("loanOfficerid",""+sharedPreferences.getString("loanOfficerid",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);

                } else if (itemId == R.id.Loan3) {
                    Intent intent = new Intent(RepaymentList.this,MemberDashboard.class);
                    intent.putExtra("loanOfficerid",""+sharedPreferences.getString("loanOfficerid",""));
                    intent.putExtra("token",""+sharedPreferences.getString("token",""));
                    startActivity(intent);

                }else if (itemId == R.id.Loan4) {
                    Intent intent = new Intent(RepaymentList.this,LoginActivity.class);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("loginStatus", "");
                    editor.apply();
                    startActivity(intent);
                }
                return true; // Return true to indicate that the item click is handled
            }
        });
    }
}