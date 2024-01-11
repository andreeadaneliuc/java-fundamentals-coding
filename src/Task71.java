public class Task71 {
    public static void main(String[] args) {
        //fibonacci varianta 1

        fibonacci1(10);
        System.out.println();
        fibonacci2(1, 1, 10);
    }
    //fibonacci metoda 1

    public static void fibonacci2(int nr1, int nr2, int n) {
        if (n == 0) {
            System.out.println("Nu pot sa-ti afisez elemntul 0 din sirul fibonacci");
            return;
        }

        System.out.print(nr1 + ", ");
        if (n == 1) {
            return;
        }

        int temp = nr1 + nr2;
        nr1 = nr2;
        nr2 = temp;
        fibonacci2(nr1, nr2, --n);
    }

    public static void fibonacci1(int n) {
        if(n == 0) {
            return;
        }
        int a = 1;
        int b = 1;
        n = n - 2;

        int c = b;
        while (n > 0) {
            c = a + b;
            a = b;
            b = c;
            n--;
        }
        System.out.print(c + ", ");

    }
}
