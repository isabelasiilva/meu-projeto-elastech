package org.example.aula12_05Out;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    ArrayList
        .add(valor);
        .add(posição, valor)
        .get();
        .size();
        .contains();
        .indexOf();
        .remove();
        .set();
        .isEmpty();
        .addAll(List.of());

      Hashmap
     */


    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(15);

        System.out.println(lista);

        // adicionar varios valores de uma vez
        lista.addAll(List.of(13,20,33,25,3)); // adicionando varios valores de uma vez

        // pega o valor que esta na posição 3
        System.out.println(lista.get(3));

        // retirou o numero que estava na posição 2
        lista.remove(2);
        System.out.println(lista);

        // muda o numero que ta na posição 0 para o valor 9
        lista.set(0,9);
        System.out.println(lista);


//        ArrayList<String> listaNome = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite o nome: ");
//        String nome = sc.nextLine();
//        listaNome.add(nome);
//        System.out.println(listaNome);
    }
}
