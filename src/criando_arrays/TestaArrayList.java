//package criando_arrays;
//
//import java.util.ArrayList;
//import java.util.Objects;
//
//public class TestaArrayList {
//    public static void main(String[] args) {
//        ArrayList<String> nomes = new ArrayList<String>();//Não obrigado declarar na primeira linha
//        nomes.add("java");
//        nomes.add("ruby");
//
//        System.out.println(nomes.contains("java"));
//
//        boolean removido = nomes.remove("java");//remove apenas a primeira ocorrência
//        System.out.println(removido);
//        System.out.println(nomes.contains("java"));
//
//        System.out.println(nomes.size());
//
//        //CONVERTE PARA ARRAY DE OBJECT
//        nomes.toArray();
//        Object[] objetos = nomes.toArray();
//
//        //CASO FOR TIPO ESPECÍFICO
//        String[] nomesArray = nomes.toArray(new String[nomes.size()]);
//        String[] nomesArray2 = nomes.toArray(new String[0]);
//
//        ArrayList<String> paises = new ArrayList<>();
//        paises.add("Brasil");
//        paises.add("Coreia");
//
//        ArrayList<String> tudo = new ArrayList<>();
//
//        tudo.addAll(nomes);
//        tudo.addAll(paises);
//        System.out.println(tudo.size());
//
//        System.out.println(nomes.get(0));// -> qual posição você quer
//
//        nomes.add(0,"php");
//        System.out.println(nomes.get(0));
//        System.out.println(nomes.get(1));
//
//        nomes.remove(0);
//        System.out.println(nomes.get(0));
//        nomes.set(0,"scala"); // -> troca elemento pelo pedido
//
//        System.out.println(nomes.indexOf("java"));
//        System.out.println(nomes.lastIndexOf("java"));
//
////        String[] nomes = new String[10];   ->  ArrayList serve melhor quando não se sabe quantos objetos serão guardados
//    }
//}
