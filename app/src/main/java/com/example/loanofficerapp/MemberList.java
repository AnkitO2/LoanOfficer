package com.example.loanofficerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.loanofficerapp.databinding.ListMemberBinding;

public class MemberList extends AppCompatActivity {
    SharedPreferences sharedPreferences;
private ListMemberBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ListMemberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        sharedPreferences =getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
    }
}