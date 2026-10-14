package org.example.aula15_atividadeRevisaoPetshop;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Petshop {
    Pet[] listaPets = new Pet[5];
    int contador = 0;
    Scanner ler = new Scanner(System.in);
    boolean condicaoMenu = true;
    HashSet<String> listaEspecies =  new HashSet<>();

    void mostrarMenu() {
        boolean condicaoMenu = true;

        do {
            System.out.println("Bem vindo ao petshop. Escolha uma opcao:");
            System.out.println("1 - cadastrar pet");
            System.out.println("2 - ver lista de pets cadastrados");
            System.out.println("3 - buscar nome na lista de pets");
            System.out.println("4 - ver lista de espécies");
            System.out.println("5 - entrar na fila de banho");
            System.out.println("6 - atender o próximo");
            System.out.println("0 - sair do sistema");

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
                        cadastrarFichaPet();
                        break;
                    case 2:
                        imprimirPetsCadastrados();
                        break;
                    case 3:
                        buscarPetPeloNome();
                        break;
                    case 4:
                        verEspeciesCadastradas();
                        break;
                    case 5:
                        System.out.println("Entrando na fila de banho!");
                        break;
                    case 6:
                        System.out.println("Atendendo o próximo");
                        break;
                    default:
                        System.out.println("Opcao invalida. Escolha entre 0 e 3.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite apenas numeros inteiros.");
            }

        } while (condicaoMenu);
    }

    private void cadastrarFichaPet() {
        System.out.println("Cadastrando Ficha de Pet");
        Pet novoPet = new Pet();
        String nome;
        String especie;
        double peso;

        // Valida nome
        do {
            System.out.println("Digite o nome:");
            nome = ler.nextLine().trim();
            if (nome.isEmpty()) {
                System.out.println("Erro: o nome não pode estar vazio.");
            }
            novoPet.setNome(nome);
        } while (nome.isEmpty());

        // Valida espécie
        do {
            System.out.println("Digite a especie:");
            especie = ler.nextLine().trim();
            if (especie.isEmpty()) {
                System.out.println("Erro: a especie não pode estar vazia.");
            }
            novoPet.setEspecie(especie);
        } while (especie.isEmpty());

        // Valida peso
        boolean pesoValido = false;
        while (!pesoValido) {
            System.out.println("Digite o peso:");
            try {
                peso = ler.nextDouble();
                ler.nextLine(); // limpa o buffer

                if (peso <= 0) {
                    System.out.println("Erro: o peso deve ser maior que zero.");
                } else {
                    novoPet.setPeso(peso);
                    pesoValido = true;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Erro: digite um número válido para o peso.");
                ler.nextLine(); // descarta a entrada inválida
            }
        }

        System.out.println("Foi cadastrado com sucesso!");
        listaPets[contador] = novoPet;
        imprimirFichaDoPet();
        contador++;
    }

    private void imprimirFichaDoPet() {
        System.out.println(listaPets[contador].getNome() + " (" +
                        listaPets[contador].getEspecie() + ") - " +
                        listaPets[contador].getPeso() + " - " +
                        listaPets[contador].verificaPorteDoPet());
    }

    private void imprimirPetsCadastrados(){
        if (listaPets[0] == null) {
            System.out.println("Sem registros cadastrados!");
        } else {
            System.out.println("--- PETS CADASTRADOS ---");
            for (int i = 0; i < contador; i++) {
                System.out.println(listaPets[i].getNome() + " (" + listaPets[i].getEspecie() + ") - " + listaPets[i].getPeso() + " - " + listaPets[i].verificaPorteDoPet());
            }
        }
    }

    private void buscarPetPeloNome() {
        System.out.println("Digite o nome do pet:");
        String busca = ler.nextLine();
        boolean condicaoBusca = false;
        int posicaoEncontrada = 0;


        for  (int i = 0; i < contador; i++) {
            if (listaPets[i].getNome().equalsIgnoreCase(busca)) {
                condicaoBusca = true;
                posicaoEncontrada = i;
            }
        }

        if (condicaoBusca) {
            System.out.println("O nome já está cadastrado!");
            System.out.println(listaPets[posicaoEncontrada].getNome() + " (" +
                    listaPets[posicaoEncontrada].getEspecie() + ") - " +
                    listaPets[posicaoEncontrada].getPeso() + " - Porte: " +
                    listaPets[posicaoEncontrada].verificaPorteDoPet());
        } else {
            System.out.println("O nome não está cadastrado!");
        }
    }

    private void verEspeciesCadastradas() {
        if (listaPets[0] != null) {
            for (int i = 0; i < contador; i++) {
                listaEspecies.add(listaPets[i].getEspecie());
            }
            System.out.println(listaEspecies);
            System.out.println("Total de espécies diferentes: " + listaEspecies.size());
        } else {
            System.out.println("Nenhum Pet encontrado!");
        }
    }
}
