package org.example.aula20_atividade21Out;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

//      Construtor
//    public Agendamento(String nomePet, String servico, String horario, boolean perfume, boolean laco, boolean hidratacao, String observacao, double desconto) {
//        this.nomePet = nomePet;
//        this.servico = servico;
//        this.horario = horario;
//        this.perfume = perfume;
//        this.laco = laco;
//        this.hidratacao = hidratacao;
//        this.observacao = observacao;
//        this.desconto = desconto;
//    }

    void mostrar(){
        System.out.printf("Agendamento: %s , %s , %s , %b , %b , %b, %s , %.0f \n", nomePet, servico, horario, perfume, laco, hidratacao, observacao, desconto);
    }
}