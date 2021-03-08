package com.example.aptitudetest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Questions extends AppCompatActivity {

    private questionslib mQuestionsLibrary = new questionslib();

    private TextView mQuestionsView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        getSupportActionBar().setTitle("Aptitude Test");



        mQuestionsView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.button1);
        mButtonChoice2 = (Button) findViewById(R.id.button2);
        mButtonChoice3 = (Button) findViewById(R.id.button3);
        mButtonChoice4 = (Button) findViewById(R.id.button4);



        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateQuestion();
            }

        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateQuestion();
            }

        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateQuestion();
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateQuestion();
            }

        });
    }

    private void updateQuestion() {
        mQuestionsView.setText(mQuestionsLibrary.getQuestions(mQuestionNumber));
        mButtonChoice1.setText(mQuestionsLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionsLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionsLibrary.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mQuestionsLibrary.getChoice4(mQuestionNumber));
        mQuestionNumber++;
    }

}
