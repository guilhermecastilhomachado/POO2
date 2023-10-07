package Questao2;

public class PedidoOnline extends Pedido{

    public PedidoOnline(int quantidadeItens, double valorItem) {
        super(quantidadeItens, valorItem);
    }
    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento online via cartão de crédito.");
    }

    @Override
    protected void decidirEntrega() { // eu usei um getQuantidade apenas para dar uma dinamica maior no codigo so afim de testar mesmo
        if (getQuantidadeItens() > 20) {
            System.out.println("Por Comprar este tanto vamos entregar de forma mais rapida possivel, Entrega via transportadora.");
        }else
            System.out.println("Entrega norma,  Entrega via transportadora.");
    }
}