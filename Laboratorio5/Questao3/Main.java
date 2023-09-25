package Questao3;

public class Main {

    public static void main(String[] args) {

        //Usando o Proxy para assistir os videos (tantos gratuitos quanto premiuns)
        Video videoPremium = new ProxyVideo("premium", "A Bela e a Fera");
        Video videoGratuito = new ProxyVideo("gratuito", "Os Tres Porquinhos");


        // ASSISTINDO O FILME PREMIUM
        videoPremium.assistir(); // Assistindo o video PREMIUN



        // ASSISTINDO O FILME GRATUITO
        videoGratuito.assistir(); // Assistindo o video GRATUITO

        // REPEDINDO UM FILME PARA AUMENTAR A VISUALIZACAO(APENAS UMA DEMONSTRACAO DA VISUALIZACAO)
        videoPremium.assistir();
        videoPremium.assistir();
        videoGratuito.assistir();
    }
}
