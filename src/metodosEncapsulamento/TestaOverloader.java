//package metodosEncapsulamento;
//class Overloader {
//    public void metodo2(String s){
//        System.out.println("com String");
//    }
//    public void metodo2(Object s){
//        System.out.println("com Object");
//    }
//    public void metodo3(String a, int b){
//        System.out.println("String, int");
//    }
//    public void metodo3(int b, String a){
//        System.out.println("int, String");
//    }
//    public void metodo(int a){
//        System.out.println("com int");
//    }
//    public void metodo(double a){
//        System.out.println("com double");
//    }
//    public void metodo(){
//        System.out.println("sem nada");
//    }
//}
//
//class TestaOverloader{
//    public static void main(String[] args) {
//        new Overloader().metodo3();
//
//        new Overloader().metodo2("guilherme");//Apesar dos 2 serem Objects, chama o String porque é o mais específico
//        new Overloader().metodo2(new Object());
//
//        new Overloader().metodo();
//        new Overloader().metodo((short)123);//casting
//        new Overloader().metodo(423);
//        new Overloader().metodo((float)423);
//        new Overloader().metodo(423.3);//No tempo de compilação, ele detecta e escolha o ideal
//    }
//}
