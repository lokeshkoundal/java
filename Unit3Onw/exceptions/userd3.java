//By overriding getMEssage
import java.util.Scanner;

class InvalidAge extends Exception{
   // InvalidAge(String msg){
   //     super(msg);
  //  }
    @Override
    public String getMessage(){
    return "Age is Invalid";
    }
public class userd3 {
    public static void main(String[] args) {
        System.out.print("Enter age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 0 || age > 130) {
                throw new InvalidAge();
            } else {
                System.out.println("Nice Age");
            }
        }
        catch(InvalidAge e)
        {
           // System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
}