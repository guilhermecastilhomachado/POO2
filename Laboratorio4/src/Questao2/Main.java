package Questao2;

public class Main {
    public static void main(String[] args) {

        // Crie uma instância da calculadora binária
        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinaria();

        // Realize operações binárias usando a calculadora binária
        String resultadoSomaBinaria = calculadoraBinaria.somar("1101", "101");
        String resultadoSubtracaoBinaria = calculadoraBinaria.subtrair("1101", "101");

        // Exiba os resultados
        System.out.println("Resultado da Soma Binária: " + resultadoSomaBinaria);
        System.out.println("Resultado da Subtração Binária: " + resultadoSubtracaoBinaria);


        //------------------------------------------------------------------------------------------------------------


        // Crie uma instância da calculadora adaptada
        Calculadora calculadora = new AdapterCalculadoraBinaria(calculadoraBinaria);

        // Realize operações decimais usando a calculadora adaptada
        int resultadoSomaDecimal = calculadora.somar(13, 5);
        int resultadoSubtracaoDecimal = calculadora.subtrair(13, 5);
        int resultadoMultiplicacaoDecimal = calculadora.multiplicar(4, 6);

        // Exiba os resultados das operações decimais
        System.out.println("Resultado da Soma Decimal: " + resultadoSomaDecimal);
        System.out.println("Resultado da Subtração Decimal: " + resultadoSubtracaoDecimal);
        System.out.println("Resultado da Multiplicação Decimal: " + resultadoMultiplicacaoDecimal);
    }
}
