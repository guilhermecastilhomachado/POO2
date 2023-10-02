package Questao2;

public class Main {
    public static void main(String[] args) {

        Acao acaoApple = new Acao("Apple", 150.0);
        Acao acaoGoogle = new Acao("Google", 250.0);

        Investidor investidor1 = new Investidor("Investidor1", 100.0, 200.0);
        Investidor investidor2 = new Investidor("Investidor2", 200.0, 300.0);

        AcaoBroker acaoBroker = new AcaoBroker(222);
        acaoApple.setAcaoBroker(acaoBroker);
        acaoGoogle.setAcaoBroker(acaoBroker);

        acaoApple.registrarInvestidor(investidor1);
        acaoApple.registrarInvestidor(investidor2);
        acaoGoogle.registrarInvestidor(investidor2);

        acaoApple.setPreco(180.0);
        acaoApple.setPreco(220.0);
        acaoGoogle.setPreco(280.0);

    }
}
