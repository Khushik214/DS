import java.util.Scanner;

public class LAB3B {
    public static void main(String[]args){
    Scanner Sc=new Scanner(System.in);
    System.out.println("enter first number");
    int n=Sc.nextInt();
    System.out.println("enter last number:");
    int m=Sc.nextInt();
    int sum=0;
    for(int i=n;i<=m;i++){
        sum +=i;
    }
    System.out.println(sum);
    }
    
}

