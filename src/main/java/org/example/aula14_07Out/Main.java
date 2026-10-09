package org.example.aula14_07Out;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animais = new ArrayList<>(List.of("Cachorro, Macaco, Girafa"));

        // for
        for (int i = 0; i < animais.size(); i++) {
            System.out.println(animais.get(i));
        }

        // foreach
        for(String animal: animais){
            System.out.println(animal);
        }


    }
}
