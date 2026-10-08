package org.example.aula11_listaRevisao04Out.classesEObjetos;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void relatorioProduto(){
        System.out.printf("Produto: %s \t Valor: %.2f \t Quantidade em estoque: %d \n",  this.nome, this.preco, this.quantidade);
    }
}
