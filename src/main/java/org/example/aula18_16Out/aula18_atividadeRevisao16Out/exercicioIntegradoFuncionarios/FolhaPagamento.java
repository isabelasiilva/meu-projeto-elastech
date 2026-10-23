package org.example.aula18_16Out.aula18_atividadeRevisao16Out.exercicioIntegradoFuncionarios;

public class FolhaPagamento {
    Notificador notificador;

    FolhaPagamento(Notificador n) {
        this.notificador = n;
    }

    void pagar(Funcionario f) {
        double valor = f.calcularSalario();
        notificador.notificar(" pagamento de " + valor +" efetuado com sucesso para " + f.getNome() + "!");
    }
}
