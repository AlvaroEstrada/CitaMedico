package com.android.curso.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmacionActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        Button btnOk = (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(this);

        TextView tv_name = (TextView) findViewById(R.id.tv_name);
        TextView tv_type = (TextView) findViewById(R.id.tv_type);
        TextView tv_date = (TextView) findViewById(R.id.tv_date);
        TextView tv_hour = (TextView) findViewById(R.id.tv_hour);
        String cita = null;
        String nombre = getIntent().getStringExtra("nombre");
        String tipo = getIntent().getStringExtra("tipo");
        String fecha = getIntent().getStringExtra("fecha");
        String hora = getIntent().getStringExtra("hora");
        tv_name.setText(nombre);
        tv_type.setText(tipo);
        tv_date.setText(fecha);
        tv_hour.setText(hora);

    }

    @Override
    public void onClick(View v) {
        this.finish();
    }
}
