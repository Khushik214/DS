import java.util.Scanner;

public class LAB3D {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter no.of elements");
        int n = Sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Sc.nextInt();
        }

        int sn = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[sn]) {
                sn = i;
            }
        }
        int ln = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[ln]) {
                ln = i;
            }
        }

        System.out.println("position of smallest no.:" + sn);
        System.out.println("position of largest no.:" + ln);
    }
}
