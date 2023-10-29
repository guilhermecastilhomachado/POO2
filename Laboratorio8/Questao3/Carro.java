package Questao3;

public class Carro extends Veiculo{

    private String cor;

    private String marca;

    private String modelo;

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Carro(String cor, String marca, String modelo){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
