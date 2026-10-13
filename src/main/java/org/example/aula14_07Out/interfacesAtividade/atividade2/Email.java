package org.example.aula14_07Out.interfacesAtividade.atividade2;

public class Email implements Notificacao {
    public void enviarMensagem(String mensagem) {
        System.out.println("Email enviado: " + mensagem);
    }
}
