package Questao2;

public class ToppingDecoratorCafe implements Cafe{

    Cafe cafe;

    public ToppingDecoratorCafe(Cafe cafe){
        this.cafe = cafe;
    }

    @Override
    public double calculaCusto() {
        return cafe.calculaCusto();
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }

}