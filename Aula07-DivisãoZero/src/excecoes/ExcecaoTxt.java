package excecoes;



import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoTxt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;

        while (true) {
            System.out.println("====SISTEMA CADASTRO===");
            System.out.println("1 - CADASTRAR PESSOA");
            System.out.println("2 - LISTAR PESSOA");
            System.out.println("3 - SAIR DO PROGRAMA");
            System.out.println("Digite a opcao: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    try {
                        System.out.print("Digite o nome da Pessoa: ");
                        String nome = sc.nextLine();

                        System.out.print("Digite a idade da Pessoa: ");
                        int idade = sc.nextInt();
                        sc.nextLine();

                        FileWriter write = new FileWriter("dados.txt", true);
                        write.write(nome + "," + idade + "\n");

                        write.close();

                        System.out.println("Dados cadastrados com sucesso!");
                    } catch (IOException e) {
                        System.out.println("ERRO AO CRIAR ARQUIVO");
                        System.out.println("Detalhe: " + e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println("Informe um valor numérico");
                        System.out.println("Detalhe: " + e.getMessage());
                    }
                    break;

                    case "2":
//                                           //    FileReader read = new FileReader("dados.txt");

                        try {
                            BufferedReader reader = new BufferedReader(new FileReader("dados.txt"));
                            String linha;

                            System.out.println("====LISTAR PESSOA===");

                            while((linha = reader.readLine()) != null ) {
                                System.out.println(linha);}

                        } catch (FileNotFoundException e) {
                            System.out.println("ARQUIVO NÃO CRIADO");
                            System.out.println("Detalhe: " + e.getMessage());

                        } catch (IOException e) {
                            System.out.println("ARQUIVO NÃO CRIADO");
                            System.out.println("Detalhe: " + e.getMessage());
                        }
                        break;

                        case "3":
                            return;
            }
        }
    }
}
