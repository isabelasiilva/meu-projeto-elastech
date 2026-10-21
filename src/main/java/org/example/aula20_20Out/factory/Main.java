package org.example.aula20_20Out.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a opção");
        int opçao = sc.nextInt();

//        BancoDeDados bancoGenerico = new ...
        BancoDeDados bancoGenerico = BancoDeDadosFactory.criar(opçao); // código generico, nao importa qual vai criar pq ele vai funcionar

        bancoGenerico.proibidoFazerBarulhoAposDezHoras();
    }
}
