package Questao2;

import java.util.List;

public class NormalFrete implements FreteStrategy{
    @Override
    public int calculaFrete(List<Item> items) {
        int totalDeItens = items.size(); // Usei essa Logica pois o envio do Normal e BEM mais barato do que o Sedex
        return totalDeItens * 3;
    }
}
