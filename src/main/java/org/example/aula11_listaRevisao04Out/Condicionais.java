package org.example.aula11_listaRevisao04Out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Condicionais {
    static int idade;
    static int numero;
    static int numero2;
    static int nota;
    static int ladoTriangulo1;
    static int ladoTriangulo2;
    static int ladoTriangulo3;

    static Scanner sc = new Scanner(System.in);

    public static void perguntarIdade(){
        boolean entradaValidaIdade = false;
        do {
            System.out.println("Digite sua idade:");
            try {
                Condicionais.idade =  sc.nextInt();
                if(Condicionais.idade >= 0 && Condicionais.idade <= 100){
                    entradaValidaIdade = true;
                    Condicionais.verificaIdade(Condicionais.idade);
                } else {
                    System.out.println("Só são aceitos números de 0 a 100");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Erro: são aceitos somente números de 0 a 100");
                sc.next();
            }
        } while (!entradaValidaIdade);
    }

    private static void verificaIdade(int idadePessoa){
        if (idadePessoa < 18){
            System.out.println("Você tem " +  idadePessoa + " anos. Você é menor de idade!");
        } else {
            System.out.println("Você tem " +  idadePessoa + " anos. Você é maior de idade!");
        }
    }

    public static void perguntarNumero(){
        boolean entradaValidaNumero = false;
        do {
            System.out.println("Digite um número:");
            try {
                Condicionais.numero =  sc.nextInt();
                verificaNumero(Condicionais.numero);
                entradaValidaNumero = true;
            } catch (InputMismatchException ime) {
                System.out.println("Erro: só são aceitos números inteiros");
                sc.next();
            }
        } while (!entradaValidaNumero);
    }

    private static void verificaNumero(int numero){
        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é par");
        } else {
            System.out.println("O número " + numero + " é impar");
        }
    }

    public static void perguntarNumeros(){

        boolean entradaValidaNumero = false;
        do {
            System.out.println("Digite um número:");
            try {
                Condicionais.numero = sc.nextInt();
                perguntaOutroNumero();
                entradaValidaNumero = true;
            } catch (InputMismatchException ime) {
                System.out.println("Erro: são aceitos somente números inteiros");
                sc.next();
            }
        } while (!entradaValidaNumero);
    }

    private static void perguntaOutroNumero(){
        boolean entradaValidaNumero = false;
        do {
            System.out.println("Digite outro número: ");
            try {
                Condicionais.numero2 = sc.nextInt();
                entradaValidaNumero = true;
                verificaNumeros(Condicionais.numero, Condicionais.numero2);
            } catch (InputMismatchException ime) {
                System.out.println("Erro: são aceitos soemnte números inteiros");
                sc.next();
            }
        } while (!entradaValidaNumero);
    }

    private static void verificaNumeros(int numero1, int numero2){
        if (numero1 > numero2){
            System.out.println("O número " + numero1 + " é maior que " + numero2);
        } else if (numero2 > numero1){
            System.out.println("O número " + numero2 + " é maior que " + numero1);
        } else {
            System.out.println("Os números são iguais!");
        }
    }

    public static void perguntarNota() {
        boolean notaValida = false;

        do {
            System.out.println("Digite uma nota de 0 a 10:");
            try {
                nota = sc.nextInt();
                if (nota < 0 || nota > 10) {
                    System.out.println("A nota deve ser entre 0 e 10!");
                } else {
                    notaValida = true;
                    verificaNota(nota);
                }
            } catch (InputMismatchException ime) {
                System.out.println("Entrada inválida! Digite apenas números inteiros entre 0 e 10.");
                sc.next(); // Limpa o valor inválido do Scanner para não travar o loop
            }
        } while (!notaValida);
    }

    private static void verificaNota(int notaPessoa) {
        if (notaPessoa >= 7) {
            System.out.println("Sua nota foi " + notaPessoa + ". Você está aprovado!");
        } else if (notaPessoa >= 5) {
            System.out.println("Sua nota foi " + notaPessoa + ". Você está de recuperação!");
        } else {
            System.out.println("Sua nota foi " + notaPessoa + ". Você está reprovado!");
        }
    }

    public static void mostrarMenuSorveteria() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha um número de 1 a 3, ou 4 para sair:");
            System.out.println("1 - sorvete de chocolate");
            System.out.println("2 - sorvete de baunilha");
            System.out.println("3 - sorvete napolitano");
            System.out.println("4 - sair");

            try {
                int opcao = sc.nextInt();
                continuar = saborSorvete(opcao);
            } catch (InputMismatchException ime) {
                System.out.println("Erro: São aceitos somente números inteiros!");
                sc.next(); // Limpa o buffer do Scanner para evitar loop infinito
            }
        }
    }

    private static boolean saborSorvete(int opcao) {
        switch (opcao) {
            case 1:
                System.out.println("Você escolheu: Sorvete de chocolate!");
                return true;
            case 2:
                System.out.println("Você escolheu: Sorvete de baunilha!");
                return true;
            case 3:
                System.out.println("Você escolheu: Sorvete napolitano!");
                return true;
            case 4:
                System.out.println("Até logo!");
                return false; // Retorna false para encerrar o loop no menu
            default:
                System.out.println("Opção inválida! Digite um número de 1 a 4.");
                return true;
        }
    }

    public static void perguntarIdade2(){
        boolean entradaValidaIdade = false;
        do {
            System.out.println("Digite sua idade:");
            try {
                Condicionais.idade =  sc.nextInt();
                if(Condicionais.idade >= 0 && Condicionais.idade <= 100){
                    entradaValidaIdade = true;
                    Condicionais.verificaIdade(Condicionais.idade);
                } else {
                    System.out.println("Só são aceitos números de 0 a 100");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Erro: são aceitos somente números de 0 a 100");
                sc.next();
            }
        } while (!entradaValidaIdade);
        Condicionais.verificaValorIngresso(Condicionais.idade);
    }

    private static void verificaValorIngresso(int idadePessoa){
        if (idadePessoa <= 12 || idadePessoa >= 60) {
            System.out.println("O valor do ingresso é R$10");
        }  else {
            System.out.println("O valor do ingresso é R$25");
        }
    }

    public static void perguntarLadosTriangulo(){
        System.out.println("Digite um lado do triangulo: ");
        ladoTriangulo1 = sc.nextInt();
        System.out.println("Digite o segundo lado do triangulo: ");
        ladoTriangulo2 = sc.nextInt();
        System.out.println("Digite o ultimo lado do triangulo: ");
        ladoTriangulo3 = sc.nextInt();
        verificarTipoDeTriangulo(ladoTriangulo1, ladoTriangulo2, ladoTriangulo3);
    }

    private static void verificarTipoDeTriangulo(int lado1, int lado2, int lado3){
        if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2 || lado2 == lado3 && lado1 != lado3){
            System.out.println("É um triângulo isósceles! Tem 2 lados iguais");
        } else if (lado1 == lado2 && lado1 == lado3){
            System.out.println("É um triângulo equilátero! Os 3 lados são iguais");
        }
        else {
            System.out.println("É um triângulo escaleno! Os 3 lados são diferentes");
        }
    }
}
