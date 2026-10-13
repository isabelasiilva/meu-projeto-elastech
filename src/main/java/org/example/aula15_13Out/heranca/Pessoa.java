package org.example.aula15_13Out.heranca;

public class Pessoa {
    public String nome;
    public int idade;

    public void apresentar(){
        System.out.println("Oi, sou " +  this.nome + " e tenho " + this.idade + " anos");
    }
}
