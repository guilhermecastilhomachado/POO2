package Questao2;

public class Espresso implements Cafe{
    @Override
    public double calculaCusto() {
        return 25.50;
    }

    @Override
    public String getDescricao() {
        return "\nCafe Expresso";
    }
}