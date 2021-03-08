package com.example.subject_choice.subject_choice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.subject_choice.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1, spinner2, spinner3, spinner4;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Subject Choice");

        addItemsOnSpinner2();
        addItemsOnSpinner3();
        addItemsOnSpinner4();
        addListenerOnButton();
        addListenerOnSpinnerItemSelection();
    }

    public void addItemsOnSpinner2() {
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add("Maths");
        list.add("Sociology");
        list.add("Geography");
        list.add("History");
        list.add("Physchology");
        list.add("Computer Science");
        list.add("Physics");
        list.add("Chemistry");
        list.add("Biology");
        list.add("Political Science");
        list.add("Fine arts");
        list.add("English");
        list.add("Hindi");
        list.add("Physical Education");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }

    public void addItemsOnSpinner3() {
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        List<String> list = new ArrayList<String>();
        list.add("Maths");
        list.add("Sociology");
        list.add("Geography");
        list.add("History");
        list.add("Physchology");
        list.add("Computer Science");
        list.add("Physics");
        list.add("Chemistry");
        list.add("Biology");
        list.add("Political Science");
        list.add("Fine arts");
        list.add("English");
        list.add("Hindi");
        list.add("Physical Education");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(dataAdapter);

    }

    public void addItemsOnSpinner4() {
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        List<String> list = new ArrayList<String>();
        list.add("Maths");
        list.add("Sociology");
        list.add("Geography");
        list.add("History");
        list.add("Physchology");
        list.add("Computer Science");
        list.add("Physics");
        list.add("Chemistry");
        list.add("Biology");
        list.add("Political Science");
        list.add("Fine arts");
        list.add("English");
        list.add("Hindi");
        list.add("Physical Education");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(dataAdapter);
    }

    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    public void addListenerOnButton() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner4 = (Spinner) findViewById(R.id.spinner4);

    }

    public void btn_CareerOpportunity(View view) {
             startActivity(new Intent(getApplicationContext(), CareerOpportunity.class));
    }
}