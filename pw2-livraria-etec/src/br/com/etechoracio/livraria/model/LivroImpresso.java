package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.TipoCapaEnum;

public class LivroImpresso extends Livro implements Oferta{
    private TipoCapaEnum tipoCapa;

    double getTaxaEnvio(){
        return valor * 0.05;
    }

    //Criar metodo CobrarCapa() que acrescenta os valores acima ao preço do livro
    void cobrarCapa() {
        if(tipoCapa == TipoCapaEnum.DURA){
            valor += 5;
        }else if(tipoCapa == TipoCapaEnum.PERSONALIZADA){
            valor += 10;
        }
    }

    public LivroImpresso() {
        tipoCapa = TipoCapaEnum.COMUM;
        cobrarCapa();
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
        cobrarCapa();
    }

    @Override
    protected void detalhar(){
        System.out.println("Tipo de capa: " + tipoCapa);
        System.out.println("Taxa de envio: " + formatarValor(getTaxaEnvio()));
    }

    @Override
    public void aplicarDesconto(Desconto desconto) {
        aplicarDesconto();
    }
}
