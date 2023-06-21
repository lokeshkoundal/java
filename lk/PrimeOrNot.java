import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean p = true;
        if(n==0||n==1){
            p = false ;
            
        }
        for(int i= 2 ;i<n;i++){
            if(n%i==0){
             p = false;
             break;  
            }
              }
        
        if(p){
            System.out.println("The number is a prime number");

        }   
        else{
            System.out.println("It is not a prime number ");
        }   
        sc.close();

    }
}
