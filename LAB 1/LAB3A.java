import java.util.Scanner;

public class LAB3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if ((c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
                || c == 'u')) {
            System.out.println("Vowel");
        } else {
            System.out.println("Not");
        }
    }
}
