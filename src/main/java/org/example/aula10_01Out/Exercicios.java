package org.example.aula10_01Out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        System.out.println("Exercício 1:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Envie um número para ser numerador: ");
        int numero1 = sc.nextInt();
        System.out.println("Envie outro número para ser denominador: ");
        int numero2 = sc.nextInt();

        try {
            int divisao = numero1 / numero2;
            System.out.println(divisao);
        } catch (ArithmeticException ae) {
            System.out.println("Não dá pra dividir por zero! Tente novamente.");
        }


        System.out.println("Exercício 2:");
        double[] notas = {8.5, 6.75, 9, 7.25, 8};
        System.out.println("Escolha uma posição de 0 à 4 para ver a nota:");

        try {
            int posicao = sc.nextInt();
            System.out.println(notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Não existe essa posição, escolha entre 0 e 4!");
        }


        System.out.println("Exercício 3:");
        System.out.println("Qual sua idade?");
        try{
            int idade = sc.nextInt();
            System.out.println("Sua idade é " + idade);
        } catch(InputMismatchException ime){
            System.out.println("Só aceitamos números inteiros para idade");
        }


        System.out.println("Exercício 4:");
        String nome = null;
        try {
            System.out.println(nome.length());
        }catch (NullPointerException npe) {
            System.out.println("O nome não foi preenchido.");
        }


        System.out.println("Exercício 5:");
        System.out.println("Digite um número: ");

        try{
            int n = sc.nextInt();
            System.out.println("O resto da divisão por 100 = " + (100 % n));
        } catch (ArithmeticException ae) {
            System.out.println("Não dá pra dividir por zero! Tente novamente");
        }

        System.out.println("Exercício 6:");
        String[] nomes = {"Isabela", "Mariana", "Juliana"};

        try{
            System.out.println("Escolha uma posição de 0 à 2");
            int opcaoNumero = 5;
            System.out.println(nomes[opcaoNumero]);
        }catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Essa posição não existe.");
        }finally {
            System.out.println("O programa continua funcionando.");
        }
    }
}
