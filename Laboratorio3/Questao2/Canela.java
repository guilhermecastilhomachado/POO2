package Questao2;

public class Canela extends ToppingDecoratorCafe{

    public Canela(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 1.50;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " \nCom Decoracao Adicional: Canela";
    }
}