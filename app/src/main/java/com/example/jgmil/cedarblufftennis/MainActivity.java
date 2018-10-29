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


public class MainActivity extends AppCompatActivity {


    private EditText inputName;
    private EditText inputPassword;
    private Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        inputName = findViewById(R.id.inputUser);
        inputPassword = findViewById(R.id.inputPassword);
        loginButton = findViewById(R.id.Login);

        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                validateUser(inputName.getText().toString(), inputPassword.getText().toString());

            }//end onClick

        });

    }//end onCreate


    private void validateUser(String userName, String password){

        if(userName.equalsIgnoreCase("John") && password.equalsIgnoreCase("1234")){
            Intent intent = new Intent(MainActivity.this, NewActivity.class);
            startActivity(intent);
        }else{

            Toast.makeText(this, "Incorrect username or password.", Toast.LENGTH_LONG).show();

        }


    }//end validateUser


}
