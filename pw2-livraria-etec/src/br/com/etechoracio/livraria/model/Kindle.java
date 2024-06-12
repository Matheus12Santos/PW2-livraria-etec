package br.com.etechoracio.livraria.model;

public class Kindle extends Livro implements Oferta{
    private String marcaDAgua;

    @Override
    public void aplicarDesconto(double percentual) {
        if (percentual > 0.2) {
            System.out.println("Desconto nao pode ser maior que 20%");
        } else {
            super.aplicarDesconto(percentual);
        }
    }

    @Override
    protected void detalhar(){
        System.out.println("Marca D'água: " + marcaDAgua);
    }

    @Override
    public void aplicarDesconto(Desconto desconto) {
        this.valor = desconto.aplicar(this.valor);
    }
}
