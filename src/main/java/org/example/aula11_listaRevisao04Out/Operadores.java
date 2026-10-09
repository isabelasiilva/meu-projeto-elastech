package org.example.aula11_listaRevisao04Out;

public class Operadores {
    static String soma(int a, int b){
        return "O resultado da soma é " + (a + b);
    }

    static String subtracao(int a, int b){
        return "O resultado da subtração " + (a - b);
    }

    static String multiplicacao(int a, int b){
        return "O resultado da multiplicação é " + (a * b);
    }

    static String divisao(int a, int b){
        try {
            return "O resultado da divisão é " + ((double) a / b);
        } catch (ArithmeticException e) {
            return "Erro: não dividimos por 0";
        }
    }

    static String resto(int a, int b){
        if (b == 0) {
            return "Erro: não calculamos resto por 0";
        }
        return "Resto da divisão é " + (a % b);
    }

    public static void verificadorHabilitacao(int idadePessoa, boolean temHabilitacao){
        if (idadePessoa >= 18 && temHabilitacao) {
            System.out.println("A pessoa é maior de 18 anos e tem carteira de motorista");
        } else {
            System.out.println("A pessoa não tem 18 anos ou não possui carteira de motorista");
        }
    }

    public static void verificaDivisaoPor2(int num){
        System.out.println("Resto da divisão de " + num + " por 2 = " + (num % 2));
    }

    public static void totalCompraArroz(double num){
        System.out.println("\nA compra de 3 arroz é R$" + (num*3));
    }

    public static void verificaDivisaoPor3e5(int num){
        System.out.println("\nEsse número é divisível por 3 e por 5 ao mesmo tempo?");
        String resultado = num % 3 == 0 && num % 5 == 0 ? "É divisivel por 3 e 5" : "Não é divisivel por 3 e 5 ao mesmo tempo";
        System.out.println(resultado);
    }
}
