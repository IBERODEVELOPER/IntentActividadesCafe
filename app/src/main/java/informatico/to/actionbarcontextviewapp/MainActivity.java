package informatico.to.actionbarcontextviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import static informatico.to.actionbarcontextviewapp.R.array.tipo_cafe;

public class MainActivity extends AppCompatActivity {
    /*Creacion de variables*/
    private ArrayAdapter adapter ;
    private Spinner spTipoCafe;
    int posiciondecafe;
    private String tipoCafeLanzado;
    public static final String EXTRA_MESSAGE="";
    public int EXTRA_POSCION = 0;
    /*Arreglo de los nombres de los tipos de cafes*/
    private final static String[] tipoCafe = { "Arábica (Coffea Arábica)", "Robusta (Coffea Canephora)",
            "Libérica (Coffea Libérica)","Excelsa (Coffea Excelsa)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Instanciamos al arreglo de string*/
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,tipoCafe );
        /*Instanciamos la variable del la clase spinner
         con el id del control spinner de la vista*/
        spTipoCafe = (Spinner)findViewById(R.id.spinnertipocafe);
        /*indicaamos al spiner que pinte la lista del arreglo que esta en el adaptador*/
        spTipoCafe.setAdapter(adapter);
        /*Capturamos la opcion del seleccionado y convertimos en string*/
        tipoCafeLanzado = spTipoCafe.getSelectedItem().toString();
        /*Creamos un metodo que escuche las acciones*/
        spTipoCafe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                /*Capturamos la posicion del spinner*/
                tipoCafeLanzado = String.valueOf (adapterView.getItemAtPosition(i));
               /*posicion del face lo inicializamos con i que es la posicion*/
                posiciondecafe=i;
                }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        }
/*metodo para el onclick*/
    public void LanzarTipoCafe(View view){
        /*Creaamos un intento y que me abra la segunda clase*/
        Intent intentact=new Intent(this,DescripcionCafe.class);
        /*Lanzamos el tipo cafe almacenado en EXTRA_MESSAGE*/
        intentact.putExtra(EXTRA_MESSAGE,tipoCafeLanzado);
        /*Lnazamos la actividad*/
        startActivity(intentact);
       /* Toast toast=Toast.makeText(this,"Posicion"+ posiciondecafe +"",Toast.LENGTH_SHORT);
        toast.show();*/
        }

}