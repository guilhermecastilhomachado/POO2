package Questao1;

public class Main {

    public static void main(String[] args) {

        CET cet = new CET();
        Prefeitura pref = new Prefeitura();

        cet.addObservers(pref);

        cet.setUmidade(30.0);

        cet.setUmidade(10.0);

        Aeroporto aero = new Aeroporto();
        cet.addObservers(aero);

        //cet.setVento(120.0);

    }
}
