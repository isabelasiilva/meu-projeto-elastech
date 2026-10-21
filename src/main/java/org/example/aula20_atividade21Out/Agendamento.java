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

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isPerfume() {
        return perfume;
    }

    public void setPerfume(boolean perfume) {
        this.perfume = perfume;
    }

    public boolean isLaco() {
        return laco;
    }

    public void setLaco(boolean laco) {
        this.laco = laco;
    }

    public boolean isHidratacao() {
        return hidratacao;
    }

    public void setHidratacao(boolean hidratacao) {
        this.hidratacao = hidratacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}