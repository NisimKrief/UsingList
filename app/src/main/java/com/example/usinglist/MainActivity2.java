package com.example.usinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    Intent gi = getIntent();
    double num = gi.getDoubleExtra("firstnumber", 0);
    double kfitza = gi.getDoubleExtra("kofetznumber", 0);
    // boolean MathOrGeo = gi.getBooleanExtra("MathOrGeo", false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}