import java.util.Scanner;
public class Perc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.print("Enter your age : ");
        age = sc.nextInt();
        if(age<0 ||age>128){
            System.out.println("invalid age !");
        }
        else {
            if (age >= 18) {
                System.out.println("Yes ! you can vote ");
            } else {
                System.out.println("No ! you cannot vote ");
            }
        }
        sc.close();
    }
}
