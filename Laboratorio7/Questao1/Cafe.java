package Questao1;

public class Cafe extends Bebidas{
    @Override
    void prepararIngredientes() {
        System.out.println("Moendo o café e preparando a bebida");
    }

    @Override
    void adicionarCondimentos() {
        System.out.println("Adicionando um pouquinho de acucar e mexendo devagarinho pra esfriar");
    }
}
