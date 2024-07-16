import java.util.Scanner;
public class ArrayNumber{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
       System.out.println("enter a size of array");
       int n=Sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<a.length;i++){
        a[i]=Sc.nextInt();
        System.out.println(a[i]);
       }

       
    }
}