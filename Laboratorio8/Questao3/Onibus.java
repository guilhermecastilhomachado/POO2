package Questao3;

public class Onibus extends Veiculo{

    private int lugares;

    private int anoFabricado;

    public int getLugares() {
        return lugares;
    }

    public int getAnoFabricado() {
        return anoFabricado;
    }

    public Onibus(int lugares, int anoFabricado) {
        this.lugares = lugares;
        this.anoFabricado = anoFabricado;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
