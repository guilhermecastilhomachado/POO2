package Questao2;

public abstract class Pedido {
    private int quantidadeItens;
    private double valorItem;

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public double getValorItem() {
        return valorItem;
    }

    public Pedido(int quantidadeItens, double valorItem) {
        this.quantidadeItens = quantidadeItens;
        this.valorItem = valorItem;
    }

    // Template Method
    public final void processarPedido() {
        processarPagamento();
        decidirEntrega();
    }

    // Métodos abstratos a serem implementados pelas subclasses
    protected abstract void processarPagamento();

    protected abstract void decidirEntrega();
}
