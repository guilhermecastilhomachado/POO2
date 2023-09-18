package Questao1;

public class MassaEspessaPizza implements Pizza{
    @Override
    public double custo() {
        return 65.0;
    }

    @Override
    public String getDescricao() {
        return "Pizza Feita De Massa Espessa";
    }
}