package org.example.aula18_16Out.aula18_atividadeRevisao16Out;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior do que zero! Valor recebido: " + preco);
        }
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa! Valor recebido: " + quantidade);
        }
        this.quantidade = quantidade;
    }
}
