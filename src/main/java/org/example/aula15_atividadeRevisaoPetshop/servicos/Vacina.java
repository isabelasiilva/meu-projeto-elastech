package org.example.aula15_atividadeRevisaoPetshop.servicos;

public class Vacina implements Servico{

    @Override
    public void oferecerServico(String nome) {
        System.out.println(nome + " está sendo vacinado!");
    }
}
