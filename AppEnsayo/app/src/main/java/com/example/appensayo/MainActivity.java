package com.example.appensayo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void obiwan(View view) {
        Toast.makeText(this, "Hello there :)", Toast.LENGTH_SHORT).show();
    }

    public void general(View view) {
        Toast.makeText(this, "General Kenobi!", Toast.LENGTH_SHORT).show();
    }
}