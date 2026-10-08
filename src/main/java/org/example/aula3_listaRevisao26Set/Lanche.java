package org.example.aula3_listaRevisao26Set;

import java.util.Scanner;

public class Lanche {
    public static void opcaoLanche(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do seu lanche: ");
        String nomeLanche = sc.nextLine();
        System.out.print("Digite o valor do seu lanche (use , se houver casas decimais): ");
        double precoLanche = sc.nextDouble();
        //System.out.print("Seu lanche é " + nomeLanche + " e o valor R$" + precoLanche);

        if (precoLanche > 30){
            double aplicarDesconto = precoLanche - 5;
            System.out.printf("Seu lanche é %s e o valor dele com desconto é %.2f \n", nomeLanche, aplicarDesconto);
        } else {
            System.out.printf("Seu lanche é %s e o valor dele é %.2f \n", nomeLanche, precoLanche);
        }

    }
}
