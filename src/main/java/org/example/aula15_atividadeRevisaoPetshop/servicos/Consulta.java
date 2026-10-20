package org.example.aula15_atividadeRevisaoPetshop.servicos;

public class Consulta implements Servico {
    @Override
    public void oferecerServico(String nome) {
        System.out.println(nome + " vai passar em consulta...");
    }
}
