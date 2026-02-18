package Entities;

public class PessoaJuridica extends Contribuinte {
    private int funcionarios;

    public PessoaJuridica(String nome, double rendaAnual, int funcionarios) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    @Override
    public double calcularImposto() {
        return rendaAnual * (funcionarios > 10 ? 0.14 : 0.16);
    }
}
