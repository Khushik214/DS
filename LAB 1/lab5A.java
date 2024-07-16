import java.util.Scanner;

public class lab5A {
    public static void main(String[] rags) {
        Scanner sc = new Scanner(System.in);

    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}