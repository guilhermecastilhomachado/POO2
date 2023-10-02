package Questao1;

public class Aeroporto implements Observer{
    @Override
    public void update(double temp, double umidade, double vento) {
        if(vento > 100.0){
            System.out.println("Alerta perigo");
        }
    }
}
