import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti greutatea: ");
        double weight = scanner.nextDouble();
        System.out.println("Introduceti inaltimea in metrii: ");
        double heightMeters = scanner.nextDouble();
        System.out.println("Introduceti inaltimea in cm: ");
        double heightCm = scanner.nextDouble();

        double bmi = calculateBMICm(weight, heightCm);
        System.out.println("BMI in centimetrii: " + bmi);
        checkRange(bmi);

        System.out.println("BMI in metrii " + calculateBMI(weight, heightMeters));
        checkRange(calculateBMI(weight, heightMeters));
    }

    public static double calculateBMI(double weight, double height) {

        return weight/Math.pow(height, 2);
    }
    public static double calculateBMICm (double weight, double height) {
        height = height/100;
        return weight/Math.pow(height, 2);
    }


    public static void checkRange(double bmi) {

        if(bmi < 18.5 || bmi > 24.9) {
            System.out.println("BMI is not optimal");
        } else {
            System.out.println("BMI is optimal");
        }
    }

}
