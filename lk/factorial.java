import java.util.Scanner;
public class factorial {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number : ");
        long n =sc.nextLong();
        long sum=1;

        for(long i=n;i>=1;i--){
              sum *= i;
        }
        System.out.format("The factorial of  %d  is  %d ",n,sum);
        sc.close();
    }
}