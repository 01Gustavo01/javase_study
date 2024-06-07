//package metodosEncapsulamento;
//class Moto{
//    public static int getTotalDeMotos(){
//        return Moto.totalDeMotos;
//    }
////    public int getTotalDeMotos(){
////        return 1;
////    }
////MÉTODO ESTÁTICO E DE CLASSE NÃO PODEM TER MESMO NOME
//
//    public static final int PADRAO_TOTAL_DE_MOTOS = 8;
//    public static int totalDeMotos = PADRAO_TOTAL_DE_MOTOS;
//
//    static int b = getMetodo();
//    public static int getMetodo(){
//        return a;
//    }
//    static int a = 15;
//    String marca;
//}
//class MotocicletaDupla extends Moto{
//    public static int getTotalDeMotos(){
//        return -500000;
//    }
//}
//
//class TestaStatic {
//    public static void main(String[] args) {
//        //Moto.marca = "Honda";  -> não funciona porque precisa criar objeto para "colocar" marca //Estática com estático
//        //Moto.totalDeMotos = 15;
//        System.out.println(Moto.b);
//        System.out.println(Moto.a);
//        System.out.println(Moto.getTotalDeMotos());
//        System.out.println(MotocicletaDupla.getTotalDeMotos());
//
//        Moto m = new MotocicletaDupla();
//        System.out.println(m.getTotalDeMotos());
//    }
//}
