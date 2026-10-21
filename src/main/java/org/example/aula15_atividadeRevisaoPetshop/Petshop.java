package org.example.aula15_atividadeRevisaoPetshop;

import org.example.aula15_atividadeRevisaoPetshop.servicos.*;

import java.util.*;

public class Petshop {

    private int contador = 0;

    private Scanner ler;
    private CadastroPet cadastroPet;

    private ArrayList<Pet> listaPets = new ArrayList<>();


    private HashSet<String> listaEspecies =  new HashSet<>();


    public Petshop(Scanner ler) {
        this.ler = new Scanner(System.in);
        this.cadastroPet = new CadastroPet(ler);
    }

    void cadastrarPet() {
        Pet novoPet = cadastroPet.cadastrarFichaPet();
        listaPets.add(novoPet);
        imprimirFichaDoPet(listaPets.size() - 1);
        setContador();
    }

    void imprimirFichaDoPet(int posicao) {
        String nomePet = listaPets.get(posicao).getNome();
        String especiePet = listaPets.get(posicao).getEspecie();
        double pesoPet = listaPets.get(posicao).getPeso();
        String portePet = listaPets.get(posicao).getPorte();

        System.out.println("Nome: " + nomePet + " / Espécie: " + especiePet + " / Peso: " + pesoPet + " / Porte: " + portePet);
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
            for (Pet especiePet : listaPets) {
                listaEspecies.add(especiePet.getEspecie().toUpperCase());
            }
            System.out.println(listaEspecies);
            System.out.println("Total de espécies diferentes: " + listaEspecies.size());
    }

    void mostrarQuantosPetsCadastrados(){
        System.out.println("Total: " + listaPets.size());
    }

    void mostrarPortePetsCadastrados(){
            System.out.println("Escolha o porte pequeno, médio ou grande");
            String opcaoPorte = ler.nextLine();
            for (Pet pet : listaPets) {
                if (pet.getPorte().equalsIgnoreCase(opcaoPorte)) {
                    System.out.println(pet.getNome());
                } else {
                    System.out.println("Não encontrado!");
                }
            }
    }

    public int getContador() {
        return contador;
    }

    public void setContador() {
        this.contador++;
    }

    public ArrayList<Pet> getListaPets() {
        return listaPets;
    }

    public void setListaPets(ArrayList<Pet> listaPets) {
        this.listaPets = listaPets;
    }
}
