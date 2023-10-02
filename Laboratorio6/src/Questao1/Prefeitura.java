package Questao1;

public class Prefeitura implements Observer{
    @Override
    public void update(double temp, double umidade, double vento) {
        if(umidade < 20.0){
            System.out.println("Defesa civil alerta: baixa umidade");
        }
    }
}
