package org.example.aula15_13Out.atividadeEncapsulamento;

public class ContaBancaria {
    private String titular;
    private double saldo;


    private String numeroConta = "001-X";

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor invalido para depositar!");
        } else {
            this.saldo += valor;
            registrarLog("depósito", valor);
        }
    }

    public void sacar(double valor){
        if (!temSaldo(valor)){
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            registrarLog("saque", valor);
        }
    }

    private boolean temSaldo(double valor){
        if (saldo <= valor){
            return false;
        }else {
            registrarLog("verificou saldo");
            return true;
        }
    }

    private void registrarLog(String acao){
        System.out.println("[LOG] " + this.titular + ": "+ acao);
    }

    private void registrarLog(String acao, double valor){
        System.out.println("[LOG] " + this.titular + ": "+ acao +" de " + valor);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular.isEmpty() || titular == null) {
            System.out.println("Nome do titular inválido! Mantido " + this.titular);
        } else {
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Valor inválido! Mantido " + this.saldo);
        } else {
            this.saldo = saldo;
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }
}
