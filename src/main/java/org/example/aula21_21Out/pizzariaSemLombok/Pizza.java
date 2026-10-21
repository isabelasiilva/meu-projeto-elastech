package org.example.aula21_21Out.pizzariaSemLombok;

public class Pizza {
    String sabor;
    boolean temQueijo;
    String borda;

//  Se fosse usar construtor
//    public Pizza(String sabor, boolean temQueijo, String borda) {
//        this.sabor = sabor;
//        this.temQueijo = temQueijo;
//        this.borda = borda;
//    }

    private Pizza(Builder builder){
        this.sabor = builder.sabor;
        this.temQueijo = builder.temQueijo;
        this.borda = builder.borda;
    }

    void mostrar(){
        System.out.println("Pizza de sabor " + this.sabor + " com a borda " + this.borda + " e com extra de queijo: " + this.temQueijo);
    }

    public static class Builder{
        String sabor;
        boolean temQueijo;
        String borda;

        public Builder sabor(String sabor){
            this.sabor = sabor;
            return this;
        }

        public Builder temQueijo(boolean temQueijo){
            this.temQueijo = temQueijo;
            return this;
        }

        public Builder borda(String borda){
            this.borda = borda;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}
