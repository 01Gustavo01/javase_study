package heranca;

import heranca.modelo.Endereco;

class Mae{}

class Filha extends Mae{}

class Neta extends Filha{//não pode herdar mais de uma, inclusive Object
}

//class Avenida extends Endereco {}

class X{
    int x;
    void y(){
        System.out.println("Invocando y em um objeto");
    }
}
class Y extends X{}

class W{
    public static void metodo() {
        System.out.println("Invocando método estático W");
    }
    //abstract static void x();
}

class Z extends W{
    public static void metodo() {
        //super.metodo();/não pode
        System.out.println("Invocando método estático Z");
    }
}

class Gato{
    String corDosOlhos;
    public String toString(){
        return "[Gato " + corDosOlhos + "]";//sobrescrever método
    }
}

public class TestaHeranca {
    public static void main(String[] args) {
        Gato g = new Gato();
        g.corDosOlhos = "mel";
        System.out.println(g.toString());//transforma Object em String, devolve tipo Object e endereço memória

        Y y = new Y();
        y.x = 15;//Não pode ser acessado
        y.y();

        W.metodo();//2 referenciando mesmo método
        Z.metodo();//2 referenciando mesmo método

        Z z = new Z();
        z.metodo();

        W w = new Z();//através do polimorfismo pode chama-lo
        w.metodo();//chamará W w em tempo de compilação, fazendo BINDING
    }
}