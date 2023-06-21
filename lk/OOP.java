import java.util.Scanner;

   class Xx {
    Scanner sc = new Scanner(System.in);
    byte id;
    String name;
    float salary;

    public void set(){
        System.out.print("Enter the id : ");
        id = sc.nextByte();
        System.out.print("Enter the name : ");
        name = sc.next();
        name = sc.nextLine();
        System.out.print("Enter the salary : ");
        salary = sc.nextFloat();
    }
     void display(){
        System.out.println("---------------------------------");
        System.out.println("The id  of employee is : "+id);
        System.out.println("The name of employee is :"+name);
        System.out.println("The salary of the employee is : "+salary);
    }
}
public class OOP {
    public static void main(String[] args){
        Xx obj = new Xx();
        obj.set();
        obj.display();
        
    }
}
