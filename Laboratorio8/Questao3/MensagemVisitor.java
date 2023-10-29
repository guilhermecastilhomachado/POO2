package Questao3;

public class MensagemVisitor implements Visitor{
    @Override
    public void visit(Carro carro) {
        System.out.println("Enviar mensagem para o dono do Carro: Favor atualizar dados do IPVA\n");
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Enviar mensagem para o dono do Ônibus: Atenção para a atualização das licenças\n");
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Enviar mensagem para o dono da Bicicleta: Comemore no parque o dia do ciclismo\n");
    }
}
