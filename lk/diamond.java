import java.util.Scanner;

public class diamond {
     
    static void func(int n){

        for(int i = 1; i<=n-1; i++){                                    
            for(int k = 1; k <= n-i ; k++){              
                System.out.print(" ");                 
                       
            }
            for(int j = 1 ; j <= (i*2)-1;j++){   // 4- 8
                System.out.print("*");        //2*n-1
            }                                   //(7+1)/2 = 4
            System.out.println();               //8+1/2
        }
    


        for(int i = n; i>=1; i--){
            for(int k = 1; k <= n-i ; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        
    public static void main(String[] args){
        
        System.out.print("Enter the rows : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        while(x<3){
            System.out.print("Madarchod 3 row se kam ka diamond nhi bnta lode \nkoi dhang ki row daal na lwde : ");
            x = sc.nextInt();
        }

        int y = (x+1)/2;     //  3 - 5  4 -7
        System.out.println(y);
        func(x);
    }
}
