package com.example.stepnext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ContinuePage extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6, button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_page);
        button1= findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(ContinuePage.this, AfterTenth.class);
                startActivity(categoryIntent);
                //finish();
            }
        });
        button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(ContinuePage.this, AfterTwelve.class);
                startActivity(categoryIntent);
                //finish();

            }
        });
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(ContinuePage.this, AfterGraduation.class);
                startActivity(categoryIntent);
                //finish();

            }
        });

        button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(ContinuePage.this, TalentExam.class);
                startActivity(categoryIntent);
               // finish();

            }
        });

        button5=findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(ContinuePage.this, OnlineClass.class);
                startActivity(categoryIntent);
                //finish();

            }
        });

        button6=findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(ContinuePage.this, Motivational_Video.class);
                startActivity(categoryIntent);
                //finish();

            }
        });

    }


}