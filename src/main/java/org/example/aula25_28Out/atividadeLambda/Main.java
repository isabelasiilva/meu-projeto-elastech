package org.example.aula25_28Out.atividadeLambda;

public class Main {
    public static void main(String[] args) {

        System.out.println("----Exercicio 1----");
        Saudacao saudacao1 = () -> System.out.println("Olá");
        saudacao1.executar();


        System.out.println("----Exercicio 2----");
        Impressora impressao1 = texto -> System.out.println(texto.toUpperCase());
        Impressora impressao2 = texto -> System.out.println(texto);

        impressao1.imprimir("Imprimindo uma nova folha");
        impressao2.imprimir("imprimindo outra folha");


        System.out.println("----Exercicio 3----");
        Calculo soma = (a, b) -> a + b;
        Calculo multplicacao = (a, b) -> a * b;
        Calculo oMaior = (a, b) -> {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        };

        System.out.println(soma.calcular(5, 4));
        System.out.println(multplicacao.calcular(3, 4));
        System.out.println(oMaior.calcular(7, 4));


        System.out.println("----Exercicio 4----");


    }
}
