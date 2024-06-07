//package metodosEncapsulamento;
//
//
//                //Pode ter métodos e todo método tem assinatura e um corpo caso método não seja abstrato
//
//import java.io.IOException;
//                //No java não é possível ter valores padrão para parâmetros
//class Param{
//    String getNumero(int a){
//        if(a > 0) return "maior"
//        else if(a < 0) return "menor";
//        //return orbigatório
//        return null;
//    }
//    void primitivo(double a){
//        return;
//        //não pode ter código após return , ex: System.out.println();
//    }
//    void referencia(Object o){
//
//    }
//
//    void teste(int a, int b){
//        b = 10;
//
//    }
//
//}
//class ClasseComMetodos{
//                 //tipo método e retorno são obrigatórios (int, void, String)
//
//                 //final se herdado não poderá ser sobre escrito
//                 //distract só definição método , sem corpo
//                 //syncronized acesso é sincronizado bloqueia threads
//                 // native só define assinatura, sem implementaçõa/ corpo (implementação através código nativo/JMI)
//                 //strictfp contas matemáticas funcionam de maneira bem determinísitica
//
//
//                //ORDEM DOS MODIFICADORES ( Modificadores, Tipo retorno, nomeMétodo, parâmetros e throws)
//                //modificadores e throws opcionais
//    final synchronized int getNumero() throws RuntimeException, IOException {
//        return 5;
//    }
//
//}
//
//public class TestaMetodos {
//    public static void main(String[] args) {
//        Param param = new Param();
//        int a = 1;
//
//        param.getNumero(8);
//        param.primitivo('Z');
//        param.teste(1,2);
//        param.referencia(new Object());
//        param.referencia("guilherme");
//        param.primitivo(a);
//        param.teste(1,2);
//    }
//}
