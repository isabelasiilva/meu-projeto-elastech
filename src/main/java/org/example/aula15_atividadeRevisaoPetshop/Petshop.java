package org.example.aula15_atividadeRevisaoPetshop;

import org.example.aula15_atividadeRevisaoPetshop.servicos.*;

import java.util.*;

public class Petshop {
    private Scanner ler;
    private CadastroPet cadastroPet;

    private ArrayList<Pet> listaPets = new ArrayList<>();
//    private HashSet<String> listaEspecies =  new HashSet<>();

    public Petshop(Scanner ler) {
        this.ler = ler;
        this.cadastroPet = new CadastroPet(ler);
    }

    void cadastrarPet() {
        Pet novoPet = cadastroPet.cadastrarFichaPet();
        listaPets.add(novoPet);
        imprimirFichaDoPet(novoPet);
    }

    void imprimirFichaDoPet(Pet pet) {
        System.out.print("Nome: " + pet.getNome());
        System.out.print(" / Espécie: " + pet.getEspecie());
        System.out.print(" / Peso: " + pet.getPeso());
        System.out.println(" / Porte: " + pet.getPorte());
    }

    void imprimirPetsCadastrados(){
        System.out.println("--- PETS CADASTRADOS ---");
        for (Pet pet : listaPets) {
            System.out.println(pet.getNome() + " - " + pet.getEspecie() + " - " + pet.getPeso() + " - Porte: " + pet.getPorte());
        }
    }

    void buscarPetPeloNome() {
        System.out.println("Digite o nome do pet:");
        String busca = ler.nextLine();
        boolean condicaoBusca = false;

        for  (Pet pet : listaPets) {
            if(pet.getNome().equalsIgnoreCase(busca)){
                condicaoBusca = true;
            }
        }
        if (condicaoBusca) {
            System.out.println("O nome já está cadastrado");
        }else {
            System.out.println("O nome não está cadastrado!");
        }
    }

    void verEspeciesCadastradas() {
//            for (Pet especiePet : listaPets) {
//                listaEspecies.add(especiePet.getEspecie().toUpperCase());
//            }
//            System.out.println(listaEspecies);
//            System.out.println("Total de espécies diferentes: " + listaEspecies.size());
        Set<String> especies = new HashSet<>();
        for (Pet pet : listaPets) {
            especies.add(pet.getEspecie().toUpperCase());
        }
        System.out.println(especies);
        System.out.println("Total de espécies diferentes: " + especies.size());
    }

    void mostrarQuantosPetsCadastrados(){
        System.out.println("Total: " + listaPets.size());
    }

    void mostrarPortePetsCadastrados(){
            System.out.println("Escolha o porte pequeno, médio ou grande");
            String opcaoPorte = ler.nextLine();
            boolean encontrou = false;
            for (Pet pet : listaPets) {
                if (pet.getPorte().equalsIgnoreCase(opcaoPorte)) {
                    System.out.println(pet.getNome());
                    encontrou = true;
                }
            }
            if (!encontrou) {
                System.out.println("Não encontrado!");
            }
    }
}
