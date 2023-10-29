package Questao1;

public class CartaoPagamento  implements PagamentoStrategy{

    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;
    private String codigoSeguranca;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public CartaoPagamento(String numeroCartao, String nomeTitular, String dataValidade, String codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void pagar(int total) {
        System.out.println("\nProcessando pagamento com cartão de credito...");
        System.out.println("Cartão: " + getNumeroCartao());
        System.out.println("Titular: " + getNomeTitular());
        System.out.println("Data de Validade: " + getDataValidade());
        System.out.println("Código de Segurança: " + getCodigoSeguranca());
        System.out.println("Valor: R$" + total);
        System.out.println("Pagamento com cartão de crédito realizado com sucesso.");
    }
}
