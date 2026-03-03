import entidades.Lanche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lanche x_burguer = new Lanche("X-BURUGER",
                "Pão, Hamburguer, Queijo, Maionese Verde",
                24.9, 10
        );

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----LISTA DE OPÇÕES----");
            System.out.println("1 - FAZER PEDIDO");
            System.out.println("2 - ADICIONAR NO ESTOQUE");
            System.out.println("3 - INFORMAÇÃO DO LANCHE");
            System.out.println("4 - ALTERAR VALOR");
            System.out.println("5 - ALTERAR DESCRIÇÃO");
            System.out.println("6 - SAIR");
            System.out.print("DIGITE A OPÇÃO DESEJADA: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Quantos lanches você deseja: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    if (x_burguer.compraEstoque(quantidade)) {
                        System.out.println("Você pediu" + quantidade + " "
                                + x_burguer.getNome() + "O valor final foi de R$" +
                                x_burguer.valorTotal(quantidade)
                        );
                    } else {
                        System.out.println("Pedido não realizado!");
                        System.out.println("Quantidade Inválida!");
                    }
                    break;


                case "2":
                    System.out.println("Atualize o estoque:");
                    int compra = sc.nextInt();
                    sc.nextLine();
                    x_burguer.compraEstoque(compra);
                    break;


                case "3":
                    System.out.println(x_burguer.toString());
                    break;



                case "4":
                    System.out.println("O lanche" + x_burguer.getNome() +
                        " Custa R$ " + x_burguer.getNome()
                    );
                    System.out.println("Informe o novo valor do lanche: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    x_burguer.setValor(valor);
                    break;

                default:
                    System.out.println("Informe uma opção válida");
                    break;


                case "5":
                    System.out.println("O lanche" + x_burguer.getDescricao()
                    + "Descrição do lanche" + x_burguer.getDescricao()
                    );

                    System.out.println("Informe a nova descrição do lanche: ");
                    String descricao = sc.nextLine();
                    x_burguer.setDescricao(descricao);
                    break;


            }
        }


    }
}
