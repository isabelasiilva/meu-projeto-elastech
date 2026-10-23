package org.example.aula18_16Out.aula18_atividadeRevisao16Out;

import org.example.aula18_16Out.aula18_atividadeRevisao16Out.classeAbstrata.*;

public class Main {

    public static void main(String[] args) {
        // Getters e setters
        Produto produto = new Produto();
        produto.setNome("Perfume");
        produto.setQuantidade(10);
        produto.setPreco(150);

        System.out.println(produto.getNome() + " - quantidade: " + produto.getQuantidade() + " / R$" + produto.getPreco());

        // Classe abstrata
        Retangulo retangulo = new Retangulo("retangulo");
        retangulo.exibirNome();
        retangulo.largura = 3;
        retangulo.altura = 4;
        System.out.printf("%.1f", retangulo.calcularArea());

        // Classes abstratas não podem ser instanciadas
        //Forma f = new Forma("teste");

    }
}
