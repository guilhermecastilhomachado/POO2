package Questao3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n!Exercicio de Veiculos!\n");

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Amarelo Sirius", "Renault", "Renault Clio Renaultsport"));
        veiculos.add(new Onibus(35, 2023));
        veiculos.add(new Bicicleta("Verde"));

        Visitor imprimirVisitor = new ImprimirVisitor();
        Visitor mensagemVisitor = new MensagemVisitor();

        for (Veiculo veiculo : veiculos) {
            veiculo.accept(imprimirVisitor);
            veiculo.accept(mensagemVisitor);
        }
    }
}
