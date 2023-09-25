package Questao1;

public class MassaFinaPizza implements Pizza{
    @Override
    public double custo() {
        return 59.50;
    }

    @Override
    public String getDescricao() {
        return "Pizza Feita De Massa Fina";
    }
}