package org.example.aula21_atividade21Out.factory;

public class Main {
    public static void main(String[] args) {
        // 1) Qual problema o Factory resolve? O que aconteceria se os ifs que decidem qual objeto criar ficassem espalhados pelo main e por outras partes do programa, e depois surgisse um tipo novo?
        // O Factory centraliza a instanciação dos objetos do projeto em um lugar só. Se não fosse assim, precisaríamos olhar o código todo quando houvesse alguma alteração para fazer

        // 2) O método da fábrica normalmente devolve o objeto criado com qual tipo?
        // Devolve o tipo da classe concreta (ex: Cachorro)


        Animal animal1 = AnimalFactory.getAnimal("gato");
        Animal animal2 = AnimalFactory.getAnimal("cachorro");

        animal1.emitirSom();
        animal2.emitirSom();
    }
}
