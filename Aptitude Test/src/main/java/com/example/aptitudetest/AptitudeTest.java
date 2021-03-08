package com.example.aptitudetest;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AptitudeTest extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude_test);
        getSupportActionBar().setTitle("Aptitude Test");

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AptitudeTest.this, Questions.class);
                startActivity(intent);
            }
        });
    }
}
