package Questao2;

public class City implements IVehicle{
    @Override
    public void start() {
        System.out.println("\nLigando o city...");
    }

    @Override
    public void drive() {
        System.out.println("Dirigindo o city...");
    }

    @Override
    public void stop() {
        System.out.println("Parando o city...");
    }
}
