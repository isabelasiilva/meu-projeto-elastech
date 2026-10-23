package org.example.aula18_16Out.aula18_atividadeRevisao16Out.exercicioIntegradoFuncionarios;


public class Gerente extends Funcionario {
    private double salarioGerente;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    double calcularSalario() {
        salarioGerente = getSalarioBase() * 1.5;
        return salarioGerente;
    }
}
