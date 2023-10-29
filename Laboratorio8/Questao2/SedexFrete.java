package Questao2;

import java.util.List;

public class SedexFrete implements FreteStrategy{
    @Override
    public int calculaFrete(List<Item> items) {
        int pesoTotal = 0;
        for (Item item : items) {
            pesoTotal += item.getPeso();
        }
        return pesoTotal * 2; // Valor fictício para exemplo
    }
}
