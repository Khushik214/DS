import java.util.Scanner;
public class LAB4A2 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
         System.out.println("enter  first array size");
         int n=Sc.nextInt();
         int []first=new int[n];
         for(int i=0;i<n;i++){
            first[i]=Sc.nextInt();
         }
         int[]second=new int[n-1];
         System.out.println("enter location");
         int location=Sc.nextInt();
         for(int i=0;i<second.length;i++){
            if(location>i){
                second[i]=first[i];
            }
            else  if(location<=i){
                second[i]=first[i+1];

            }
            
         }
         for(int i=0;i<second.length;i++){
            System.out.println(+second[i]+"");
         }

    }
    
}
