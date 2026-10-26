package org.example.aula22_atividadeDecorator;

public class GranolaDecorator extends AcaiDecorator {
    public GranolaDecorator(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Granola";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 3.00; // Exemplo: Granola custa R$ 3,00
    }
}
