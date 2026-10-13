package org.example.aula15_08Out.polimorfismo;

public class Painel {
    public void exibir(String resultadoTexto){
        System.out.println("Recebeu texto: " + resultadoTexto);
    }
    public void exibir(int resultadoInt){
        System.out.println("Recebeu int: " + resultadoInt);
    }
    public void exibir(boolean resultadoBool){
        System.out.println("Recebeu boolean: " + resultadoBool);
    }
    public void exibir(double resultadoDouble){
        System.out.println("Recebeu double: " + resultadoDouble);
    }
}
