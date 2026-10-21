package org.example.aula13_07Out.interfacesAtividade.atividade3;

public class Carro implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("Carro ligado!");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando!");
    }
}
