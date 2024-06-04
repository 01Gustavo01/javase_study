package loops;

public class TestaDoWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10)
            System.out.println(i++);
            System.out.println("oi");//imprime só um oi

        int j = 1;
        do
            System.out.println(j++);
        while (j < 10);
    }
}
