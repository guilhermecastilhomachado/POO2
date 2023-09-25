package Questao1;

public class Main {

    public static void main(String[] arqs){

        MostrarDados dados = new MostrarDados();

        AutorDoLivro autor = new AutorDoLivro("Jose", "12/12/2022");

        Livro livro = new Livro("A Bela E A Fera", "Romance", autor);


        //Este Exemplo aqui que eu fiz eu criei uma função na Classe MostrarDados
        //Onde nesta classe eu criei uma função denotada "printGeral" onde ele pega
        //Todas as Informações do Livro e tambem do autor.
        dados.printGeral(livro, autor);

        /*

        dados.printDadosDoLivro(livro)

        dados.printDadosDoAutor(autor)

        esses exemplos seria outros modelo de fazer também.

         */

    }
}
