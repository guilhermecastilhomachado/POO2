package Questao1;

public class FabricanteCelularSingleton {

    private static FabricanteCelular apple;
    private static FabricanteCelular samsung;
    private static FabricanteCelular xiaomi;

    public static FabricanteCelular getInstance(String tipo) {

        if (tipo.equals("apple")) {
            if (apple == null)
                apple = new Apple();
            return apple;
        } else if (tipo.equals("xiaomi")) {
            if (xiaomi == null)
                xiaomi = new Xiaomi();
            return xiaomi;
        } else
            if (samsung == null)
                samsung = new Samsung();
            return samsung;
    }
}