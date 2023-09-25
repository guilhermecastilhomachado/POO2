package Questao2;

public class CarroFachada {

    CintoDeSeguranca cintoDeSeguranca;
    Farol farol;
    Motor motor;
    Porta porta;
    Radio radio;

    public CarroFachada(CintoDeSeguranca cintoDeSeguranca, Farol farol, Motor motor, Porta porta, Radio radio) {
        this.cintoDeSeguranca = cintoDeSeguranca;
        this.farol = farol;
        this.motor = motor;
        this.porta = porta;
        this.radio = radio;
    }

    public void dirigirCarro(){
        motor.ligarMotor();
        porta.trancarPorta();
        cintoDeSeguranca.travarCintoDeSeguranca();
        farol.acenderFarol();
        radio.ligarRadio();
        radio.sintonizarEstacao();
    }

    public void finalizarCorrida(){
        motor.desligarMotor();
        porta.destrancarPorta();
        cintoDeSeguranca.destravarCintoDeSeguranca();
        farol.apagarFarol();
        radio.desligarRadio();
    }
}
