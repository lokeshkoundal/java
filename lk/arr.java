import java.util.*;
public class arr {
    public static void main(String[] args ){
    // int size=5;
    // int[] arr = new int[size];
    // char[] arrs = new char[5];
    Scanner sc =new Scanner(System.in);
    

    long[][][] s = new long[2][2][3];
   
    for(int i = 0 ; i<2;i++){
        for(int j = 0; j <2 ; j++) {
            for(int k = 0; k<3 ;k++){
            System.out.printf("Enter the value of %d - %d - %d : ",i,j,k);
            s[i][j][k] = sc.nextLong();
        }
    }
        System.out.println();
    }
    for(int i = 0 ; i<2;i++){
        for(int j = 0; j <2 ; j++) {
            for(int k=0;k<3;k++){
            System.out.print(s[i][j][k]);
            System.out.print("\t");
           
        }
        
    }
        System.out.println();
    }

    sc.close();
    }
}