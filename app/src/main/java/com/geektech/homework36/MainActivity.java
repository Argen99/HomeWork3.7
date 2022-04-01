package com.geektech.homework36;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geektech.homework36.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(binding.container1.getId(), new FirstFragment()).commit();
            getSupportFragmentManager().beginTransaction().add(binding.container2.getId(), new SecondFragment()).commit();
        }
    }
}