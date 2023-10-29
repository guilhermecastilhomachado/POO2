package Questao2;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n!Exercicio Com Imprementacao dos Fretes!");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando Itens ao Carrinho de Compras
        carrinho.adicionaItem(new Item("Livro: O Pequeno Principe volume 8.", 79, 400));
        carrinho.adicionaItem(new Item("Livro: A Bela e a Fera volume 2.", 30, 200));
        carrinho.adicionaItem(new Item("Livro: Dragon Ball Z volume 1.", 52, 350)); // lembrando que esse peso e em gramas (g)!!!
        carrinho.adicionaItem(new Item("Livro: Naruto Shippuddem volume 2.", 32, 250));

        // Removendo um item do Carrinho de Compras
        Item itemARemover = new Item("Livro: Naruto Shippuddem volume 2.", 32, 2); // Exemplo de como seria se fosse remover algum
                                                                                                    // item da lista.


        // Definindo a estratégia de frete (Sedex)
        FreteStrategy freteSedex = new SedexFrete();
        carrinho.setFreteStrategy(freteSedex);
        carrinho.removeItem(itemARemover); // Exemplo pratico quando usa-se o "remove" um item, com isso,
                                          // o preco total sera diminuido pelas caracteristica daquele livro removido
                                          // ou seja, ele tera o preco total so dos 3 livros

        // Realizando o pagamento com Pix
        PagamentoStrategy strategyPix = new PixPagamento("234dfsdfs234");
        carrinho.realizaPagamento(strategyPix);

        // Alterando a estratégia de frete (Normal)
        FreteStrategy freteNormal = new NormalFrete(); // Neste Exemplo pratico eu nao usei o remove de um item, o preco total e diminuido pelas caracteristica daquele livro removido
        carrinho.setFreteStrategy(freteNormal);        // Com isso ele tera preco total de todos os itens , ja que nenhum foi removido
                                                       // ou seja, ele tera o preco total dos 4 livros


        // Realizando o pagamento com Cartão de Crédito
        PagamentoStrategy strategyCartao = new CartaoPagamento("123123-2123-22", "João", "12/12/2222", "231");
        carrinho.realizaPagamento(strategyCartao);
    }
}
