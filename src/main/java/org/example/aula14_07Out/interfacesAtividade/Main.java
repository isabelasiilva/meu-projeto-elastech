package org.example.aula14_07Out.interfacesAtividade;

import org.example.aula14_07Out.interfacesAtividade.atividade1.Animal;
import org.example.aula14_07Out.interfacesAtividade.atividade1.Cachorro;
import org.example.aula14_07Out.interfacesAtividade.atividade1.Gato;
import org.example.aula14_07Out.interfacesAtividade.atividade2.Email;
import org.example.aula14_07Out.interfacesAtividade.atividade2.Notificacao;
import org.example.aula14_07Out.interfacesAtividade.atividade2.Sms;
import org.example.aula14_07Out.interfacesAtividade.atividade3.Carro;
import org.example.aula14_07Out.interfacesAtividade.atividade3.Moto;
import org.example.aula14_07Out.interfacesAtividade.atividade3.Veiculo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> animais = new ArrayList<>(List.of("Cachorro, Macaco, Girafa"));

//        // for
//        for (int i = 0; i < animais.size(); i++) {
//            System.out.println(animais.get(i));
//        }
//
//        // foreach
//        for(String animal: animais){
//            System.out.println(animal);
//        }

        System.out.println("--- Exercício 1 ---");
        Animal cachorro = new Cachorro();
        cachorro.emitirSom();

        System.out.println("--- Exercício 2 ---");
        Animal gato = new Gato();
        gato.emitirSom();

        System.out.println("--- Exercício 3 ---");
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        for (Animal animal : animais) {
            animal.emitirSom();
        }

        System.out.println("--- Exercício 4 ---");
        Notificacao notificacao1 = new Email();
        Notificacao notificacao2 = new Sms();

        ArrayList<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(notificacao1);
        notificacoes.add(notificacao2);
        for (Notificacao notificacao : notificacoes) {
            notificacao.enviarMensagem("Olá, bem vindo ao sistema!");
        }

        System.out.println("--- Exercício 5 ---");
        Veiculo mobi = new Carro();
        Veiculo bizz = new Moto();

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(mobi);
        veiculos.add(bizz);

        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar();
        }

    }
}
