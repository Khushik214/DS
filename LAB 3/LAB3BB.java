import java.util.Scanner;
public class LAB3BB {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter value of element");
            arr[i] = Sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("arr[i]");
        }
        int temp=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=temp;
        System.out.println("");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    
}
