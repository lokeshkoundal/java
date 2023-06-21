package pract;
import java.io.IOException;
import java.util.*;


public class CHECKED {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try{
     System.out.print("Enter the number : ");
     int a = sc.nextInt();
     System.out.println(5/a);
     if(a==5){
        throw new ArithmeticException("hii");
     }
    }


    //  catch(ArithmeticException e){
    //      System.out.println(e.getMessage());
    //      System.out.println(e.toString());
    //      System.out.println(e);
    //      e.printStackTrace();
    //  }

     finally{
        System.out.println("finally");
     }
    //  catch(InputMismatchException e){
    //     e.printStackTrace();
    //  }
     

}
}
