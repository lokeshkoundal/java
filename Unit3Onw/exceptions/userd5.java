import java.util.Scanner;

class InvalidAgeException extends RuntimeException{

    InvalidAgeException(){
       super();
    }
    InvalidAgeException(String msg){
        super(msg);
    }
    @Override
    public String getMessage(){
        return "negative age mat de bhen ke lode !";
    }

}

public class userd5 {
    public static void main(String[] args) {
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
         try{
         int age = sc.nextInt();
        if(age<1){
            throw new InvalidAgeException();
        }
        
        else if(age>=18){
            System.out.println("You are eligible to vote");

        }
        else{
            System.out.println("you are not");
        }
    }

    catch(InvalidAgeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        System.out.println(66);
    }
}
