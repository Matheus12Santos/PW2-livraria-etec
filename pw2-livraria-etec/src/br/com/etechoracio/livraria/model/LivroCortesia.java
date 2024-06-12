package br.com.etechoracio.livraria.model;

public class LivroCortesia extends Livro{

    private String marcaDagua;
    @Override
    protected void detalhar() {
        System.out.println("Marca D'agua: " + marcaDagua);
    }

    public void setValor(double valor){

    }

    public LivroCortesia(String marcaDagua){
        this.marcaDagua = marcaDagua;
        //double marcaDaguavalor = (double)marcaDagua;
    }
}
