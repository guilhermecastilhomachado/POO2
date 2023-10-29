package Questao1;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando Itens ao Carrinho de Compras
        carrinho.adicionaItem(new Item("livro a", 100));
        carrinho.adicionaItem(new Item("Livro b", 122));

        // Realizando o pagamento com Pix
        PagamentoStrategy strategy = new PixPagamento("234dfsdfs234");
        carrinho.realizaPagamento(strategy);


        // Realizando o pagamento com Cartão de Crédito
        PagamentoStrategy strategy1 = new CartaoPagamento("123123-2123-22", "Joao", "12/12/2222", "231");
        carrinho.realizaPagamento(strategy1);
    }
}
