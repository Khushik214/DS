import java.util.Scanner;

public class LAB4A {
    public static void main(String[] rags) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = Sc.nextInt();
        int fact = 1;
        int i = 1;
        for (fact = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
