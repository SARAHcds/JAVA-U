package LANCHE;

public class MAIN {
    public static void main(String[] args) {

        LANCHE Xegg = new LANCHE();
        Xegg.nome = "Xegg";
        Xegg.preco = 15;
        Xegg.descricao = "Pão, Ovo, Hamburguer, Maionese, Salada, Queijo, Batata palha";

        LANCHE Xtudo = new LANCHE();
        Xtudo.nome = "Xtudo";
        Xtudo.preco = 15;
        Xtudo.descricao = "Pão, Ovo, Hamburguer, Maionese, Salada, Queijo, Presunto";

        Xtudo.exibir();
        Xegg.exibir();

    }
}
