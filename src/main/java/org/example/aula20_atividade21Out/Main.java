package org.example.aula20_atividade21Out;

import javax.tools.Diagnostic;

public class Main {
    public static void main(String[] args) {
        Agendamento agendamento1 = new Agendamento("Thor", "Banho", "14h", true, true, false, "Alergico a shampoo", 10);
        Agendamento agendamento2 = new Agendamento("Luna", "Tosa", "10h", false, false, false, "", 0);
        Agendamento agendamento3 = new Agendamento("Mel", "Banho", "16h", false, false, true, "", 0);

        System.out.printf("Agendamento 1: %s , %s , %s , %b , %b , %b, %s , %.0f \n", agendamento1.getNomePet(), agendamento1.getServico(), agendamento1.getHorario(), agendamento1.isPerfume(), agendamento1.isLaco(), agendamento1.isHidratacao(), agendamento1.getObservacao(), agendamento1.getDesconto() );

        System.out.printf("Agendamento 2: %s , %s , %s , %b , %b , %b, %s , %.0f \n", agendamento2.getNomePet(), agendamento2.getServico(), agendamento2.getHorario(), agendamento2.isPerfume(), agendamento2.isLaco(), agendamento2.isHidratacao(), agendamento2.getObservacao(), agendamento2.getDesconto() );

        System.out.printf("Agendamento 3: %s , %s , %s , %b , %b , %b, %s , %.0f \n", agendamento3.getNomePet(), agendamento3.getServico(), agendamento3.getHorario(), agendamento3.isPerfume(), agendamento3.isLaco(), agendamento3.isHidratacao(), agendamento3.getObservacao(), agendamento3.getDesconto() );
    }
}
