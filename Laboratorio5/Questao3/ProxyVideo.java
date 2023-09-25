package Questao3;

public class ProxyVideo implements Video{

    // Proxy que controla o acesso aos vídeos(TANTO PREMIUM QUANTO GRATUITO e mede as visualizações.

    // essa atributo chamado "visualizacao" eu implementei apenas para deixar o codigo um pouco mais criativo, pois quando mais a pessoa assiste,
    // maior e o numero de vizualizacao, ou seja, se a pessoa assistir um filme 3 vezes(fazendo a chamada na mais 3 vezes) irar contar essas visualizacoes
    private Video video;
    private int visualizacoes = 0;

    public ProxyVideo(String tipo, String titulo){
        if ("premium".equalsIgnoreCase(tipo)){ // Verifica se o tipo do vIdeo e a do "premium".
            video = new VideoPremium(titulo); // Se caso ele for premium cria-se um objeto VideoPremium.
        } else { // Caso Contrario
            video = new VideoGratuito(titulo); // Se cria-se um objeto VideoGratuito
        }
    }

    @Override
    public void assistir() {
     video.assistir();
     visualizacoes++; // CONTADOR DAS VISUALIZACOES, A CADA VEZ QUE ELE REPETE ELE AUMENTA A VISUALIZACAO.
     System.out.println("Vizualizacoes: " + visualizacoes); // OU SEJA, APENAS CONTA QUANTAS VEZES A PESSOA ASSISTIU AQUELE VIDEO.
    }
}
