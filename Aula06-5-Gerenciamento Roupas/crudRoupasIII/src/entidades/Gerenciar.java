package entidades;

import java.util.ArrayList;

public class Gerenciar {
    private ArrayList<Roupas> listaRoupas = new ArrayList<>();


    //Create - Cadastrar Roupas
    public void cadastrarRoupas(Roupas roupas) {
        listaRoupas.add(roupas);
        System.out.println("Roupa cadastrada com sucesso!");
    }


    public void listarRoupas() {
        if(listaRoupas.isEmpty()) {
            System.out.println("Nenhum cadastro encontrado!");
        } else {
            System.out.println("| ID | NOME | QUANTIDADE | VALOR |");
            for (int i=0; i<listaRoupas.size(); i++)
            {
                System.out.println("| " + i +listaRoupas.get(i));
            }
        }
    }


    public void alterarInformacoesRoupas(int idRoupas, String nome, int quantidade, double preco) {

        Roupas roupas = listaRoupas.get(idRoupas);

        roupas.setNome(nome);
        roupas.setQuantidade(quantidade);
        roupas.setPreco(preco);

        System.out.println("Roupa alterada com sucesso!");
    }

    public void removerRoupas(int idRoupas) {
        listaRoupas.remove(idRoupas);
        System.out.println("Roupa removida com sucesso!");
    }


}