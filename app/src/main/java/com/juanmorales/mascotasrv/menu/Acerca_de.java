package com.juanmorales.mascotasrv.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.juanmorales.mascotasrv.R;

public class Acerca_de extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        //Incluyendo la barra a cada activitie
        //Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        //setSupportActionBar(miActionBar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar = (Toolbar)findViewById(R.id.toolbar);


        if (toolbar != null){
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
