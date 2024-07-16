
import java.util.Scanner;
public class LAB51B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = { "ABC", "DEF", "PQR", "XYZ" };
        int n = (int) (Math.random() * 3);
        System.out.println("Enter a word from defined words: ");
        String w = sc.nextLine();
        s[n].sort();
        
    }
}


