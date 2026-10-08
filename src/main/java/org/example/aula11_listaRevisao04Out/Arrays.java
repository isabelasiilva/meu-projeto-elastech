package org.example.aula11_listaRevisao04Out;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays {
    static String[] nomes = {"Isabela", "Rafael", "Ronaldo", "Yasmin", "Micaela"};
    static String[] nomesDesafio = {"Felipe", "Flora", "Fabiana", "Fernanda", "Frida"};
    static int[] notas = {8, 6, 10, 7, 9};
    static int[] numeros = {8, 5, 10, 4, 7};

    static Scanner sc = new Scanner(System.in);

    public static void imprimirArrayNomes(int posicao){
        System.out.println(nomes[posicao]);
    }

    public static void imprimirArrayNotas(){
        for (int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
    }

    public static void calcularArrayNotas(){
        int soma = 0;
        int media = 0;

        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        media = soma / notas.length;

        System.out.println("A soma do array é " + soma);
        System.out.println("A média do array é " + media);
    }

    public static void verificarNumeros(){
        int contador = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] <= 7){
                contador++;
            }
        }
        System.out.println("Há " + contador + " números maiores ou iguais a 7 no array numeros = {8, 5, 10, 4, 7}");
    }

    public static void perguntarNomesDesafio(){
        int verificador = -1;
        System.out.println("Envie um nome para verificar se está na lista:");
        String inputUser = sc.nextLine();

        for (int i = 0; i < nomesDesafio.length; i++){
            if (nomesDesafio[i].equals(inputUser)){
                verificador = i;
            }
        }
        if (verificador == -1){
            System.out.println("Não foi encotrado nenhum nome igual a " + inputUser);
        } else {
            System.out.println("Encontramos um nome na lista igual a " + inputUser + " na posição " + verificador);
        }
    }
}
