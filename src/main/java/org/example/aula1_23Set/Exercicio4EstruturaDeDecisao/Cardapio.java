package org.example.aula1_23Set.Exercicio4EstruturaDeDecisao;

import java.util.Scanner;

public class Cardapio {
    public static void ApresentarCardapio() {
        System.out.println("Opçes do Cardapio\n 1- café \n 2- cappuccino \n 3- chocolate quente \n 4- chá \n 5- Sair");
        Cardapio.OpcaoCardapio2();
    }

    public static void OpcaoCardapio2() {
        Scanner opcaoCardapio = new Scanner(System.in);
        System.out.print("Escolha uma opção do Cardapio: ");
        int opcao = opcaoCardapio.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Você escolheu café.");
                break;
            case 2:
                System.out.println("Você escolheu cappuccino.");
                break;
            case 3:
                System.out.println("Você escolheu chocolate quente.");
                break;
            case 4:
                System.out.println("Você escolheu chá.");
                break;
            case 5:
                System.out.println("Até logo!");
                break;
            default:
                System.out.println("Opção não encontrada. Tente novamente.");
                OpcaoCardapio2();
        }

    }
}
