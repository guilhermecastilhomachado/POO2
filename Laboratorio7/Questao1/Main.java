package Questao1;

public class Main {

    public static void main(String[] args) {

        Bebidas cafe = new Cafe();
        Bebidas cappuccino = new Capuccino();
        Bebidas cha = new Cha();

        System.out.println("!!!Preparando O Café!!!");
        cafe.prepararBebidas();

        System.out.println("\n!!!Preparando O Cappuccino!!!");
        cappuccino.prepararBebidas();

        System.out.println("\n!!!Preparando O Chá!!!");
        cha.prepararBebidas();

    }
}
