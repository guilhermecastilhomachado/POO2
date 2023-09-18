package Questao3;

public class VideoGratuito implements Video {

    // A Classe VideoGratuito e uma Classe real que representa um vídeo gratuito.
    // O que e diferenciada da PREMIUM ja que a GRATUITO CONTEM ANUNCIO, ou seja, e mais chato assistir Videos
    // ja que muitas vezes anuncio atrapalha a visualicao do filme em si.
    private String titulo;
    private int esperaAnuncio = 30; // CRIEI ESSE ATRIBUTO APENAS PARA REPRESENTAR MELHOR ESSA CLASSE NA PLATICA
                               // PARA PODER VER A DIFERENCA ENTRE ELA E A PREMIUM.


    public int getEsperaAnuncio() {
        return esperaAnuncio;
    }

    public VideoGratuito(String titulo){
        this.titulo = titulo;
    }

    @Override
    public void assistir() {
        System.out.println("\nANUNCIOOOO, PARA ASSISTIR O FILME VOCE DEVE ESPERAR " + getEsperaAnuncio() + "SEGUNDOS...\n" + "Video Gratuito: " + titulo);
    }
}
