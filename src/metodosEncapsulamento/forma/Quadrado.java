package metodosEncapsulamento.forma;

public class Quadrado extends Forma{
    private String cor = "vermelha";

    @Override
    void imprimeCor() {
        super.imprimeCor();//chamando imprime cor do "pai"
        System.out.println(cor);
    }
}
