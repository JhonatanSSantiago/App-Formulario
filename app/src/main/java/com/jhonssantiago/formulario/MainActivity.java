package com.jhonssantiago.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText txtNome, txtIdade;
    private RadioButton rbMasculino, rbFeminino;
    private CheckBox cbSertanejo, cbForro, cbRock, cbPagode, cbOutro;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNome=findViewById(R.id.nome);
        txtIdade=findViewById(R.id.idade);
        rbMasculino=findViewById(R.id.masculino);
        rbFeminino=findViewById(R.id.feminino);
        cbSertanejo=findViewById(R.id.checkbox_sertanejo);
        cbRock=findViewById(R.id.checkbox_rock);
        cbForro=findViewById(R.id.checkbox_forro);
        cbPagode=findViewById(R.id.checkbox_pagode);
        cbOutro=findViewById(R.id.checkbox_outro);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pessoa pessoa = criaPessoa();
                String texto = "";
                texto = pessoa.toString();
                Intent it = new Intent(getApplicationContext(), ResultActivity.class);
                it.putExtra("texto", texto);
                startActivity(it);
            }
        });

    }

    private Pessoa criaPessoa() {
        String nome = txtNome.getText().toString();
        int idade = Integer.parseInt(txtIdade.getText().toString());
        String sexo = verifcarSexo();
        ArrayList<String> estilos = verificarEstilo();

        Pessoa p = new Pessoa(nome, idade, sexo, estilos);
        return p;
    }

    private ArrayList<String> verificarEstilo() {
        ArrayList<String> arrayList = new ArrayList<>();

        if (cbSertanejo.isChecked()){
            arrayList.add(cbSertanejo.getText().toString());
        } if (cbPagode.isChecked()){
            arrayList.add(cbPagode.getText().toString());
        } if (cbForro.isChecked()){
            arrayList.add(cbForro.getText().toString());
        } if (cbRock.isChecked()){
            arrayList.add(cbRock.getText().toString());
        } if (cbOutro.isChecked()){
            arrayList.add(cbOutro.getText().toString());
        }
        if (arrayList.isEmpty()){
            arrayList.add("Nenhum estilo selecionado");
        }

        return arrayList;
    }

    private String verifcarSexo() {
        String sexo = "";
        if (rbMasculino.isChecked()){
            sexo = rbMasculino.getText().toString();
            return sexo;
        } if (rbFeminino.isChecked()){
            sexo = rbFeminino.getText().toString();
            return sexo;
        } else {
            sexo = "Não Informado";
            return sexo;
        }
    }

}