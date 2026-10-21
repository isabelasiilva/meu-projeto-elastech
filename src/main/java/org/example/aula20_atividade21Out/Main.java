package org.example.aula20_atividade21Out;

import javax.tools.Diagnostic;

public class Main {
    public static void main(String[] args) {
//        Usando construtor
//        Agendamento agendamento1 = new Agendamento("Thor", "Banho", "14h", true, true, false, "Alergico a shampoo", 10);
//        Agendamento agendamento2 = new Agendamento("Luna", "Tosa", "10h", false, false, false, "", 0);
//        Agendamento agendamento3 = new Agendamento("Mel", "Banho", "16h", false, false, true, "", 0);

        // Usando @Builder - começa com .builder() e termina com .build() - não tem ordem e não precisa do new
        Agendamento agendamento1 = Agendamento.builder().nomePet("Thor").laco(true).desconto(10).hidratacao(true).servico("Banho").perfume(true).horario("14h").observacao("Alergico a shampoo").build();

        Agendamento agendamento2 = Agendamento.builder().nomePet("Luna").servico("Tosa").horario("10h").laco(true).hidratacao(false).perfume(false).build();

        Agendamento agendamento3 = Agendamento.builder().nomePet("Mel").servico("Banho").horario("16h").laco(false).hidratacao(false).perfume(true).build();

        agendamento1.mostrar();
        System.out.println("------------");
        agendamento2.mostrar();
        System.out.println("------------");
        agendamento3.mostrar();
    }
}
