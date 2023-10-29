package Questao2;

public class PixPagamento implements PagamentoStrategy {

    private String chavePix;

    public PixPagamento(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    @Override
    public void pagar(int total) {
        System.out.println("Processando pagamento com Pix...");
        System.out.println("Chave Pix: " + getChavePix());
        System.out.println("Valor: R$" + total);
        System.out.println("Pagamento com Pix realizado com sucesso.\n");
    }
}
