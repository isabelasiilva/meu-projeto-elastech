package org.example.aula21_21Out.pizzariaComLombok;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder()
                .borda("Catupiry")
                .sabor("Mussarela")
                .temQueijo(true)
                .build();

        pizza.mostrar();
    }
}
