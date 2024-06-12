package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.exception.ValorDescontoException;
import br.com.etechoracio.livraria.exception.ValorNegativoException;

import java.security.InvalidParameterException;

public class DescontoFixo implements Desconto{
    private double valor;


    @Override
    public double aplicar(double preco) {
        if(this.valor > preco){
            throw new ValorDescontoException("Especifique um valor de desconto válido");
        }
        return preco - valor;
    }

    public DescontoFixo(double valor){
        this.valor = valor;
        if(valor < 0){
            throw new ValorNegativoException("Desconto é menor que zero");
        }
    }
}
