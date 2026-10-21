package org.example.aula15_atividadeRevisaoPetshop;

import java.util.Scanner;

public class Menu {
    private Scanner ler = new Scanner(System.in);
    private Petshop petshop;
    private AgendaDeServicos agendaDeServicos;

    public Menu() {
        this.petshop = new Petshop(ler);
        this.agendaDeServicos = new AgendaDeServicos(ler);
    }

    public void mostrarMenu() {
        boolean condicaoMenu = true;

        do {
            System.out.println("Bem vindo ao petshop. Escolha uma opcao:");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Ver lista de pets cadastrados");
            System.out.println("3 - Buscar nome na lista de pets");
            System.out.println("4 - Ver lista de espécies");
            System.out.println("5 - Entrar na fila do banho");
            System.out.println("6 - Atender o próximo");
            System.out.println("7 - Fazer pacote de serviço: banho, tosa, consulta e vacina");
            System.out.println("8 - Ver quantos pets estão cadastrados");
            System.out.println("9 - Ver porte de pets que estão cadastrados");
            System.out.println("10 - Atender todos da fila do banho");
            System.out.println("0 - Sair do sistema");

            System.out.print("Opcao: ");
            String entrada = ler.nextLine().trim();

            try {
                int opcao = Integer.parseInt(entrada);

                switch (opcao) {
                    case 0:
                        System.out.println("Ate logo!");
                        condicaoMenu = false;
                        break;
                    case 1:
                        petshop.cadastrarPet();
                        break;
                    case 2:
                        petshop.imprimirPetsCadastrados();
                        break;
                    case 3:
                        petshop.buscarPetPeloNome();
                        break;
                    case 4:
                        petshop.verEspeciesCadastradas();
                        break;
                    case 5:
                        agendaDeServicos.entrarNaFilaDoBanho();
                        break;
                    case 6:
                        agendaDeServicos.atenderProximoDaFila();
                        break;
                    case 7:
                        agendaDeServicos.executarServico();
                        break;
                    case 8:
                        petshop.mostrarQuantosPetsCadastrados();
                        break;
                    case 9:
                        petshop.mostrarPortePetsCadastrados();
                        break;
                    case 10:
                        agendaDeServicos.atenderTodosFilaDoBanho();
                        break;
                    default:
                        System.out.println("Opção invalida. Escolha entre 0 e 10.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite apenas números inteiros.");
            }

        } while (condicaoMenu);
    }
}
