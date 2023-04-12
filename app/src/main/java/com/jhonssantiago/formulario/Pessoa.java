package com.jhonssantiago.formulario;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private ArrayList<String> listMusic;

    public Pessoa(String nome, int idade, String sexo, ArrayList<String> listMusic) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.listMusic = listMusic;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList<String> getListMusic() {
        return listMusic;
    }

    public void setListMusic(ArrayList<String> listMusic) {
        this.listMusic = listMusic;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", listMusic=" + listMusic +
                '}';
    }
}
