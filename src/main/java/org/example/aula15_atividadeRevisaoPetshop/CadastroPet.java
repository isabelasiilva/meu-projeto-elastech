package org.example.aula15_atividadeRevisaoPetshop;

import org.example.aula15_atividadeRevisaoPetshop.pets.Cachorro;
import org.example.aula15_atividadeRevisaoPetshop.pets.Gato;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroPet {
    private Scanner ler;

    private boolean pesoValido = false;
    private String especie;

    public CadastroPet(Scanner ler) {
        this.ler = ler;
    }

    Pet cadastrarFichaPet() {
        Pet novoPet = new Pet();
        String nome;

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
            validaEspecie(novoPet);
        } while (especie.isEmpty());

        // Valida peso
        while (!pesoValido) {
            validaPeso(novoPet);
        }

        return novoPet;
    }

    private void validaPeso(Pet petCriado) {
        double peso;
        System.out.println("Digite o peso:");
        try {
            peso = ler.nextDouble();
            ler.nextLine(); // limpa o buffer

            if (peso <= 0) {
                System.out.println("Erro: o peso deve ser maior que zero.");
            } else {
                petCriado.setPeso(peso);
                pesoValido = true;
            }
        } catch (InputMismatchException ime) {
            System.out.println("Erro: digite um número válido para o peso.");
            ler.nextLine(); // descarta a entrada inválida
        }
    }

    private Pet validaEspecie(Pet petCriado) {
        Pet cachorro = new Cachorro();
        Pet gato = new Gato();

        System.out.println("Digite a especie:");
        especie = ler.nextLine().trim();
        if (especie.isEmpty()) {
            System.out.println("Erro: a especie não pode estar vazia.");
        }
        petCriado.setEspecie(especie);

        if (petCriado.getEspecie().equalsIgnoreCase("cachorro")) {
            cachorro.setNome(petCriado.getNome());
            cachorro.setEspecie(petCriado.getEspecie());
            cachorro.setPeso(petCriado.getPeso());
//            System.out.println("Inserindo um cachorro com sucesso!");
            return cachorro;
        } else if (petCriado.getEspecie().equalsIgnoreCase("gato")) {
            gato.setNome(petCriado.getNome());
            gato.setEspecie(petCriado.getEspecie());
            gato.setPeso(petCriado.getPeso());
//            System.out.println("Foi cadastrado um gato com sucesso!");
            return gato;
        }else {
//            System.out.println("Foi cadastrado com sucesso!");
            return petCriado;
        }
    }
}
