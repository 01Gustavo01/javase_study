//package loops;
//
//import java.util.ArrayList;
//
//public class TestaFor {
//    public static void main(String[] args) {
//        //While funciona enquanto variável não atinige determinado valor
//        //For declaração; condição; incremento
//        //todos são opcionais, caso não coloque, ficará em loop infinito
//        //Segunda variável pode ser declarada com vírgula
//        //Compila e roda usando for(int i = 0,j = 0; i < 10; i++, j--, System.out.println("oi") )
//
//        for(int i = 0,j = 0; i < 10; i++, j--){
//            System.out.println(i + " " + j );
//        }
//
//
//
//        //Lista
//        int[] numeros = {1,2,3,4,5,6};
//        for (int i = 0; i < numeros.length; i++){
//            int numero = numeros[i];
//            System.out.println(numero);
//        }
//        for(int numero : numeros){
//            System.out.println(numero);
//        }
//
//        //ArrayList
//        ArrayList<String> lista = new ArrayList<String>();
//        lista.add("guilherme");
//        lista.add("mario");
//        lista.add("gededaia");
//        for(String nome : lista){
//            System.out.println(nome);
//            lista.remove(nome);
//        }
//        System.out.println(lista);
//
//
//
//    }
//}
