package Questao1;

public class Main {
    public static void main(String[] args) {

        //APPLE
        FabricanteCelular apple = FabricanteCelularSingleton.getInstance("apple");   // utilizando o Padrao Singleton
        Celular iphones = apple.constroiCelular("iphones");  // utilizando o Padrao Fabrica


        // utilizando o celular fabricado APPLE
        iphones.tiraFoto();
        iphones.fazLigacao();
        System.out.println("Construido com SUCESSO o iphone S");



        //SAMSUNG
        FabricanteCelular samsung = FabricanteCelularSingleton.getInstance("samsung");  // utilizando o Padrao Singleton
        Celular galaxy8 = samsung.constroiCelular("galaxy8");  // utilizando o Padrao Fabrica


        // utilizando o celular fabricado SAMSUNG
        galaxy8.tiraFoto();
        galaxy8.fazLigacao();
        System.out.println("Construido com SUCESSO o galaxy8");



        //XIAOMI
        FabricanteCelular xiaomi = FabricanteCelularSingleton.getInstance("xiaomi"); // utilizando o Padrao Singleton
        Celular xiaomiM9 = xiaomi.constroiCelular("xiaomiMi9"); // utilizando o Padrao Fabrica


        // utilizando o celular fabricado XIAOMIM9
        xiaomiM9.tiraFoto();
        xiaomiM9.fazLigacao();
        System.out.println("Construido com SUCESSO o xiaomiMi9");
    }
}
