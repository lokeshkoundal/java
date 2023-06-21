package expl;
import java.util.Scanner;
class Rectangle {
    int length;
    int breath;

    public Rectangle(int x, int y) {
        this.length = x;
        this.breath = y;
    }

    public int area() {
        return (length * breath);
    }
}

class max {
    int calculate_area(Rectangle arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i].area());
        }

        return max;
    }
}

 class maxArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        Rectangle arr[] = new Rectangle[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter length for " + i + " rectangle : ");
            int length = sc.nextInt();

            System.out.print("Enter breath for " + i + " rectangle : ");
            int breath = sc.nextInt();
            arr[i] = new Rectangle(length, breath);
        }

        max ob = new max();
        System.out.println(ob.calculate_area(arr));
        sc.close();
    }
}