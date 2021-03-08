package com.example.subject_choice.subject_choice;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.subject_choice.R;

public class CareerOpportunity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_careeropportunity);
        getSupportActionBar().setTitle("Career Opportunities");
    }
}