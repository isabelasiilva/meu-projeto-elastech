package org.example.aula11_listaRevisao04Out;

public class Operadores {
    static String soma(int a, int b){
        return "O resultado da subtração " + (a + b);
    }

    static String subtracao(int a, int b){
        return "O resultado da subtração " + (a - b);
    }

    static String multiplicacao(int a, int b){
        return "O resultado da multiplicação é " + (a * b);
    }

    static String divisao(int a, int b){
        try {
            return "O resultado da divisão é " + (a / b);
        } catch (ArithmeticException e) {
            return "Erro: não dividimos por 0";
        }
    }

    static String resto(int a, int b){
        return "Resto da divisão é " + (a % b);
    }

    static int a = 15;
    static int b = 4;

    static int saldo = 1000;

    static int idade = 20;
    static boolean temCarteira = true;

    public static void verificadorHabilitacao(int idadePessoa, boolean temHabilitacao){
        if (Operadores.idade >=18 && Operadores.temCarteira) {
            System.out.println("A pessoa é maior de 18 anos e tem carteira de motorista");
        } else {
            System.out.println("A pessoa não tem 18 anos ou não possui carteira de motorista");
        }
    }

    static int numero = 30;

    public static void verificaDivisaoPor2(int num){
        System.out.println("Resto da divisão de " + num + " por 2 = " + (num % 2));
    }

    static double arroz = 5.50;

    public static void totalCompraArroz(double num){
        System.out.println("\nA compra de 3 arroz é R$" + (num*3));
    }

    static int numero1 = 12;
    public static void verificaDivisaoPor3e5(int num){
        System.out.println("\nEsse número é divisível por 3 e por 5 ao mesmo tempo?");
        String resultado = numero1 % 3 ==0 && numero1 % 5 == 0 ? "É divisivel por 3 e 5" : "Não é divisivel por 3 e 5 ao mesmo tempo";
        System.out.println(resultado);
    }
}
