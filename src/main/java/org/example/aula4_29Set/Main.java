package org.example.aula4_29Set;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "  Isabela Silva ";

        System.out.println(nome.length()); // quantidade de caracteres
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.contains("a")); // true or false
        System.out.println(nome.charAt(3)); // qual char esta naquela posição
        System.out.println(nome.substring(0, 4)); // marca onde vc quer que inicia e até onde quer que termine
        System.out.println(nome.replace("a", "x"));
        System.out.println(nome.replace("Silva", "Cruz"));
        System.out.println(nome.trim()); // remove apenas no inicio e fim da string
        System.out.println(nome.equals("isabela Silva")); // true or false
        System.out.println(nome.equals("Isabela Silva")); // true or false
        System.out.println(nome.equalsIgnoreCase("isabela")); // compara ignorando o sensitive case

        System.out.println(nome.trim().toLowerCase().equals("isabela silva")); // encadeando metodos


        System.out.println("Exercício 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome completo?");
        String nomeCompleto = sc.nextLine();
        System.out.println("Seu nome completo tem " + nomeCompleto.length() + " caracteres.\n");

        System.out.println("Qual seu nome?");
        String nome1 = sc.nextLine();
        System.out.println("Seu nome completo em letras maiúsculas é " + nome1.toUpperCase());
        System.out.println("Seu nome completo em letras minúsculas é " + nome1.toLowerCase() + "\n");

        System.out.println("Qual seu nome?");
        String nome2 = sc.nextLine();
        System.out.println("A primeira letra do seu nome é " + nome2.trim().charAt(0) + "\n");

        System.out.println("Diga uma frase: ");
        String frase = sc.nextLine();
        System.out.println("Diga uma palavra: ");
        String palavra = sc.nextLine();
        System.out.printf("Sua palavra " + palavra + " está contida na frase: "+ frase + " : "+ frase.contains(palavra) + "\n");

        System.out.println("Qual seu nome?");
        String nome3 = sc.nextLine();
        System.out.println("Qual seu nome novamente?");
        String nome4 = sc.nextLine();
        System.out.println("Os dois nomes correspondem? " + nome3.toLowerCase().equals(nome4.toLowerCase()) + "\n");

        System.out.println("Qual seu nome?");
        String nome5 = sc.nextLine();
        System.out.println("Qual sua idade?");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Oi " +  nome5 + ", você tem " + idade + " anos e vai fazer " + (idade + 1)  + " no próximo aniversário.");

        System.out.println("Exercício 2");
        System.out.println("Diga um numero inteiro: ");
        int numero1 = sc.nextInt();
        System.out.println("Agora diga outro numero inteiro: ");
        int numero2 = sc.nextInt();
        System.out.println("A soma deles é " + (numero1 + numero2));
        System.out.println("A subtração deles é " + (numero1 - numero2));
        System.out.println("A multiplicação deles é " + (numero1 * numero2));
        System.out.println("A divisão deles é " + (numero1 / numero2));
        System.out.println("O resto da divisão deles é " + (numero1 % numero2));

        System.out.println("Exercício 3");
        System.out.println("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        if (nota >= 7){
            System.out.println("Aluno aprovado");
        } else if (nota >= 5 && nota < 7){
            System.out.println("Aluno de recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }

        System.out.println("Exercício 4");
        // Peça um número e mostre a tabuada dele de 1 a 10.
        System.out.println("Digite um número inteiro: ");
        int numeroTabuada = sc.nextInt();
        System.out.println("A tabuada desse número é:");
        for (int i = 1; i < 11; i++) {
            System.out.println(numeroTabuada + " x " + i + " = " + numeroTabuada * i);
        }

        System.out.println("Exercício 1 - Loops");
        for(int i = 1; i<=30; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Exercício 3 - Loops");
        int numeroLoop = 0;
        while (numeroLoop <= 30) {
            System.out.print(numeroLoop + " ");
            numeroLoop++;
        }
        System.out.println();

        System.out.println("Exercício 2 - Loops");
        for(int i = 10; i>=1; i--){
            System.out.print(i + " ");
            if(i==1){
                System.out.print("Fim");
            }
        }
        System.out.println();

        System.out.println("Exercicio 4 - Loops");
        System.out.println("Digite um número para a tabuada");
        int numeroTabuada2 = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada2 +" x " + i + " = " + (numeroTabuada2 * i));
        }

        sc.close();
    }
}
