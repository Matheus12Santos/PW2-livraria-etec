package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.TipoCapaEnum;
import br.com.etechoracio.livraria.exception.CampoObrigatorioException;

public abstract class Livro implements Exemplar {
    private String titulo;
    private String resumo;
    protected double valor;
    private String autor;
    private Editora editora;
    private int paginas;
    protected abstract void detalhar();
    public void exibir(){
        System.out.println("\nDetalhes do livro");
        System.out.println("Título: " + titulo);
        System.out.println("Resumo: " + resumo);
        System.out.println("Valor: " + valor);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade de páginas: " + paginas);
        detalhar();
        editora.exibir();
    }


    String formatarValor(double param){
        return String.format("R$ %.2f", param);
    }

    //Criar o método de aplicar desconto de 15% sobre o valor do livro

    void aplicarDesconto(){
        //valor = valor - (valor * 0.15);
        //valor -= valor * 0.15
        aplicarDesconto(0.15);
    }

    //Criar um método para apicar um percentual de desconto que vai ser passado por parametro (sobre o valor do livro)
    public void aplicarDesconto(double percentual){
        if (percentual > 0.2) {
            System.out.println("Desconto nao pode ser maior que 20%");
        } else {
            valor = valor - (valor * percentual);
        }
    }

    public void setValor(double valor) {
        this.valor = valor;
        //cobrarCapa();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo.toUpperCase();
    }

    public double getValor() {
        return valor;
    }
}
