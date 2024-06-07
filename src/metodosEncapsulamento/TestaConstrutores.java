//package metodosEncapsulamento;
//
//class A{
//    int i = 15;
//    String nome;
//    String sobrenome = "Duarte";
//    int tamanho = tamanhoDoSobrenome();
//    //String sobrenome = "Duarte";//NullPointerException
//    A(String nome){//Se classe pública, contrutor público; default/default; protected/protected
//        imprimeNome();
//        this.nome = nome;
//    }
//   private void imprimeNome(){
//        System.out.println(nome);
//    }
//    int tamanhoDoSobrenome(){
//        return sobrenome.length();
//    }
//    A(){//CONSTRUTOR TEM QUE TER NOME IDÊNTICO A CLASSE
//    }
//
//}
//class B extends A{
//    B(String s){
//        super(s);
//    }
//    void imprimeNome(){
//        System.out.println(nome.length());
//    }
//}
//public class TestaConstrutores {
//    public static void main(String[] args) {
//        A a = new A();//NÃO COMPILA
//        A b = new A("GUSTA");//COMPILAs
//        System.out.println(b.i);
//        B c = new B("guilherme");
//    }
//}
