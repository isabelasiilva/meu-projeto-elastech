package org.example.aula15_atividadeRevisaoPetshop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroPet {
    private Scanner ler;

    Pet novoPet = new Pet();
    Pet cachorro = new Cachorro();
    Pet gato = new Gato();
    String nome;
    String especie;
    boolean pesoValido = false;

    public CadastroPet(Scanner ler) {
        this.ler = ler;
    }

    Pet cadastrarFichaPet() {
        System.out.println("Cadastrando Ficha de Pet");

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

        while (!pesoValido) {
            validaPeso();
        }

        return validaEspecie();
    }

    private void validaPeso() {
        double peso;
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

    private Pet validaEspecie() {
        if (novoPet.getEspecie().equalsIgnoreCase("cachorro")) {
            cachorro.setNome(novoPet.getNome());
            cachorro.setEspecie(novoPet.getEspecie());
            cachorro.setPeso(novoPet.getPeso());
            System.out.println("Foi cadastrado um cachorro com sucesso!");
            return cachorro;
        } else if (novoPet.getEspecie().equalsIgnoreCase("gato")) {
            gato.setNome(novoPet.getNome());
            gato.setEspecie(novoPet.getEspecie());
            gato.setPeso(novoPet.getPeso());
            System.out.println("Foi cadastrado um gato com sucesso!");
            return gato;
        }else {
            System.out.println("Foi cadastrado com sucesso!");
            return novoPet;
        }
    }
}
