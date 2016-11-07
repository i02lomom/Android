package com.example.mike.proyectobaloncesto;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int marcadorLocal=0;
    int marcadorVisitante=0;
    TextView mLocal;
    TextView mVisitante;
    ImageButton btn1puntoLocal;
    ImageButton btn2puntosLocal;
    ImageButton btn3puntosLocal;
    ImageButton btn1puntoVisitante;
    ImageButton btn2puntosVisitante;
    ImageButton btn3puntosVisitante;
    ImageButton btnReiniciar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        btn1puntoLocal = (ImageButton) findViewById(R.id.imageButton);
        btn2puntosLocal = (ImageButton) findViewById(R.id.imageButton2);
        btn3puntosLocal = (ImageButton) findViewById(R.id.imageButton3);
        btn1puntoVisitante = (ImageButton) findViewById(R.id.imageButton4);
        btn2puntosVisitante = (ImageButton) findViewById(R.id.imageButton5);
        btn3puntosVisitante = (ImageButton) findViewById(R.id.imageButton6);
        btnReiniciar =(ImageButton) findViewById(R.id.imageButton9);
        mLocal = (TextView) findViewById(R.id.textView3);
        mVisitante = (TextView) findViewById(R.id.textView4);

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reiniciarMarcadores();
            }
        });

        btn1puntoLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marcadorLocal += 1;
                mLocal.setText(Integer.toString(marcadorLocal));
            }
        });

        btn1puntoVisitante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marcadorVisitante += 1;
                mVisitante.setText(Integer.toString(marcadorVisitante));
            }
        });

        btn2puntosVisitante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marcadorVisitante += 2;
                mVisitante.setText(Integer.toString(marcadorVisitante));
            }
        });

        btn3puntosVisitante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marcadorVisitante += 3;
                mVisitante.setText(Integer.toString(marcadorVisitante));
            }
        });

        btn2puntosLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marcadorLocal += 2;
                mLocal.setText(Integer.toString(marcadorLocal));
            }
        });

        btn3puntosLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marcadorLocal += 3;
                mLocal.setText(Integer.toString(marcadorLocal));
            }
        });


    }

    void reiniciarMarcadores(){
        marcadorLocal=0;
        marcadorVisitante=0;
        mLocal.setText(Integer.toString(marcadorLocal));
        mVisitante.setText(Integer.toString(marcadorVisitante));

    }
}
