package Questao2;

public class Corolla implements IVehicle{
    @Override
    public void start() {
        System.out.println("\nLigando o corolla...");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o corolla...");
    }

    @Override
    public void stop() {
        System.out.println("Parando o corolla...");
    }
}
