import java.util.Scanner;

class rectangle{
    double length;
    double breadth;
    double area;
    void input(){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter  length : ");
          length = sc.nextDouble();
          System.out.print("Enter  breadth : ");
          breadth = sc.nextDouble();
          sc.close();
    }
    void CalcArea(){
         area = length*breadth;
    }
    void output(){
        System.out.println("The area of Rectangle is : "+area);
    }
}

public class pract1{
    public static void main(String[] arg){
    rectangle obj = new rectangle();

    obj.input();
    obj.CalcArea();
    obj.output();
    }
}