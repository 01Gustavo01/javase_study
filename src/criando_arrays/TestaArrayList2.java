//package criando_arrays;
//
//import java.awt.datatransfer.Clipboard;
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class TestaArrayList2 {
//    public static void main(String[] args) {
//        ArrayList<String> nomes = new ArrayList<>();
//        nomes.add("java");
//        nomes.add("ruby");
//        nomes.add("scala");
//
//        Iterator<String> it = nomes.iterator();
//
//        while(it.hasNext()){
//            String atual = it.next();
//            System.out.println(atual);
//            it.remove();
//        }
//        System.out.println(nomes.size());
//
//        for(String nome : nomes){
//            System.out.println(nome);
//        }
//
//        Cliente gui = new Cliente();
//        gui.nome = "Guilherme";
//
//        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
//
//        clientes.add(gui);
//        System.out.println(gui.nome);
//        System.out.println(clientes.get(0).nome);
//
//        gui.nome = "Silveira";
//
//
//    }
//}
//
//class Cliente{
//    String nome;
//}
