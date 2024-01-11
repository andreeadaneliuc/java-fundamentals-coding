import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
            int[] numere = {1, 3, 8, 4, 2, 5, 6, 11, 13, 7};
            Scanner scanner = new Scanner(System.in);
            longestSubSequence(numere);
        }

        private static void longestSubSequence(int[] numbers) {
            int temporarySeq = 1, max = 1;
            for(int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i]<numbers[i+1]) {
                    temporarySeq++;
                }
                else {
                    temporarySeq = 1;
                }
                if(max<temporarySeq) {
                    max = temporarySeq;
                }
            }
            System.out.println(max);
        }
    }

