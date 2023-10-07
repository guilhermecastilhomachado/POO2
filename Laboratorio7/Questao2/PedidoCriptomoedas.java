package Questao2;

public class PedidoCriptomoedas extends Pedido{

    public PedidoCriptomoedas(int quantidadeItens, double valorItem) {
        super(quantidadeItens, valorItem);
    }
    @Override
    protected void processarPagamento() {
        System.out.println("Processando pagamento com criptomoedas.");
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Entrega via QR code digital.");
    }
}
