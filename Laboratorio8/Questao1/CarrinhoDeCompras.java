package Questao1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> items = new ArrayList<>();

    public void adicionaItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        boolean removido = items.remove(item);
        if (removido) {
            System.out.println("Item removido com sucesso: " + item.getNome());
        } else {
            System.out.println("Item não encontrado no carrinho: " + item.getNome());
        }
    }

    public int calculaTotal(){
        int sum = 0;
        for (Item item : items){
            sum += item.getPreco();
        }
        return sum;
    }

    public void realizaPagamento(PagamentoStrategy strategy){
        int total = this.calculaTotal();
        strategy.pagar(total);
    }
}
