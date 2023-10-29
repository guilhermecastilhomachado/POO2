package Questao3;

public class ImprimirVisitor implements Visitor{
    @Override
    public void visit(Carro carro) {
        System.out.println("!!! DADOS DO CARRO !!!");
        System.out.println("Cor Do Carro: " + carro.getCor());
        System.out.println("Marca Do Carro: " + carro.getMarca());
        System.out.println("Modelo Do Carro: " + carro.getModelo());
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("!!! DADOS DO ONIBUS !!!");
        System.out.println("Quantidade De Lugares Do Onibus: " + onibus.getLugares());
        System.out.println("Ano de Fabricacao Do Onibus: " + onibus.getAnoFabricado());
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("!!! DADOS DA BICICLETA !!!");
        System.out.println("Cor Da Bicicleta: " + bicicleta.getCor());
    }

}
