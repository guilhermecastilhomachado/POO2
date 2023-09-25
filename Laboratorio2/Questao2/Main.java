package Questao2;

public class Main {
    public static void main(String[] args) {

        // TOYOTA
        IVehicleMaker toyota = IVehicleMakerSingleton.getInstance("toyota"); // utilizando o Padrao Singleton
        IVehicle corolla = toyota.makeVehicle("corolla"); // utilizando o Padrao Fabrica


        // utilizando o veiculo fabricado TOYOTA
        corolla.start();
        corolla.drive();
        corolla.stop();
        System.out.println("Construido com SUCESSO o corolla");



        // HONDA
        IVehicleMaker honda = IVehicleMakerSingleton.getInstance("honda"); // utilizando o Padrao Singleton
        IVehicle city = honda.makeVehicle("city");  // utilizando o Padrao Fabrica


        // utilizando o veiculo fabricado TOYOTA
        city.start();
        city.drive();
        city.stop();
        System.out.println("Construido com SUCESSO o corolla");



    }
}
