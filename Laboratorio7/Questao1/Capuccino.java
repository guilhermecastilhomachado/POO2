package Questao1;

public class Capuccino extends Bebidas{
    @Override
    void prepararIngredientes() {
        System.out.println("Moendo e depois ferverndo o café e preparando-a com leite");
    }

    @Override
    void adicionarCondimentos() {
        System.out.println("Adicionando espuma de leite e canela");
    }
}
