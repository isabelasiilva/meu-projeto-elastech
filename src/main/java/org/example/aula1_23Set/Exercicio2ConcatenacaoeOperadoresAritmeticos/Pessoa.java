package org.example.aula1_23Set.Exercicio2ConcatenacaoeOperadoresAritmeticos;

public class Pessoa {
    String nome;
    int idade;
    String cidade;

    Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public void apresentacao(){
        System.out.println("Meu nome é " + nome + ", moro em " + cidade +" e tenho " + idade + " anos.\n");
    }
}

