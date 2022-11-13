package com.example.turismo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verCaba_as (View view){
        Intent i = new Intent(this,Caba_aActivity.class);
        startActivity(i);
    }

    public void verSauna (View view){
        Intent i = new Intent(this,SaunaActivity.class);
        startActivity(i);
    }

    public void verTrekking (View view){
        Intent i = new Intent(this,TrekkingActiviy.class);
        startActivity(i);
    }

    public void verCanopy (View view){
        Intent i = new Intent(this,CanopyActivity.class);
        startActivity(i);
    }

}