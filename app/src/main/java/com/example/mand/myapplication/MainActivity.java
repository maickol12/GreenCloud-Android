package com.example.mand.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import cherubs.cherubsActivity;


public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbarGen);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        toolbar.setTitle("Variedades");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        return true;
    }

    //METODO PARA CAMBIAR DE ACTIVIDAD
    public void cherubsActivity(View v){
        Intent intent = new Intent(this, cherubsActivity.class);
        startActivity(intent);
    }
}
