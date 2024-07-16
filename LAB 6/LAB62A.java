import java.util.Scanner;
public class LAB62A{
    static int employee_id;
    static String name;
    static String desigantion;
    static Double salary;

    LAB62A(){
        this.employee_id=employee_id;
        this.name=name;
        this.desigantion=desigantion;
        this.salary=salary;
    }
    void  details(){
        System.out.println("id:"+this.employee_id);
        System.out.println("name:"+this.name);
        System.out.println("desigantion:"+this.desigantion);
        System.out.println("salary:"+this.salary);
    }


    
        
     public static void main(String[] args) {
        
       
            Scanner Sc=new Scanner(System.in);
            System.out.println("enter id");
            employee_id=Sc.nextInt();
            System.out.println("enter name");
            name=Sc.next();
            System.out.println("enter desigantion");
            desigantion=Sc.next();
            System.out.println("enter saalry");
            salary=Sc.nextDouble();
            LAB62A em = new LAB62A();
           em.details();
        }
    }
    





















public class LAB62A {
    public static void main(String[] args) {
        
    }
    
}
