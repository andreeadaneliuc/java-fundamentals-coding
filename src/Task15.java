import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Introdu nr: ");
        int[] numere = new int[10];
        for (int i = 0; i < numere.length; i++) {
            numere[i] = scaner.nextInt();
        }

        findNumbers(numere);
    }

    public static void findNumbers ( int[] numere) {
        Integer[] numereDublate = new Integer[numere.length / 2];
        int pozitie = 0;

        for (int i = 0; i < numere.length-1; i++) {
            for ( int j = i+1; j < numere.length; j++) {
                if (numere[i] == numere[j] && !containsNumber(numereDublate, numere[i])) {
                    numereDublate[pozitie] = numere[i];
                    pozitie++;
                }
            }
        }
        for(int i = 0; i < pozitie; i++) {
                System.out.println(numereDublate[i]);
            }
        }


    public static boolean containsNumber (Integer[] numere2, int numar) {
        for (int i = 0; i < numere2.length; i++) {
            if(numere2[i] != null && numere2[i] == numar) {
                return true;
            }
        }
        return false;
    }
}
