package cherubs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.mand.myapplication.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;

import org.json.JSONException;


import Model.getData;

public class tomatetemperaturaActivity extends AppCompatActivity{
    private BarChart barra;
    private LineChart lineChart;

    private getData data = new getData();

    private Toolbar toolbar;

    String type;

    public void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_tomate_temperatura);

        toolbar = (Toolbar) findViewById(R.id.toolbarGen);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();

        if(extras!=null){
            type = extras.getString("type");
        }


        barra = (BarChart) findViewById(R.id.temperatura);

        lineChart = (LineChart) findViewById(R.id.temperaturas);

         inicializandoGraficarUno();
        try {
            iniciarlizarGraficaDos();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    //Codigo de la grafica numero 1
    public void inicializandoGraficarUno(){
        data.llenarGrafica1(barra,type,"temperatura");
    }
    //FIN DEL COEDIGO DE LA GRAFICA UNO

    //CODIGO DE LA GRAFICA DOS
    public void iniciarlizarGraficaDos() throws JSONException {
        data.llenarGrafica2(lineChart,"temperatura");
    }

    public boolean onCreateOptionsMenu(Menu menu){
        toolbar.setTitle("Temperaturas");
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