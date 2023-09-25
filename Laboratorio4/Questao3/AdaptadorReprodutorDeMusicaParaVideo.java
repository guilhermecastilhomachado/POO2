package Questao3;

public class AdaptadorReprodutorDeMusicaParaVideo implements ReprodutorDeMusica{

    /*
    Esta class chamanda de AdaptadorReprodutorDeMusicaParaVideo é adaptador que permite que usemos a classe ReprodutorDeVideoImplements para
    reproduzir músicas, porem, ele implementa a interface ReprodutorDeMusica para que você possa chamar os métodos
    de reprodução de música, mas, na verdade, ele direciona essas chamadas para a classe ReprodutorDeVideoImpl para executar a reprodução.
     */
    ReprodutorDeMusica reprodutorDeMusica;

    public AdaptadorReprodutorDeMusicaParaVideo(ReprodutorDeMusica reprodutorDeMusica) {
        this.reprodutorDeMusica = reprodutorDeMusica;
    }

    @Override
    public void tocarMusica(String musica) {
        reprodutorDeMusica.tocarMusica(musica);
    }

    @Override
    public void pausarMusica() {
        reprodutorDeMusica.pausarMusica();
    }

    @Override
    public void pararMusica() {
        reprodutorDeMusica.pararMusica();
    }
}
