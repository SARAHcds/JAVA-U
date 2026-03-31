import entidades.Roupas;
import entidades.Gerenciar;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Gerenciar gerenciar = new Gerenciar();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("SELECIONE A OPÇÃO ");
            System.out.println("1 - CADASTRO DE ROUPAS AO ESTOQUE ");
            System.out.println("2 - LISTAR ROUPAS DO ESTOQUE ");
            System.out.println("3 - ATUALIZAR ROUPAS AO ESTOQUE ");
            System.out.println("4 - REMOVER ROUPAS AO ESTOQUE ");
            System.out.println("5 - SAIR ");

            System.out.print("DIGITE UMA OPÇÃO: ");
            String opcao = sc.nextLine();


            switch (opcao){
                case "1" -> {
                    System.out.println("Digite o nome da peça: ");
                    String nome = sc.nextLine();
                    sc.nextLine();

                    System.out.print("Digite a quantidade de roupas: ");
                    int  quantidade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o valor da roupa: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("CADASTRO REALIZADO");
                    sc.nextLine();

                    Roupas roupas = new Roupas(nome, quantidade, preco);
                    gerenciar.cadastrarRoupas(roupas);
                }

                case "2" -> {
                    gerenciar.listarRoupas();
                    sc.nextLine();
                }


                case "3" -> {
                    gerenciar.listarRoupas();
                    System.out.println("Digite o Id da Roupa: ");
                    int idRoupa = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o Nome da roupa: ");
                    String nomeRoupa = sc.nextLine();

                    System.out.println("Digite a quantidade de roupas: ");
                    int quantidadeRoupa = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o preço da roupa: ");
                    double precoRoupa = sc.nextDouble();
                    sc.nextLine();

                    gerenciar.alterarInformacoesRoupas(idRoupa, nomeRoupa, quantidadeRoupa, precoRoupa);
                }

                case "4" -> {
                    gerenciar.listarRoupas();
                    System.out.println("Digite o Id da Roupa: ");
                    int idRoupa = sc.nextInt();
                    sc.nextLine();

                    gerenciar.removerRoupas(idRoupa);
                }

                case "5" -> {
                    System.out.println("Saindo do programa!");
                    return;
                }

            }
        }
    }
}