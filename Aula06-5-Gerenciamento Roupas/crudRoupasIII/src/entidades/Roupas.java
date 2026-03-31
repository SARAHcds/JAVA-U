package entidades;

public class Roupas {
    private String nome;
    private int quantidade;
    private double preco;

    public Roupas(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void setNome(String nome) {this.nome = nome;}

    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    public void setPreco(double preco) {this.preco = preco;}



    @Override
    public String toString() {
        return " | " + nome + " | " + quantidade+ " | " + preco + " | ";
    }
}

