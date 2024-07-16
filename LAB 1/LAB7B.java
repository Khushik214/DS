

import  java.util.Scanner;
public class LAB7B {
    public static void main (String[]args){
        System.out.println("number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        for(i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }

    }
    
}
