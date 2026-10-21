package org.example.aula21_21Out.pizzariaSemLombok;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .borda("Catupiry")
                .sabor("Mussarela")
                .temQueijo(true)
                .build();

        pizza.mostrar();
    }
}
