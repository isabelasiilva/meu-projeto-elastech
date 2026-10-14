package org.example.aula15_atividadeRevisaoPetshop;

public class Vacina implements Servico{

    @Override
    public void oferecerServico(String nome) {
        System.out.println(nome + " está sendo vacinado!");
    }
}
