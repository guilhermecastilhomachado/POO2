package Questao2;

public class PedidoNaLoja extends Pedido{

    public PedidoNaLoja(int quantidadeItens, double valorItem) {
        super(quantidadeItens, valorItem);
    }
    @Override
    protected void processarPagamento() {
        System.out.println("Pagamento na loja em dinheiro ou cartão de débito.");
    }

    @Override
    protected void decidirEntrega() {
        if (getValorItem() > 20) { // eu usei um getValor apenas para dar uma dinamica maior no codigo so afim de testar mesmo
            System.out.println("!!!Por comprar um item tao precioso e caro eu te darei um blinde!!! Pedido retirado na loja.");
        } else
            System.out.println("Pedido retirado na loja.");
    }
}
