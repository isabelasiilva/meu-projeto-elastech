package org.example.aula11_listaRevisao04Out.classesEObjetos;

public class Jogadora {
    String nome;
    int pontos;

    public Jogadora(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public static void comparar3Jogadoras(Jogadora a, Jogadora b, Jogadora c) {
        if (a.pontos > b.pontos && a.pontos > c.pontos) {
            System.out.println(a.nome + " tem a maior pontuação: " + a.pontos);
        } else if (b.pontos > a.pontos && b.pontos > c.pontos) {
            System.out.println(b.nome + " tem a maior pontuação: " + b.pontos);
        } else {
            System.out.println(c.nome + " tem a maior pontuação: " + c.pontos);
        }
    }
}
