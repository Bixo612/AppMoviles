package com.example.turismo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Caba_aActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caba_aactivity);
    }

    public void volverInicio(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}