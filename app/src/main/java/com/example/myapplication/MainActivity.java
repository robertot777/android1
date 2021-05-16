package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {


    private ImageButton booton;
    private TextView respuesta;
    private String [] respuestaArrays={"Es cierto", "Definitivamente es así", "Sin duda", "Sí definitivamente", "Puede confiar en él", "Como yo lo veo, sí",
        "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
        "Mejor no decirte ahora", "No puedo predecir ahora", "Concéntrate y pregunta de nuevo", "No cuentes con eso",
        "Mi respuesta es no", "Mis fuentes dicen que no", "Outlook no es tan bueno", "Muy dudoso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //la imagen se carga
        booton=findViewById(R.id.btn);
        // referencia el texto
        respuesta=findViewById(R.id.respuestavista);
        //proceso
        booton.setOnClickListener ((View.OnClickListener) this);
        Toast.makeText(MainActivity.this ,"consulta tu suerte", Toast.LENGTH_SHORT).show();
    }
    @Override

    public void onClick (View v){

        //creacion metodo switch
        switch (v.getId()){
            case R.id.btn:
                int  rand = new Random().nextInt(respuestaArrays.length);
                respuesta.setText(respuestaArrays[rand]);

                break;
        }
    }





}
