package org.example.aula14_07Out.interfacesAtividade.atividade3;

public class Moto implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Moto ligada");
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando");
    }
}
