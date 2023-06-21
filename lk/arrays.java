import java.util.Scanner;
public class arrays{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 

       int arr[]=new int[5]; 
       for(int i=0;i<5;i++){
        System.out.print("Enter " + i + " num : ");
        arr[i]=sc.nextInt();
       }

       for(int i=0;i<5;i++){
        System.out.println(arr[i]);
       }
       System.out.println("-----------------------------");
       
       for(int xx:arr){
        System.out.println(xx);
       }
       System.out.println("-----------------------------");

       //int[] arr2 = new int[5];
       int[] arr2={22,33,44,55,66};
       System.out.println(arr2[2]);

       sc.close();
     }
}