package org.example.aula15_atividadeRevisaoPetshop;

public class Tosa implements Servico{
    @Override
    public void oferecerServico(String nome) {
        System.out.println("Tosando " + nome);
    }
}
