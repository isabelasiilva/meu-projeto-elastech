package org.example.aula13_07Out.interfacesAtividade.atividade2;

public class Sms implements Notificacao {
    public void enviarMensagem(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}
