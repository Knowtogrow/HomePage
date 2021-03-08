package com.example.asktheexpert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class expert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expert);
    }
    public void btn_science(View view) {
        startActivity(new Intent(getApplicationContext(), AskTheExpert.class));
    }
    public void btn_stats(View view) {
        startActivity(new Intent(getApplicationContext(), AskTheExpert.class));
    }
    public void btn_lang(View view) {
        startActivity(new Intent(getApplicationContext(), AskTheExpert.class));
    }
    public void btn_human(View view) {
        startActivity(new Intent(getApplicationContext(), AskTheExpert.class));
    }

}
