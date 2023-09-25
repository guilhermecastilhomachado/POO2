package Questao2;

public class Decaf implements Cafe {
    @Override
    public double calculaCusto() {
        return 49.99;
    }

    @Override
    public String getDescricao() {
        return "\nCafe Descafeinado (decaf)";
    }
}