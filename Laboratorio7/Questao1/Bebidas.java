package Questao1;

public abstract class Bebidas {

    public final void prepararBebidas(){
        aquecerAgua();
        prepararIngredientes();
        colocarNaXicara();
        adicionarCondimentos();
    }

    private void aquecerAgua(){
        System.out.println("Aquecendo a Água...");
    }

    private void colocarNaXicara() {
        System.out.println("Colocando na Xícara...");
    }

    // Métodos abstratos que devem ser implementados pelas subclasses
    abstract void prepararIngredientes();

    abstract void adicionarCondimentos();
}
