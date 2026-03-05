import java.util.ArrayList;

public class ListaNomes {
    static void main(){
        ArrayList<String> listaNomes = new ArrayList<>();

        listaNomes.add("ANA");
        listaNomes.add("BEATRIS");
        listaNomes.add("CAIO");
        listaNomes.add("DIEGO");
        listaNomes.add("ELIAS");
        listaNomes.add("FABIO");
        listaNomes.add("GIL");

        // FUNÇÃO ANONIMA

        // remove valores iguais a "Gil"

        listaNomes.removeIf(nome -> nome.equals("GIL"));


        // Remove a partir do nome que começa com L
        listaNomes.removeIf( nome -> nome.contains("D"));


        for(String nome : listaNomes){
            System.out.println(nome);

        }
    }

}