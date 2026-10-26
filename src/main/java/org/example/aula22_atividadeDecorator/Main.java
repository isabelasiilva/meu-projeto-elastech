package org.example.aula22_atividadeDecorator;

public class Main {
    public static void main(String[] args) {
        // Acai com granola
        Acai acaiComGranola = new GranolaDecorator(new AcaiSimples());

        System.out.println("--- Pedido 1 ---");
        System.out.println("Descrição: " + acaiComGranola.getDescricao());
        System.out.println("Preço: R$ " + acaiComGranola.getPreco());


        // Acai com granola e morango (um adicional embrulhando o outro)
        Acai acaiCompleto = new MorangoDecorator(new GranolaDecorator(new AcaiSimples()));

        System.out.println("\n--- Pedido 2 ---");
        System.out.println("Descrição: " + acaiCompleto.getDescricao());
        System.out.println("Preço: R$ " + acaiCompleto.getPreco());
    }
}
