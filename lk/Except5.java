import java.io.IOException;

public class Except5 { 
    //throws -- used to indicate that a method may throw one or more types of exception
    static int divide(int num, int deno)throws ArithmeticException,IOException{
        System.out.print("The division is :  ");
         return (num/deno);
    }
    public static void main(String[] args) {
        int a = divide(0, 0);
        System.out.println(a);
    }
}
