package Questao3;

public class ReprodutorDeMusicaImplements implements ReprodutorDeMusica{
    @Override
    public void tocarMusica(String musica) {
        System.out.println("\n!!!Tocando uma Bela Musica: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando um Belo Som Musical...");
    }

    @Override
    public void pararMusica() {
        System.out.println("Finalizando essa Bela Melodia...");
    }
}
