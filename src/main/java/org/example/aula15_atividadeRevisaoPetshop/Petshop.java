package org.example.aula15_atividadeRevisaoPetshop;

import org.example.aula15_atividadeRevisaoPetshop.servicos.*;

import java.util.*;

public class Petshop {

    private int contador = 0;

    private Scanner ler;
    private CadastroPet cadastroPet;

    private ArrayList<Pet> listaPets = new ArrayList<>();
    private Banho darBanhoEmPet =  new Banho();
    private Tosa tosarPet = new Tosa();
    private Consulta consultaPet = new Consulta();
    private Vacina vacinarPet = new Vacina();

    private HashSet<String> listaEspecies =  new HashSet<>();
    private Queue<String> filaDoBanho = new ArrayDeque<>();
    private ArrayList<Servico> servicos = new ArrayList<>();

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

    void entrarNaFilaDoBanho(){
        System.out.println("Nome do pet pra entrar na fila: ");
        String nome = ler.nextLine();
        filaDoBanho.add(nome);
        System.out.println(nome + " entrou na fila.");
        System.out.println("Fila agora: " +  filaDoBanho);
    }

    void atenderProximoDaFila(){
        if (!filaDoBanho.isEmpty()) {
            System.out.println("Próximo da fila: "+filaDoBanho.peek());
            System.out.println("Atendendo " +filaDoBanho.poll() + "...");
            System.out.println("Fila agora: " +  filaDoBanho);
        } else {
            System.out.println("A fila está vazia!");
        }
    }

    void executarServico(){
        servicos.add(darBanhoEmPet);
        servicos.add(tosarPet);
        servicos.add(consultaPet);
        servicos.add(vacinarPet);

        System.out.println("Qual o nome do pet? ");
        String nome = ler.nextLine();

        for (Servico servico : servicos){
            servico.oferecerServico(nome);
        }
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

    void atenderTodosFilaDoBanho(){
        if (!filaDoBanho.isEmpty()) {
            System.out.println("Atendendo todos da fila do banho: " + filaDoBanho + "...");
            filaDoBanho.clear();
            System.out.println("Fila vazia! " +  filaDoBanho);
        } else {
            System.out.println("A fila está vazia!");
        }
    }

    public int getContador() {
        return contador;
    }

    public ArrayList<Pet> getListaPets() {
        return listaPets;
    }

    public void setListaPets(ArrayList<Pet> listaPets) {
        this.listaPets = listaPets;
    }

    public void setContador() {
        this.contador++;
    }
}
