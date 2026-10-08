package org.example.aula11_listaRevisao04Out;

public class Aluna {
    String nome;
    double nota1;
    double nota2;
    double media;

    public Aluna(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void relatorioAluna(){
        media = (nota1 + nota2) / 2;
        System.out.println("Aluna: " + this.nome + " \t Nota 1: " + this.nota1  + " \t Nota 2: " + this.nota2 + " \t Media: " + this.media + "\n");
    }
}
