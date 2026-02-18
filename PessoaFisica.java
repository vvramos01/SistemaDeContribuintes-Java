package Entities;

public class PessoaFisica extends Contribuinte {
    private double gastosSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calcularImposto() {
        double imposto = rendaAnual < 20000 ? rendaAnual * 0.15 : rendaAnual * 0.25;
        imposto -= gastosSaude * 0.5;
        return imposto;
    }
}
