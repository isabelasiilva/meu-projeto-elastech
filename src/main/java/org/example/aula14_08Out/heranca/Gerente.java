package org.example.aula14_08Out.heranca;

public class Gerente extends Funcionario implements Exportavel,  Notificavel {
    public void aprovarFerias(String nome){
        System.out.println(getNome() + " aprovou as ferias de " + nome);
    }

    @Override
    public void exportar() {
        System.out.println(getNome() + " está exportando algum documento.");
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println(getNome() + " está compartilhando a mensagem: " + mensagem);
    }
}
