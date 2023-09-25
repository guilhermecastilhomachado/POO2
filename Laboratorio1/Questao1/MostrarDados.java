package Questao1;

public class MostrarDados {

    public void printDadosDoAutor(AutorDoLivro autorDoLivro) {
        System.out.println("Nome do Autor:" + autorDoLivro.getNome());
        System.out.println("Dara de Nascimento: " + autorDoLivro.getData());
    }

    public void printDadosDoLivro(Livro livro){
        System.out.println("Titulo do Livro: " + livro.getTitulo());
        System.out.println("Genero do Livro: " + livro.getGenero());
    }

    public void printGeral(Livro livro, AutorDoLivro autorDoLivro){
        System.out.println("Nome do Autor:" + autorDoLivro.getNome());
        System.out.println("Dara de Nascimento: " + autorDoLivro.getData());
        System.out.println("Titulo do Livro: " + livro.getTitulo());
        System.out.println("Genero do Livro: " + livro.getGenero());

    }
}
