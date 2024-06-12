package br.com.etechoracio.livraria.model;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class SacolaCompras implements Oferta{

    //private double total;
    private List<Exemplar> itens = new ArrayList<>();

    public void adicionar(Exemplar item){
        System.out.println("Adicionado " +  item);

        try {
            if (item instanceof Oferta){
                ((Oferta) item).aplicarDesconto(new DescontoFixo(1));
            }
        } catch (Exception e){
            System.out.println(e.getMessage()
            );
        }

        //total = total + item.getValor();
        itens.add(item);
    }

    public void exibirItens(){
        itens.forEach(i -> System.out.println(i.getValor()));
    }

    @Override
    public void aplicarDesconto(Desconto desconto) {

    }

    public double exibirTotal(){
        /*for(int i=0; i<itens.size();i++)
            System.out.println(itens.get(i).getValor());*/
        return itens.stream().mapToDouble(i -> i.getValor()).sum();
    }
}