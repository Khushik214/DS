import java.util.Scanner;

public class LAB3AB {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        boolean duplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    duplicate = true;
                }
            }
        }
        if (duplicate) {
            System.out.println("Given array contain duplicate value");
        } else {
            System.out.println("Given array contain not duplicate value");
        }
    }

}
