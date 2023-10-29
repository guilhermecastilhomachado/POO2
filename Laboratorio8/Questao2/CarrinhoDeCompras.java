package Questao2;

import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {

    List<Item> items = new ArrayList<>();
    FreteStrategy freteStrategy;

    public void adicionaItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        boolean removido = items.remove(item);
        if (removido) {
            System.out.println("\nItem removido com sucesso: " + item.getNome());
        } else {
            System.out.println("\nItem não encontrado no carrinho: " + item.getNome());
        }
    }

    public int calculaTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPreco();
        }
        return sum;
    }

    public void realizaPagamento(PagamentoStrategy strategy) {
        int total = this.calculaTotal();
        int valorFrete = calculaFrete();
        int totalComFrete = total + valorFrete;

        System.out.println("Total da compra: R$" + total);
        System.out.println("Valor do frete: R$" + valorFrete);
        System.out.println("Total com frete: R$" + totalComFrete + "\n");

        strategy.pagar(totalComFrete);
    }

    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    public int calculaFrete() {
        if (freteStrategy != null) {
            return freteStrategy.calculaFrete(items);
        } else {
            return 0; // Frete grátis se nenhuma estratégia estiver definida
        }
    }
}
