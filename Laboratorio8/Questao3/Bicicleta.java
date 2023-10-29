package Questao3;

public class Bicicleta extends Veiculo{

    private String cor;

    public String getCor() {
        return cor;
    }

    public Bicicleta(String cor) {
        this.cor = cor;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
