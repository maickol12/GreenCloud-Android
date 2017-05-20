package com.example.mand.myapplication;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class secciones extends AppCompatActivity {
    private String type;
    private Toolbar toolbar;
    public void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.secciones);
        if(Build.VERSION.SDK_INT>=21){
            Window window = this.getWindow();
            window.setStatusBarColor(getResources().getColor(R.color.colorPrimary));
        }
        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            type = extras.getString("type");
        }
        toolbar = (Toolbar) findViewById(R.id.toolbarGen);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

   public void goto00(View v){
       Intent intent = new Intent(this, tomateActivity.class);
       intent.putExtra("type",type);
       intent.putExtra("position", "0,0");
       startActivity(intent);
   }
    public void goto01(View v){
        Intent intent = new Intent(this, tomateActivity.class);
        intent.putExtra("type",type);
        intent.putExtra("position","0,1");
        startActivity(intent);
    }
    public void goto10(View v){
        Intent intent = new Intent(this, tomateActivity.class);
        intent.putExtra("type",type);
        intent.putExtra("position","1,0");
        startActivity(intent);
    }
    public void goto11(View v){
        Intent intent = new Intent(this, tomateActivity.class);
        intent.putExtra("type",type);
        intent.putExtra("position","1,1");
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        toolbar.setTitle("Secciones");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return true;
    }
}
