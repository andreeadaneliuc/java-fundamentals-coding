import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti diametru: ");
        float diameter = scanner.nextFloat();

        calculatePerimeter(diameter);
        calculatePerimeter2(diameter);
    }

    public static void calculatePerimeter (float diameter) {
        final float PI = 3.14f;
        float result = PI*diameter;
        System.out.println("Perimetru este: " + result);
    }

    public static void calculatePerimeter2 (float diameter) {
        float result = (float) Math.PI * diameter;
        System.out.println("Perimetru este: " + result);
    }
}
