
import java.util.Scanner;

public class LAB8B {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int count=0;
        int i=1;
        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            
            
               if(count==1){
                System.out.println("prime number");
                    }
                  else{
                System.out.println("not prime number");
                 }
            }
        }

    }
}
