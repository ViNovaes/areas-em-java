

public class quadrilatero {
    public static void area(double lado) {
        System.out.println("Àrea do quadrado: " + lado*lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Àrea do retângulo: " + lado1*lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Àrea do trapézio: " + ((baseMaior+baseMenor)*altura) / 2 );
    }
}
