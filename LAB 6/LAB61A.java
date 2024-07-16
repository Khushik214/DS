import java.util.Scanner;

public class LAB61A {
    static void SwapNumber(int num1, int num2) {
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("a=" + num1);
        System.out.println("b=" + num2);

    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        System.out.println("before swap");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("after swap");
        SwapNumber(a, b);

    }
}