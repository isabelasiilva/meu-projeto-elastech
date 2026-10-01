package org.example.aula3_listaRevisao26Set;

import java.util.Scanner;

public class Alunos {
    double primeiraNota;
    double segundaNota;
    double mediaNotas;
    String nome;
    boolean passou;
    static int quantidadeDeAlunas = 0;

    public static void mostrarMenu(){
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        while(opcao != 2){
            System.out.println("Deseja iniciar? Pressione 1 continuar, 2 para sair ou 3 para ver quantas alunas foram adicionadas");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                case 3:
                    System.out.println("Total de alunas adicionadas: " + quantidadeDeAlunas);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static void adicionarAluno() {
        Alunos aluno = new Alunos();
        quantidadeDeAlunas = quantidadeDeAlunas + 1;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

            System.out.print("Digite a nota 1:");
            aluno.primeiraNota = sc.nextDouble();
            while (aluno.primeiraNota < 0 || aluno.primeiraNota > 10) {
                System.out.println("Nota inválida. Tente novamente.");
                aluno.primeiraNota = sc.nextDouble();
            }

            System.out.print("Digite a nota 2:");
            aluno.segundaNota = sc.nextDouble();
            while (aluno.segundaNota < 0 || aluno.segundaNota > 10) {
            System.out.println("Nota inválida. Tente novamente.");
            aluno.segundaNota = sc.nextDouble();
            }

            System.out.print("Digite o nome do aluno:");
            aluno.nome = sc1.nextLine();

            aluno.mediaNotas = (aluno.primeiraNota + aluno.segundaNota)/2;

            if (aluno.mediaNotas >= 6) {
                aluno.passou = true;
            } else {
                aluno.passou = false;
            }
            System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f, e sua média final foi %.1f. Aluna %s%n\n", aluno.nome, aluno.primeiraNota, aluno.segundaNota, aluno.mediaNotas, aluno.passou ? "aprovada" : "reprovada");
    }
}

