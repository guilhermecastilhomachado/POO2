package Questao2;

import java.util.ArrayList;
import java.util.List;
public class Acao {
    private String nome;
    private double preco;
    private List<Observer> investidores = new ArrayList<>();
    private AcaoBroker acaoBroker;

    public Acao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void registrarInvestidor(Investidor investidor) {
        investidores.add(investidor);
    }

    public void removerInvestidor(Investidor investidor) {
        investidores.remove(investidor);
    }

    public void setAcaoBroker(AcaoBroker acaoBroker) {
        this.acaoBroker = acaoBroker;
    }

    public void setPreco(double novoPreco) {
        if (novoPreco != preco) {
            preco = novoPreco;
            notificarInvestidores();
        }
    }

    private void notificarInvestidores() {
        for (Observer investidor : investidores) {
            investidor.notificar(this);
        }
        if (acaoBroker != null) {
            acaoBroker.executarOrdens(this);
        }
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
