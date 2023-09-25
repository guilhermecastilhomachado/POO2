package Questao1;

public class AutorDoLivro {

    private String nomedoAutor;
    private String dataDeNascimento;


    public AutorDoLivro(String nome, String data) {
        this.nomedoAutor = nome;
        this.dataDeNascimento = data;
    }

    public String getNome() {
        return nomedoAutor;
    }

    public String getData() {
        return dataDeNascimento;
    }
}
