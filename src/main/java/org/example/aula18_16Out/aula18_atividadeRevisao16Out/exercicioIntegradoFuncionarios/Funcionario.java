package org.example.aula18_16Out.aula18_atividadeRevisao16Out.exercicioIntegradoFuncionarios;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    abstract double calcularSalario();

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            throw new IllegalArgumentException("O salário base não pode ser negativo! Valor recebido: " + salarioBase);
        }
        this.salarioBase = salarioBase;
    }

}
