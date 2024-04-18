package com.example.loanofficerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.loanofficerapp.databinding.ListRepaymentBinding;

public class RepaymentList extends AppCompatActivity {
    SharedPreferences sharedPreferences;
private ListRepaymentBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ListRepaymentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}