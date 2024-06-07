//package loops;
//
//public class TestaLacos2 {
//    public static void main(String[] args) {
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Estou antes do switch");
//            joão:
//            gusta:switch (i) {
//                case 0:
//                case 1:
//                    System.out.println("Caso " + i);
//                    for (int j = 0; j < 3; j++){
//                        System.out.println(j);
//                        if(j == 1) break gusta;//funciona normalmente, pode nomear com dois labels
//                    }
//                    break;
//                case 2:
//                    System.out.println("Legal, " + i);
//                    continue;
//                case 3:
//                    System.out.println("Cheguei no 3");
//                    break;
//                default:
//                    System.out.println("Estranho...");
//                    break;
//            }
//            System.out.println("Estou após o switch");
//        }
//
//        System.out.println();
//
//        externo:
//        for (int i = 1; i < 10; i++) {
//            interno:
//            for (int j = 1; j < 10; j++) {
//                if (i * j == 25)
//                    break externo;    //NOMEANDO LAÇOS, se tiver outro com mesmo nome, dará erro no break, porque não sabe qual é
//                System.out.println(i + " * " + j + " = " + (i * j));
//
//            }
//        }
//        System.out.println();
//
//
//        extterno:
//        for (int j = 1; j < 10; j++) {
//            if (j == 8) break;
//            if (j == 5) continue;
//            System.out.println(j);
//        }
//
//        int i = 0;
//        lacoWhile:
//        while (i < 10) {
//            i++;
//            if (i == 5) break;
//            System.out.println("i = " + i);
//        }
//        System.out.println("Fora do while");
//    }
//}
