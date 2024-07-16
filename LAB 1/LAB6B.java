
import java.util.Scanner;

public class LAB6B {
    public static void main(String[]args){
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter number");
    int b=Sc.nextInt();
    int ans=1;
    System.out.println("enter power:");
    int p = Sc.nextInt();
    
    for(int i=1;i<=p;i++){
        ans=ans*b;
    }
    System.out.println(ans);
    }





    
}
