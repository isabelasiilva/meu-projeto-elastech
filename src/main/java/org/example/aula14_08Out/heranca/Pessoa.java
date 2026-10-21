package org.example.aula14_08Out.heranca;

public class Pessoa {
    private String nome;
    private int idade;

    public void apresentar(){
        System.out.println("Oi, sou " +  this.nome + " e tenho " + this.idade + " anos");
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
}
