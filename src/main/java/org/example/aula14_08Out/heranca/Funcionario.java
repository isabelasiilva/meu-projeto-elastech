package org.example.aula14_08Out.heranca;

public class Funcionario {
    private String nome;

    public void baterPonto(){
        System.out.println(this.nome + " bateu o ponto");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
