package org.example.aula18_16Out.aula18_atividadeRevisao16Out.exercicioIntegradoFuncionarios;

public class Desenvolvedor extends Funcionario {
    private double salarioDesenvolvedor;

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);

    }

    @Override
    double calcularSalario() {
        salarioDesenvolvedor = getSalarioBase() * 1.2;
        return salarioDesenvolvedor;
    }
}
