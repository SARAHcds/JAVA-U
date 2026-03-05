public class Vetores {
    public static void main(String[] args) {

        //Vetor armazena difeerentes tipos de dados ( porém o java armazena apenas o tipo definido inicialmente)

        double[] vetorListanumeros = new double[5]; // esse vetor armazena até 10 pois a classe definida no inicio limita

        vetorListanumeros[0] = 1; // inserindo itens na lista
        vetorListanumeros[1] = 8;
        vetorListanumeros[2] = 2;
        vetorListanumeros[3] = 4;
        vetorListanumeros[4] = 5;

        //    vetorListanumeros[5] = 6;
        // ESSE AQUI JÁ NÃO EXISTE, PORQUE O LIMITANTE SÃO 5 LINHAS CONTADO DE 0 À 4



        // PERCORRENDO VETORES EM JAVA
        // MÉTO DO TRADICIONAL - FOR
        for(int i = 0; i < vetorListanumeros.length; i++){
            System.out.println(vetorListanumeros[i]);

        }

        // FOREACH
        for(double num : vetorListanumeros){
            System.out.println(num);
        }











    }
}
