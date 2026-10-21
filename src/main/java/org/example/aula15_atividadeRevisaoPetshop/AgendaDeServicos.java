package org.example.aula15_atividadeRevisaoPetshop;

import org.example.aula15_atividadeRevisaoPetshop.servicos.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class AgendaDeServicos {
    private Scanner ler;

    private Banho darBanhoEmPet =  new Banho();
    private Tosa tosarPet = new Tosa();
    private Consulta consultaPet = new Consulta();
    private Vacina vacinarPet = new Vacina();

    private Queue<String> filaDoBanho = new ArrayDeque<>();
    private ArrayList<Servico> servicos = new ArrayList<>();

    public AgendaDeServicos(Scanner ler) {
        this.ler = new Scanner(System.in);
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

    void atenderTodosFilaDoBanho(){
        if (!filaDoBanho.isEmpty()) {
            System.out.println("Atendendo todos da fila do banho: " + filaDoBanho + "...");
            filaDoBanho.clear();
            System.out.println("Fila vazia! " +  filaDoBanho);
        } else {
            System.out.println("A fila está vazia!");
        }
    }
}
