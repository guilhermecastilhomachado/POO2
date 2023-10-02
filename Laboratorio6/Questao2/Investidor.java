package Questao2;

public class Investidor implements Observer{

    private String nome;
    private double precoMinimo;
    private double precoMaximo;

    public Investidor(String nome, double precoMinimo, double precoMaximo) {
        this.nome = nome;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
    }
    @Override
    public void notificar(Acao acao) {

        if (acao.getPreco() >= precoMaximo) {
            System.out.println(nome + ": Vender ações da " + acao.getNome() + " a " + acao.getPreco());
        } else if (acao.getPreco() <= precoMinimo) {
            System.out.println(nome + ": Comprar ações da " + acao.getNome() + " a " + acao.getPreco());
        }

    }


}
