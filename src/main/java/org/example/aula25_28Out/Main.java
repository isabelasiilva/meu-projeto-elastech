package org.example.aula25_28Out;

public class Main {
    public static void main(String[] args) {
        // Jeito normal
        // DescontoVIP desconto = new DescontoVIP();
        // desconto.calcularDesconto(100);

        // com Lambda
        Desconto vip = valor -> valor * 0.2; // por baixo dos panos é o que foi sobrescrito na classe DescontoVIP
        Desconto estudante = valor -> valor * 0.1;

        System.out.println(vip.calcularDesconto(100));
        System.out.println(estudante.calcularDesconto(300));
    }
}
