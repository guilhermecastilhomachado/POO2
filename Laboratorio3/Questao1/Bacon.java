package Questao1;

public class Bacon extends ToppingDecorator{
    public Bacon(Pizza pizza) {
        super(pizza);
    }
    @Override
    public double custo() {
        return pizza.custo() + 10.50; // Custo Adicional do Bacon na Pizza
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " Com Adicional: Bacon";
    }

}