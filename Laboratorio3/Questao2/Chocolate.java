package Questao2;

public class Chocolate extends ToppingDecoratorCafe{

    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 5.50;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " \nCom Decoracao Adicional: Chocolate";
    }
}