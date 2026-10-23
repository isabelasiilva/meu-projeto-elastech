package org.example.aula18_16Out.aula18_atividadeRevisao16Out.exercicioIntegradoFuncionarios;

public class NotificadorEmail implements Notificador{
    @Override
    public void notificar(String mensagem) {
        System.out.println("NotificadorEmail diz:" + mensagem);
    }
}
