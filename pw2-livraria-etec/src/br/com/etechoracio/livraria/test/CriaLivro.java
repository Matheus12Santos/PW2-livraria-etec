package br.com.etechoracio.livraria.test;

import br.com.etechoracio.livraria.enums.TipoCapaEnum;
import br.com.etechoracio.livraria.model.*;

public class CriaLivro {
    public static void main(String[] args) {
        Editora rocco = new Editora();
        rocco.nome = "Rocco";
        rocco.site = "rocco.com.br";

        LivroImpresso primeiroLivro = new LivroImpresso();
        primeiroLivro.setTitulo("Harry Potter");
        primeiroLivro.setEditora(rocco);
        primeiroLivro.setTipoCapa(TipoCapaEnum.PERSONALIZADA);
        primeiroLivro.setValor(100);
        primeiroLivro.aplicarDesconto(0.1);
        primeiroLivro.exibir();

        LivroImpresso segundoLivro = new LivroImpresso();
        segundoLivro.setTitulo("Jogos Vorazes");
        segundoLivro.setTitulo("Suzanne Collins");
        //segundoLivro.tipoCapa = br.com.etechoracio.livraria.enums.TipoCapaEnum.COMUM;
        segundoLivro.setEditora(rocco);
        segundoLivro.setValor(100);
        segundoLivro.aplicarDesconto(0.20);
        segundoLivro.exibir();

        Kindle terceiroLivro = new Kindle();
        terceiroLivro.setTitulo("Vagabond");
        terceiroLivro.setEditora(rocco);
        terceiroLivro.setValor(70);
        terceiroLivro.aplicarDesconto(0.05);
        terceiroLivro.exibir();

        SacolaCompras sacola2304 = new SacolaCompras();
        sacola2304.adicionar(primeiroLivro);
        sacola2304.adicionar(segundoLivro);
        sacola2304.adicionar(terceiroLivro);

        Revista primeiraRevista = new Revista();
        primeiraRevista.setTitulo("Horácio Magazine");
        primeiraRevista.setValor(15.99);

        sacola2304.adicionar(primeiraRevista);
        sacola2304.exibirItens();


    }
}
