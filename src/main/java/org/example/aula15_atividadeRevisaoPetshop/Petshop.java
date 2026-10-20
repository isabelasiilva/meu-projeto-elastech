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

    public Petshop() {
        this.ler = new Scanner(System.in);
        this.cadastroPet = new CadastroPet(ler);
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
                        listaPets.add(cadastroPet.cadastrarFichaPet());
                        imprimirFichaDoPet(contador);
                        contador++;
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
                        entrarNaFilaDoBanho();
                        break;
                    case 6:
                        atenderProximoDaFila();
                        break;
                    case 7:
                        executarServico();
                        break;
                    case 8:
                        mostrarQuantosPetsCadastrados();
                        break;
                    case 9:
                        mostrarPortePetsCadastrados();
                        break;
                    case 10:
                        atenderTodosFilaDoBanho();
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



    private void imprimirFichaDoPet(int posicao) {
        String nomePet = listaPets.get(posicao).getNome();
        String especiePet = listaPets.get(posicao).getEspecie();
        double pesoPet = listaPets.get(posicao).getPeso();
        String portePet = listaPets.get(posicao).getPorte();

        System.out.println("Nome: " + nomePet + " / Espécie: " + especiePet + " / Peso: " + pesoPet + " / Porte: " + portePet);
    }

    private void imprimirPetsCadastrados(){
        System.out.println("--- PETS CADASTRADOS ---");
        for (Pet pet : listaPets) {
            System.out.println(pet.getNome() + " - " + pet.getEspecie() + " - " + pet.getPeso() + " - Porte: " + pet.getPorte());
        }
    }

    private void buscarPetPeloNome() {
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

    private void verEspeciesCadastradas() {
            for (Pet especiePet : listaPets) {
                listaEspecies.add(especiePet.getEspecie().toUpperCase());
            }
            System.out.println(listaEspecies);
            System.out.println("Total de espécies diferentes: " + listaEspecies.size());
    }

    private void entrarNaFilaDoBanho(){
        System.out.println("Nome do pet pra entrar na fila: ");
        String nome = ler.nextLine();
        filaDoBanho.add(nome);
        System.out.println(nome + " entrou na fila.");
        System.out.println("Fila agora: " +  filaDoBanho);
    }

    private void atenderProximoDaFila(){
        if (!filaDoBanho.isEmpty()) {
            System.out.println("Próximo da fila: "+filaDoBanho.peek());
            System.out.println("Atendendo " +filaDoBanho.poll() + "...");
            System.out.println("Fila agora: " +  filaDoBanho);
        } else {
            System.out.println("A fila está vazia!");
        }
    }

    private void executarServico(){
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

    private void mostrarQuantosPetsCadastrados(){
        System.out.println("Total: " + listaPets.size());
    }

    private void mostrarPortePetsCadastrados(){
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

    private void atenderTodosFilaDoBanho(){
        if (!filaDoBanho.isEmpty()) {
            System.out.println("Atendendo todos da fila do banho: " + filaDoBanho + "...");
            filaDoBanho.clear();
            System.out.println("Fila vazia! " +  filaDoBanho);
        } else {
            System.out.println("A fila está vazia!");
        }
    }
}
