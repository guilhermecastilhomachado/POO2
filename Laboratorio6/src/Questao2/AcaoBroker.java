package Questao2;

public class AcaoBroker {

    private double saldo; // Saldo disponível para comprar ações

    public AcaoBroker(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void executarOrdens(Acao acao) {
        double precoAtual = acao.getPreco();

        // Suponhamos que o investidor queira comprar ações quando o preço for menor ou igual a 150.0
        if (precoAtual <= 150.0 && saldo > 0) {
            int quantidadeAComprar = (int) (saldo / precoAtual); // Calcula a quantidade de ações que podem ser compradas
            saldo -= quantidadeAComprar * precoAtual; // Deduz o valor gasto do saldo
            System.out.println("Compra de " + quantidadeAComprar + " ações da " + acao.getNome() + " a " + precoAtual);
        }

        // Suponhamos que o investidor queira vender ações quando o preço for maior ou igual a 250.0
        if (precoAtual >= 250.0) {
            int quantidadeAVender = 10; // Suponhamos que o investidor queira vender sempre 10 ações
            saldo += quantidadeAVender * precoAtual; // Adiciona o valor obtido ao saldo
            System.out.println("Venda de " + quantidadeAVender + " ações da " + acao.getNome() + " a " + precoAtual);
        }
    }
}
