package Questao1;

public class Livro {

    private String titulo;
    private String genero;
    private AutorDoLivro autor;

    public Livro(String titulo, String genero, AutorDoLivro autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
