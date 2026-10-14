package org.example.aula15_atividadeRevisaoPetshop;

import java.util.*;

public class Petshop {
    int contador = 0;
    boolean condicaoMenu = true;

    Scanner ler = new Scanner(System.in);
    Pet[] listaPets = new Pet[5];
    Banho darBanhoEmPet =  new Banho();
    Tosa tosarPet = new Tosa();
    Consulta consultaPet = new Consulta();
    Vacina vacinarPet = new Vacina();

    HashSet<String> listaEspecies =  new HashSet<>();
    Queue<String> filaDoBanho = new ArrayDeque<>();
    ArrayList<Servico> servicos = new ArrayList<>();

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
        if (contador < listaPets.length) {
            System.out.println("Cadastrando Ficha de Pet");
            Pet novoPet = new Pet();
            Cachorro cachorro = new Cachorro();
            Gato gato = new Gato();
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

            if (novoPet.getEspecie().equalsIgnoreCase("cachorro")) {
                cachorro.setNome(novoPet.getNome());
                cachorro.setEspecie(novoPet.getEspecie());
                cachorro.setPeso(novoPet.getPeso());
                System.out.println("Foi cadastrado um cachorro com sucesso!");
                listaPets[contador] = cachorro;
            } else if (novoPet.getEspecie().equalsIgnoreCase("gato")) {
                gato.setNome(novoPet.getNome());
                gato.setEspecie(novoPet.getEspecie());
                gato.setPeso(novoPet.getPeso());
                System.out.println("Foi cadastrado um gato com sucesso!");
                listaPets[contador] = gato;
            }else {
                System.out.println("Foi cadastrado com sucesso!");
                listaPets[contador] = novoPet;
            }

            imprimirFichaDoPet();
            contador++;
        } else {
            System.out.println("Cadastro cheio!");
        }
    }

    private void imprimirFichaDoPet() {
        System.out.println(listaPets[contador].getNome() + " (" +
                        listaPets[contador].getEspecie() + ") - " +
                        listaPets[contador].getPeso() + " - Porte: " +
                        listaPets[contador].verificaPorteDoPet());
    }

    private void imprimirPetsCadastrados(){
        if (listaPets[0] == null) {
            System.out.println("Sem registros cadastrados!");
        } else {
            System.out.println("--- PETS CADASTRADOS ---");
            for (int i = 0; i < contador; i++) {
                System.out.println(listaPets[i].getNome() + " (" + listaPets[i].getEspecie() + ") - " + listaPets[i].getPeso() + " - " + listaPets[i].verificaPorteDoPet());
                listaPets[i].emitirSom();
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
            //darBanhoEmPet.oferecerServico(filaDoBanho.poll());
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
        if (listaPets[0] == null) {
            System.out.println("Sem registros cadastrados!");
        } else {
            System.out.println("Total: " + contador);
        }
    }
}
