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
        Acao acaoTeste = () -> {System.out.println("Oi");};
//        acaoTeste.executar();
//        repetir(acaoTeste);
        // ou
         repetir(() -> {System.out.println("Oi");});

        System.out.println("----Exercicio 5----");
        Operacao dobro = (n) -> n*2;
        Operacao quadrado = (n) -> n*n;
        Operacao negativo = (n) -> n*(-1);

        mostrarResultado(dobro, 3);
        mostrarResultado(quadrado, 3);
        mostrarResultado(negativo, 3);

        System.out.println("----Exercicio 6----");
        Condicao condicao1 = (n) -> true;
        Condicao condicao2 = (n) -> false;

        executarSe(condicao1, 5, acaoTeste);
        executarSe(condicao2, 3, acaoTeste);
    }

    // Exercicio 4
    public static void repetir(Acao acao) {
        acao.executar();
        acao.executar();
    }

    // Exercicio 5
    static void mostrarResultado(Operacao op, int valor){
        System.out.println(op.aplicar(valor));
    }

    // Exercicio 6
    static void executarSe(Condicao cond, int valor, Acao acao){
        if(cond.testar(valor)){
            acao.executar();
        }
    }
}
