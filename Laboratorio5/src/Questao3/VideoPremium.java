package Questao3;

public class VideoPremium implements Video{

    // A Classe VideoPremium e uma Classe real que representa um vídeo premium.
    // O que diferencia dessa Classe PREMIUM para a Gratuita e que ela e mais elegante por nao possuir anuncio
    // ja que anuncio atrapalha um pouco o animo das pessoas.

    private String titulo;

    public VideoPremium(String titulo){
        this.titulo = titulo;
    }


    @Override
    public void assistir() {
        System.out.println("\nVideo Premium: " + titulo);
    }
}
