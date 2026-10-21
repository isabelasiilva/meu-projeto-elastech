package org.example.aula20_atividade21Out;

public class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;


    public Agendamento(String nomePet, String servico, String horario, boolean perfume, boolean laco, boolean hidratacao, String observacao, double desconto) {
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

    void mostrar(){
        System.out.println("Nome: " + nomePet);
        System.out.println("Servico: " + servico);
        System.out.println("Horario: " + horario);
        System.out.println("Perfume: " + perfume);
        System.out.println("Laco: " + laco);
        System.out.println("Hidratacao: " + hidratacao);
        System.out.println("Observacao: " + observacao);
        System.out.println("Desconto: " + desconto);
    }
}