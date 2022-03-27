package com.example.quizapp_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etLogin,etPassword;
    Button bLogin;
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLogin = (EditText) findViewById(R.id.etLogin);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        tvRegister = (TextView) findViewById(R.id.tvRegister);

        bLogin.setOnClickListener(view -> {
            if (etLogin.getText().toString().equals("toto")&& etPassword.getText().toString().equals("toto")){
                startActivity(new Intent(MainActivity.this,Quiz1.class));
            }
            else{
                Toast.makeText(getApplicationContext(),"login or password incorrect ",Toast.LENGTH_SHORT).show();
            }

        }
        );

        tvRegister.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,Quiz1.class)));
    }
}