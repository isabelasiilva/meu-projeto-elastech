package org.example.aula18_16Out.aula18_atividadeRevisao16Out.classeAbstrata;

public abstract class Forma {
    String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public void exibirNome(){
        System.out.println(nome);
    }

    abstract double calcularArea();
}
