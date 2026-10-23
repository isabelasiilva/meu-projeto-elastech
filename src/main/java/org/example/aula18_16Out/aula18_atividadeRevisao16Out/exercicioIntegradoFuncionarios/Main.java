package org.example.aula18_16Out.aula18_atividadeRevisao16Out.exercicioIntegradoFuncionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario desenvolvedor1 = new Desenvolvedor("Micaela", 1500);
        Funcionario gerente1 = new Gerente("Rodrigo", 2000);

        Notificador notificadorSms = new NotificadorSms();
        Notificador notificadorEmail = new NotificadorEmail();

        FolhaPagamento folha1 = new FolhaPagamento(notificadorEmail);
        folha1.pagar(desenvolvedor1);
        folha1.pagar(gerente1);

        FolhaPagamento folha2 = new FolhaPagamento(notificadorSms);
        folha2.pagar(desenvolvedor1);
        folha2.pagar(gerente1);
    }
}
