package Questao1;

public class Cha extends Bebidas{
    @Override
    void prepararIngredientes() {
        System.out.println("Preparando o chá");
    }

    @Override
    void adicionarCondimentos() {
        System.out.println("Adicionando a erva-sideira");
    }
}
