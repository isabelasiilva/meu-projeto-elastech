package org.example.aula15_atividadeRevisaoPetshop.servicos;

public class Tosa implements Servico{
    @Override
    public void oferecerServico(String nome) {
        System.out.println("Tosando " + nome);
    }
}
