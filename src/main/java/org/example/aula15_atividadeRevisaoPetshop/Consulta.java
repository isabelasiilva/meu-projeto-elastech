package org.example.aula15_atividadeRevisaoPetshop;

public class Consulta implements Servico{
    @Override
    public void oferecerServico(String nome) {
        System.out.println(nome + " vai passar em consulta...");
    }
}
