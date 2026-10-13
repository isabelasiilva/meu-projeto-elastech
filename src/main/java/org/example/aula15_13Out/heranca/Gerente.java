package org.example.aula15_13Out.heranca;

public class Gerente extends Funcionario implements Exportavel,  Notificavel {
    public void aprovarFerias(String nome){
        System.out.println(this.nome + " aprovou as ferias de " + nome);
    }

    @Override
    public void exportar() {
        System.out.println(this.nome + " está exportando algum documento.");
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println(this.nome + " está compartilhando a mensagem: " + mensagem);
    }
}
