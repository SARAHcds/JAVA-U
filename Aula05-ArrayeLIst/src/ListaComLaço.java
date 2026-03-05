import java.util.ArrayList;

public class ListaComLaço {

    // Lista com laço


    // wrapper class armazena e encapsula tipos primitivos em java

    public static void main(String[] args) {
        ArrayList <Integer> ListNotas = new ArrayList<>();

        ListNotas.add(10);
        ListNotas.add(6);
        ListNotas.add(9);
        ListNotas.add(8);
        ListNotas.add(7);
        System.out.print(ListNotas);


        // Adicionar valores em uma posição específica
        ListNotas.add( 2 , 3);
        ListNotas.add(4, 5);
        System.out.print(ListNotas);


        //VERIFICA TAMANHO DA LISTA

        System.out.print("O tamanho da lista é " + ListNotas.size());

        //Acessar um elemento da lista

        System.out.print("A segunda posição tem o valor " + ListNotas.get(1));

        //Alterar um valor da lista
        ListNotas.set(0, 20);
        System.out.print(ListNotas);

        //Encontrar a posição pelo valor
        ListNotas.indexOf(20);

        //Remover um item
        ListNotas.remove(2);  //Posição
        ListNotas.remove(ListNotas.indexOf(20));

        //remover a partir de uma função lambda
        ListNotas.removeIf(element -> element < 7);
        System.out.print(ListNotas);

        for(Integer nota : ListNotas){
            System.out.println(nota);
        }
    }
}
