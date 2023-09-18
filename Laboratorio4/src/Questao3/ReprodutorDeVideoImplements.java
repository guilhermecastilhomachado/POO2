package Questao3;

public class ReprodutorDeVideoImplements implements ReprodutorDeVideo{
    @Override
    public void reproduzirVideo(String video) {
        System.out.println("\n!!!Reproduzindo Um Grande Video: " + video);
    }

    @Override
    public void pausarVideo() {
        System.out.println("Pausando O Video.");
    }

    @Override
    public void pararVideo() {
        System.out.println("Parando O Video.");
    }
}
