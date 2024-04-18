package com.example.loanofficerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.loanofficerapp.databinding.RequestMemberBinding;

public class MemberRequest extends AppCompatActivity {
    SharedPreferences sharedPreferences;
private RequestMemberBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = RequestMemberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        sharedPreferences =getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);


    }
}