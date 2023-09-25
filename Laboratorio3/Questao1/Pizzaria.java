package Questao1;

public class Pizzaria {
    public static void main(String[] args) {

        System.out.println("\n------!!!Bem-Vindos a Pizzaria da Computação UFU 2023!!!------\n");

        // -----Pizza Com Massa Espessa-----
        Pizza portuguesa = new MassaEspessaPizza();
        portuguesa = new Queijo(portuguesa);
        portuguesa = new Ovo(portuguesa);
        portuguesa = new Tomate(portuguesa);


        // -----Pizza Com Massa Fina-----
        Pizza marguerita = new MassaFinaPizza();
        marguerita = new Queijo(marguerita);
        marguerita = new Tomate(marguerita);

        Pizza calabresa = new MassaFinaPizza();
        calabresa = new Queijo(calabresa);
        calabresa = new Tomate(calabresa);
        calabresa = new Calabresa(calabresa);
        calabresa = new MolhoDeTomate(calabresa);



        // -----Adicionais!!!-----
        Pizza baconPizzaFina = new MassaFinaPizza();
        baconPizzaFina = new Bacon(baconPizzaFina);

        Pizza baconPizzaEspessa = new MassaEspessaPizza();
        baconPizzaEspessa = new Bacon(baconPizzaEspessa); // Adicione bacon à pizza


        // -----Umas Das Opções de Pizza Chamada de Marquerita!!!-----
        System.out.println("Pizza De Marguerita");
        System.out.println(marguerita.custo());
        System.out.println(marguerita.getDescricao());

        System.out.println("\nPizza De Marguerita Com Adicional");
        System.out.println(baconPizzaFina.custo());
        System.out.println(baconPizzaFina.getDescricao());



        // -----Umas Das Opções de Pizza Chamada de Portuguesa-----
        System.out.println("\nPizza Portuguesa");
        System.out.println(portuguesa.custo());
        System.out.println(portuguesa.getDescricao());


        System.out.println("\nPizza Portuguesa Com Adicional");
        System.out.println(baconPizzaEspessa.custo());
        System.out.println(baconPizzaEspessa.getDescricao());


        // -----Umas Das Opções de Pizza Chamada de Portuguesa-----
        System.out.println("\nPizza Calabresa");
        System.out.println(calabresa.custo());
        System.out.println(calabresa.getDescricao());


        System.out.println("\nPizza Calabresa Com Adicional");
        System.out.println(baconPizzaFina.custo());
        System.out.println(baconPizzaFina.getDescricao());
    }
}