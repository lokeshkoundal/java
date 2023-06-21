import java.util.Random;
import java.util.Scanner;
public class RPSgame {
    public static void func(int user){
        Random num = new Random();        
        int comp = num.nextInt(3);
        //0-rock
        //1-paper
        //2-scissor
        System.out.println("--------------------------------");
               if((comp == 0 && user==1)||(comp==1&&user==2)||(comp==2&&user==0)){
                   System.out.println("           You win !!");
               }
               else if(comp==user){
                   System.out.println("         It is a draww !!");
               }
               else{
                   System.out.println("       The computer Wins !!");
               }
               System.out.println("--------------------------------");
    
        System.out.print("The choice of computer : ");
        if(comp==0){
            System.out.println("Rock");
        }
        else if(comp==1){
            System.out.println("Paper");
        }
        else{
            System.out.println("scissor");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Press 0 for Rock\nPress 1 for Paper \nPress 2 for scissor : ");
        int user = sc.nextInt();
        System.out.println("Your choice is " + user );
        System.out.println("--------------------------------");
           
        while(user<0||user>2){
           System.out.print("Please Enter a valid choice : ");
           user = sc.nextInt();
            
        }
        func(user);             
        sc.close();
      

    }

}