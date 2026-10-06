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
            return "Não dividimos por 0";
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
    static int numero = 30;
    static double arroz = 5.50;
    static int numero1 = 12;

    static String resultado = numero1 % 3 ==0 && numero1 % 5 == 0 ? "É divisivel por 3 e 5" : "Não é divisivel por 3 e 5 ao mesmo tempo";
}
