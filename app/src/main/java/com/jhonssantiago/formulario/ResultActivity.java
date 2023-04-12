package com.jhonssantiago.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultado=findViewById(R.id.resultado);
        Intent it = getIntent();
        String pessoa = it.getStringExtra("texto");
        resultado.setText(pessoa);
    }
}