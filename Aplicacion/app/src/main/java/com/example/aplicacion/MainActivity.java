package com.example.aplicacion;

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

    public void VerMensaje(View view) {
        Toast.makeText(this, "Tulio estamos al aire :)", Toast.LENGTH_SHORT).show();

    }

    public void Saludar(View view) {
        Toast.makeText(this, "Hola", Toast.LENGTH_SHORT).show();
    }

    public void Ver (View view) {
        Intent i;
        i = new Intent(this,activity_vista.class);
        startActivity(i);

    }
}

