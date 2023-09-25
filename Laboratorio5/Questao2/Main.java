package Questao2;

public class Main {
    public static void main(String[] args) {

        Motor motor = new Motor();
        Porta porta = new Porta();
        CintoDeSeguranca cintoDeSeguranca = new CintoDeSeguranca();
        Farol farol = new Farol();
        Radio radio = new Radio();

        CarroFachada carroFachada = new CarroFachada(cintoDeSeguranca, farol, motor, porta, radio);
        carroFachada.dirigirCarro();
        carroFachada.finalizarCorrida();
    }
}
