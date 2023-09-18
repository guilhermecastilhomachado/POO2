package Questao2;

public class AdapterCalculadoraBinaria implements Calculadora{

    CalculadoraBinaria calculadoraBinaria;

    public AdapterCalculadoraBinaria(CalculadoraBinaria calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    @Override
    public int somar(int a, int b) {
        String resultadoBinario = calculadoraBinaria.somar(Integer.toBinaryString(a), Integer.toBinaryString(b)); // Converta o resultado binário de volta para decimal e retorne
        return Integer.parseInt(resultadoBinario, 2);
    }

    @Override
    public int subtrair(int a, int b) {
        String resultadoBinario = calculadoraBinaria.subtrair(Integer.toBinaryString(a), Integer.toBinaryString(b));  // Converta o resultado binário de volta para decimal e retorne
        return Integer.parseInt(resultadoBinario, 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b; //  multiplica os números decimais
    }
}
