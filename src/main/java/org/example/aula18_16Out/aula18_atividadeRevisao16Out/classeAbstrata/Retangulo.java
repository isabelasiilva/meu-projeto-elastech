package org.example.aula18_16Out.aula18_atividadeRevisao16Out.classeAbstrata;

public class Retangulo extends Forma {
    public int largura;
    public int altura;

    public Retangulo(String nome) {
        super(nome);
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }
}
