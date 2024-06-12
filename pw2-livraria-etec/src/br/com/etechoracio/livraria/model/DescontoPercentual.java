package br.com.etechoracio.livraria.model;

public class DescontoPercentual implements Desconto {
    private double percentual;

    @Override
    public double aplicar(double preco) {
        return preco - (preco * percentual);
    }

    public DescontoPercentual(double percentual){
        this.percentual = percentual;
        int percentualArredondado = (int)percentual;
    }
}
