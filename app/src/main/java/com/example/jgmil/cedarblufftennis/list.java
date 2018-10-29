package com.example.jgmil.cedarblufftennis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class list extends AppCompatActivity {


    String[] items = {"Item 1", "Item 2"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
}