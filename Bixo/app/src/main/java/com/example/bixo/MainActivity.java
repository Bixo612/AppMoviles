package com.example.bixo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verCabanna(View view){
        //Toast.makeText(this, "Promocion 1: cabaña a 50%", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,CabannaActivity.class);
        startActivity(i);
    }

    public void verPiscina(View view){
        //Toast.makeText(this, "Promocion 1: cabaña a 50%", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,PiscinaActivity.class);
        startActivity(i);
    }
}