package Questao2;

import java.util.Objects;

public class Item {

    private int preco;
    private String nome;

    private int peso;

    public Item(String nome, int preco, int peso){
        this.nome = nome;
        this.preco = preco;
        this.peso = peso; // Como eu pensei em livros entao a unidade de medida desse peso e gramas (g).
    }

    // Implementação dos métodos equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return preco == item.preco &&
                nome.equals(item.nome);
    }

    /*
     Estes métodos equals e hashCode garante que dois objetos
     Item serão considerados iguais se tiverem o mesmo nome e preço.
     Ou seja eles foram implementados para usar o remove
     Por exemplo caso eu remova um item o preco ira diminuir de acordo com suas caracteristica
     Assim usando a função com o melhor aproveitamento!!!
     */

    @Override
    public int hashCode() {
        return Objects.hash(preco, nome);
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
