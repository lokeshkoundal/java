import java.util.Scanner;

public class Jagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row : ");
        int n = sc.nextInt();

        int arr[][] = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the columns for the row(%d) : ", i);
            int cl = sc.nextInt();
            arr[i] = new int[cl];
        
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Enter element at index(%d,%d) : ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        sc.close();
    }
}