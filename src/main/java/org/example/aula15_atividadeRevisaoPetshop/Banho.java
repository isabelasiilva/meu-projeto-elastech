package org.example.aula15_atividadeRevisaoPetshop;

public class Banho implements Servico{
    @Override
    public void oferecerServico(String nome) {
        System.out.println("Dando banho em " + nome);
    }
}
