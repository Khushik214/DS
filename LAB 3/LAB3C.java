import java.util.Scanner;
public class LAB3C {
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=Sc.nextInt();
        int i=1;
        int sum=0;
        for(i=1;i<=n;i++){
            sum +=i;
        }
        double average=(double)sum/n;
        System.out.println(average);
    }

}
