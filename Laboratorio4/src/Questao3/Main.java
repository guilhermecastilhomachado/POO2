package Questao3;

public class Main {
    public static void main(String[] args) {

        // Criando um adaptador para reproduzir musica usando o reprodutor de video
        ReprodutorDeMusica adaptadorReprodutorDeMusica = new AdaptadorReprodutorDeMusicaParaVideo(new ReprodutorDeMusicaImplements());

        // Criando um reprodutor de video real
        ReprodutorDeVideo reprodutorDeVideo = new ReprodutorDeVideoImplements();



        // Reproduzindo musica usando o adaptador (que, por sua vez, usa o reprodutor de vídeo)
        adaptadorReprodutorDeMusica.tocarMusica("Música de John Lennon");
        adaptadorReprodutorDeMusica.pausarMusica();
        adaptadorReprodutorDeMusica.pararMusica();


        // Reproduzindo um vídeo usando o reprodutor de vídeo real
        reprodutorDeVideo.reproduzirVideo("Vídeo do Primeiro Homem A Pisar Na Lua");
        reprodutorDeVideo.pausarVideo();
        reprodutorDeVideo.pararVideo();



    }
}
