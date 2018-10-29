package com.example.jgmil.cedarblufftennis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.design.widget.Snackbar;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {


    private Button myLesson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        myLesson = findViewById(R.id.lessonTime);

        myLesson.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(NewActivity.this, MyLesson.class);
                startActivity(intent);*/
            }//end onClick

        });

    }//end onCreate


}