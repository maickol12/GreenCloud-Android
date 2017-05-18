package com.example.mand.myapplication;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class secciones extends AppCompatActivity {
    private Spinner spinner;
    private int position;
    public void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.secciones);
        if(Build.VERSION.SDK_INT>=21){
            Window window = this.getWindow();
            window.setStatusBarColor(getResources().getColor(R.color.colorPrimary));
        }
        spinner = (Spinner) findViewById(R.id.tomatesSpinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.tomates_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new oyenteSpinner());
    }
    public class oyenteSpinner implements AdapterView.OnItemSelectedListener{
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            setPosition(position);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
    public void setPosition(int position){
        this.position = position;
    }
    String[] variadades = {"cherubs","eclipses","glorys","jubilees","sunburts"};
   public void goto00(View v){
       Intent intent = new Intent(this, MainActivity.tomateActivity.class);
       intent.putExtra("type",variadades[position]);
       intent.putExtra("position","0,0");
       startActivity(intent);
   }
    public void goto01(View v){
        Intent intent = new Intent(this, MainActivity.tomateActivity.class);
        intent.putExtra("type",variadades[position]);
        intent.putExtra("position","0,1");
        startActivity(intent);
    }
    public void goto10(View v){
        Intent intent = new Intent(this, MainActivity.tomateActivity.class);
        intent.putExtra("type",variadades[position]);
        intent.putExtra("position","1,0");
        startActivity(intent);
    }
    public void goto11(View v){
        Intent intent = new Intent(this, MainActivity.tomateActivity.class);
        intent.putExtra("type",variadades[position]);
        intent.putExtra("position","1,1");
        startActivity(intent);
    }

}
