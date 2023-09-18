package Questao2;

public class Leite extends ToppingDecoratorCafe{

    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto() + 2.50;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " \nCom Decoracao Adicional: Leite";
    }
}