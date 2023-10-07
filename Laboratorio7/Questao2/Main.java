package Questao2;

public class Main {
    /*

    Qual a diferença entre o padrão de projeto Template e o Decorator?

        Resposta: Tanto o padrão Template Method tanto o padrão Decorator, ambos são padrões de projeto de comportamento,porem todavia, têm finalidades diferentes
        como por exemplo: o Template Method define a estrutura de um algoritmo em uma superclasse, permitindo que as subclasses forneçam implementações
        específicas para partes do algoritmo, e como se fosse um "esqueleto" do algoritmo.
        Ja o Decotaror é usado para adicionar responsabilidades adicionais a um objeto dinamicamente, e como se fosse combinação de comportamentos de
        objetos existentes de forma flexível e dinâmica.
        Em resumo podemos os diferenciar que o Template lida com a estrutura de algoritmos ja o Decorator lida com a composição de objetos para
        adicionar funcionalidades extras de maneira flexível.
     */

    public static void main(String[] args) {

        Pedido pedidoOnline = new PedidoOnline(50, 70.0);
        Pedido pedidoNaLoja = new PedidoNaLoja(32, 20.1);
        Pedido pedidoCriptomoedas = new PedidoCriptomoedas(2, 99.0);

        System.out.println("Pedido Online:");
        pedidoOnline.processarPedido();

        System.out.println("\nPedido na Loja:");
        pedidoNaLoja.processarPedido();

        System.out.println("\nPedido com Criptomoedas:");
        pedidoCriptomoedas.processarPedido();

    }
}
