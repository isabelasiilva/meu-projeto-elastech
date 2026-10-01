package org.example.aula3_listaRevisao26Set;

import java.util.Scanner;

public class Loja {

    public static void exibirMenu(){

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
        System.out.println("Bem vindo à loja de roupas. Escolha sua opção:\n 1- Ver camisas \n 2- Ver calças \n 3- Sair");
        opcao = sc.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Essas são as camisas disponiveis...");
                break;
            case 2:
                System.out.println("Essas são as calças disponiveis...");
                break;
            case 3:
                System.out.println("Até a próxima!");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente!");
                exibirMenu();
        }
        } while (opcao== 1 || opcao == 2);
    }
}
