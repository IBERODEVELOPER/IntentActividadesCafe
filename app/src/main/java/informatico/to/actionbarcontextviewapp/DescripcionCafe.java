package informatico.to.actionbarcontextviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DescripcionCafe extends AppCompatActivity {
    /*creamos las variables*/
    String Titulo="Descripción del Café";
    TextView textViewtipocafe,textViewdescripcion;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_cafe);
        /*pintamos el titulo de la actividad que se ira en el ACTION BAR*/
        this.setTitle(Titulo);
        /*inicializamos los controles con las variable*/
        textViewtipocafe=(TextView)findViewById(R.id.textViewcafetipo);
        textViewdescripcion=(TextView)findViewById(R.id.textViewDescripcion);
        /*capturamos el intento lanzado*/
        intent=getIntent();
        String mensagge=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        /*pintamos el textview con el valor enviado*/
        textViewtipocafe.setText(mensagge);
        /*preguntamos que valor fue enviado*/
        if (mensagge.equals("Arábica (Coffea Arábica)") ){ //Arábica (Coffea Arábica)
            textViewdescripcion.setText("La variedad de café Arábica es originaria de Etiopía," +
                    " se caracteriza desde un punto de vista aromático" +
                    "por un sabor dulce y afrutado, en gran parte porque" +
                    "su grano tiene un bajo contenido en cafeína, que se" +
                    "estima entre un 1,5% y 1,7%. En algunos foros está" +
                    "catalogado como un Gourmet Coffee.");
        }else  if (mensagge.equals("Robusta (Coffea Canephora)")){//Robusta (Coffea Canephora)
            textViewdescripcion.setText("La variedad de café Robusta es originaria del África Central," +
                    " ya que crece en ecosistemas secos, lo que influye en su característico" +
                    " sabor amargo y con mucho cuerpo. Su sabor suele tener matices de frutos secos y madera.");
        } else  if (mensagge.equals("Libérica (Coffea Libérica)") ){//Libérica (Coffea Libérica)
            textViewdescripcion.setText("Esta variedad es originaria de Monrovia (Liberia)," +
                    "de donde toma su nombre. El aroma y sabor de este grano de " +
                    "café es muy peculiar, por lo que su consumo está muy poco extendido," +
                    "se centra principalmente en los países Escandinavos.");
        } else { //Excelsa (Coffea Excelsa)
            textViewdescripcion.setText("Su origen está fechado sobre 1905 en la región semiárida  del Lago Chad (África)." +
                    " Guarda grandes similitudes con el café Liberiano," +
                    "en lo que respecta al tamaño del árbol y de sus hojas." +
                    "Sin embargo, tanto sus flores como sus frutos y hojas tienen" +
                    " un tamaño sensiblemente menor");
        }

    }

}