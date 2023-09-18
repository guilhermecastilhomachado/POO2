package Questao2;

public class Cafeteria {
    public static void main(String[] args) {

        System.out.println("\n------!!!Bem-Vindos a Pizzaria da Computação UFU 2023!!!------");

        // -----Cafe Expresso Simples-----
        Cafe cafeExpresso = new Espresso();
        System.out.println(cafeExpresso.getDescricao());
        System.out.println("Custo R$: " + cafeExpresso.calculaCusto());


        // -----Cafe Expresso Com Leite-----
        Cafe cafeExpressoLeite = new Espresso();
        cafeExpressoLeite = new Leite(cafeExpressoLeite);
        System.out.println(cafeExpressoLeite.getDescricao());
        System.out.println("Custo R$: " + cafeExpressoLeite.calculaCusto());


        // -----Cafe Expresso Com Chocolate-----
        Cafe cafeExpressoChocolate = new Espresso();
        cafeExpressoChocolate = new Chocolate(cafeExpressoChocolate);
        System.out.println(cafeExpressoChocolate.getDescricao());
        System.out.println("Custo R$: " + cafeExpressoChocolate.calculaCusto());


        // -----Cafe Expresso Com Canela-----
        Cafe cafeExpressoCanela = new Espresso();
        cafeExpressoCanela = new Canela(cafeExpressoCanela);
        System.out.println(cafeExpressoCanela.getDescricao());
        System.out.println("Custo R$: " + cafeExpressoCanela.calculaCusto());


        //  -----Cafe Expresso Completo-----
        Cafe cafeExpressoCompleto = new Espresso();
        cafeExpressoCompleto = new Leite(cafeExpressoCompleto);
        cafeExpressoCompleto = new Chocolate(cafeExpressoCompleto);
        cafeExpressoCompleto = new Canela(cafeExpressoCompleto);
        System.out.println(cafeExpressoCompleto.getDescricao());
        System.out.println("Custo R$: " + cafeExpressoCompleto.calculaCusto());




        // -----Cafe Decaf Simples-----
        Cafe cafeDecaf = new Decaf();
        System.out.println(cafeDecaf.getDescricao());
        System.out.println("Custo R$: " + cafeDecaf.calculaCusto());


        // -----Cafe Decaf Com Leite-----
        Cafe cafeDecafLeite = new Decaf();
        cafeDecafLeite = new Leite(cafeDecafLeite);
        System.out.println(cafeDecafLeite.getDescricao());
        System.out.println("Custo R$: " + cafeDecafLeite.calculaCusto());


        // -----Cafe Decaf Com Chocolate-----
        Cafe cafeDecafChocolate = new Decaf();
        cafeDecafChocolate = new Chocolate(cafeDecafChocolate);
        System.out.println(cafeDecafChocolate.getDescricao());
        System.out.println("Custo R$: " + cafeDecafChocolate.calculaCusto());


        // -----Cafe Decaf Com Canela-----
        Cafe cafeDecafCanela = new Decaf();
        cafeDecafCanela = new Canela(cafeDecafCanela);
        System.out.println(cafeDecafCanela.getDescricao());
        System.out.println("Custo R$: " + cafeDecafCanela.calculaCusto());


        // -----Cafe Decaf Completo-----
        Cafe cafeDecafCompleto = new Decaf();
        cafeDecafCompleto = new Leite(cafeDecafCompleto);
        cafeDecafCompleto = new Chocolate(cafeDecafCompleto);
        cafeDecafCompleto = new Canela(cafeDecafCompleto);
        System.out.println(cafeDecafCompleto.getDescricao());
        System.out.println("Custo R$: " + cafeDecafCompleto.calculaCusto());
    }
}