package com.android.curso.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.android.curso.myapplication.R.id.textView;

public class ConfirmacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        TextView tv_name=(TextView)findViewById(R.id.tv_name);
        TextView tv_type=(TextView)findViewById(R.id.tv_type);
        TextView tv_date=(TextView)findViewById(R.id.tv_date);
        TextView tv_hour=(TextView)findViewById(R.id.tv_hour);
        String cita=null;
        String nombre=getIntent().getStringExtra("nombre");
        String tipo=getIntent().getStringExtra("tipo");
        String fecha=getIntent().getStringExtra("fecha");
        String hora=getIntent().getStringExtra("hora");
        tv_name.setText(nombre);

    }
}
