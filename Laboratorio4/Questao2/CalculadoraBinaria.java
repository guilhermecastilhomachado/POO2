package Questao2;

public class CalculadoraBinaria {

    public String somar(String a, String b) {

        // Usando o ajustarCromprimeto podemos certificar que as duas strings binárias tenham o mesmo comprimento
        int maxLength = Math.max(a.length(), b.length());
        a = ajustarComprimento(a, maxLength);
        b = ajustarComprimento(b, maxLength);

        StringBuilder resultado = new StringBuilder();
        int carry = 0;

        // Percorra as strings binarias da direita para a esquerda
        for (int i = maxLength - 1; i >= 0; i--) {
            int bitA = Character.getNumericValue(a.charAt(i));
            int bitB = Character.getNumericValue(b.charAt(i));

            int soma = bitA + bitB + carry;
            carry = soma / 2; // Calcula o carry para a proxima posicao

            resultado.insert(0, soma % 2); // Insere o bit resultante na posição correta
        }

        // Se ainda houver carry, adicione-o ao resultado
        if (carry > 0) {
            resultado.insert(0, carry);
        }

        return resultado.toString();
    }

    // Funcao auxiliar para ajustar o comprimento de uma string binaria(Essa funcao auxilia as funcoes de soma e subtracao)
    private String ajustarComprimento(String binario, int comprimento) {
        StringBuilder sb = new StringBuilder(binario);
        while (sb.length() < comprimento) {
            sb.insert(0, '0'); // Adiciona zeros à esquerda, se necessário
        }
        return sb.toString();
    }

    public String subtrair(String a, String b) {

        // Usando o ajustarCromprimeto podemos certificar que as duas strings binárias tenham o mesmo comprimento
        int maxLength = Math.max(a.length(), b.length());
        a = ajustarComprimento(a, maxLength);
        b = ajustarComprimento(b, maxLength);

        StringBuilder resultado = new StringBuilder();
        int emprestimo = 0;

        // Percorra as strings binarias da direita para a esquerda (dos bits menos significativos para os mais significativos)
        for (int i = maxLength - 1; i >= 0; i--) {
            int bitA = Character.getNumericValue(a.charAt(i));
            int bitB = Character.getNumericValue(b.charAt(i));

            // Subtraia o bit de emprestimo do bit A antes da subtração
            bitA -= emprestimo;

            if (bitA < bitB) {
                bitA += 2; // Adicione 2 para realizar o emprestimo
                emprestimo = 1;
            } else {
                emprestimo = 0;
            }

            int diferenca = bitA - bitB;

            resultado.insert(0, diferenca); // Insira o bit resultante na posicao correta
        }

        return resultado.toString();
    }
}
