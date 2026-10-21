package org.example.aula14_08Out.polimorfismo;

public class Calculadora {
    final double pi = 3.14159;

    public void calcularArea(double ladoQuadrado){
        System.out.println("Área do Quadrado: " + (ladoQuadrado*ladoQuadrado));
    }

    public void calcularArea(double base, double altura){
        System.out.println("Área do quadrilátero: " + (base*altura));
    }

    public void calcularArea(int raio){
        System.out.println("Área do círculo: " + (pi*raio*raio));
    }
}
