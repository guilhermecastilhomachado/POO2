package Questao1;

public class HomeTheaterFachada {

    Amplificador amp;
    StreamingPlayer player;
    Projetor projetor;
    Luzes luzes;
    Telao telao;
    MaquinaPipoca pipoqueira;

    public HomeTheaterFachada(Amplificador amp, StreamingPlayer player, Projetor projetor, Luzes luzes, Telao telao,
                              MaquinaPipoca pipoqueira) {
        this.amp = amp;
        this.player = player;
        this.projetor = projetor;
        this.telao = telao;
        this.luzes = luzes;
        this.pipoqueira = pipoqueira;
    }

    public void assistirFilme(String filme){
        pipoqueira.liga();
        pipoqueira.arrebentaPicoca();
        luzes.desliga();
        telao.abaixa();
        projetor.liga();
        amp.liga();
        amp.ajustaVolume(8000);
        player.liga();
        player.play(filme);
        System.out.println("Pronto Pra Assistir o Filme mais TOP DO MUNDDOOO!!!!! E ELEE OOOOOO " + filme);
    }


    public void fimDoFilme() {
        telao.sobre();
        luzes.liga();
        projetor.desliga();
        System.out.println("Este Filme ...");
        System.out.println("Nao Apenas um Filme mais sim UMA OBRAAA DE ARTE IRA DESCANSAR, PRA MAIS TARDE MITAR NOVAMENTE... ATE MAIS...");

    }

}
