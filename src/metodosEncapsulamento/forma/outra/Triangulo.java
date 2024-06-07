package metodosEncapsulamento.forma.outra;

import metodosEncapsulamento.forma.Forma;

public class Triangulo extends Forma {
    public void imprime(){
        System.out.println("Lado = " +  this.lado);
       // System.out.println("Lado = " +  ((Forma)this).lado);
    }
    public void imprime2(){
        //System.out.println(this.getPerimetro());//Não pode
    }
}
