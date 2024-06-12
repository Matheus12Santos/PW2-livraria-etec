package br.com.etechoracio.livraria.model;

public class Revista implements Oferta, Exemplar {
    private String titulo;
    private double valor;
    private Editora editora;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    /*@Override
    public double getValor() {
        return valor;
    }*/

    @Override
    public void aplicarDesconto(Desconto desconto) {

    }

    @Override
    public double getValor() {
        return valor;
    }
}
