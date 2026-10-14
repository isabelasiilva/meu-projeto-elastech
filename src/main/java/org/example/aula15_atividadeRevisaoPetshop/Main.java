package org.example.aula15_atividadeRevisaoPetshop;

public class Main {
    public static void main(String[] args) {
        //Petshop cachorro1 = new Petshop("Lili", "Vira-Lata", 5.5);
        //cachorro1.imprimirFichaPet();

        //Petshop cachorro2 = new Petshop();
        //cachorro2.cadastrarFichaPet();

        //Petshop cachorro = new Petshop();
        //cachorro.cadastrarFichaPet();

        //Pet[] listaPets = new Pet[5];

        Petshop petshop = new Petshop();
        petshop.mostrarMenu();

//        Pet cachorro2 = new Pet();
//        cachorro2.setNome("Lili");
//        cachorro2.setEspecie("Cachorro");
//        cachorro2.setPeso(5.4);
//
//        mostrarInformacoes(cachorro2);
//        mostrarInformacoes(cachorro2, "aaa");
    }
//        public static void mostrarInformacoes(Pet pet){
//            System.out.println("Nome: " + pet.getNome());
//        }
//
//        public static void mostrarInformacoes(Pet pet, String titulo){
//            titulo = "=== FICHA DO PET ===";
//            System.out.println(pet.getNome() + " (" +
//                    pet.getEspecie() + ") - " +
//                    pet.getPeso() + " - Porte: " +
//                    pet.verificaPorteDoPet());
//        }
}
