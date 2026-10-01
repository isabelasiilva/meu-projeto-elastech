package org.example.aula3_listaRevisao26Set;

import java.util.Scanner;

public class Numeros {
    Scanner sc = new Scanner(System.in);

    public static void numerosAteQuinze(){
        for (int i = 0; i <= 15; i++){
            if (i % 2 == 0){
            System.out.println(i + " é par");
            }else {
            System.out.println(i + " é ímpar");
            }
        }
    }
}
