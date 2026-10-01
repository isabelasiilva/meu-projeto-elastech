package org.example.aula1_23Set.Exercicio2ConcatenacaoeOperadoresAritmeticos;

public class Produto {
    String nomeProduto;
    double preco;
    int quantidade;

    Produto(String nomeProduto, double preco, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void mensagemDoProduto(){
        double valorTotal = preco * quantidade;
        System.out.println("Comprei " + quantidade + " unidades de " + nomeProduto + " por R$" + preco + " cada. Total: R$" + valorTotal + "\n");
    }
}
