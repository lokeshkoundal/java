import java.util.*;

 class areaOfShapesForMethodOverloading {

    public static void area(double a){
        System.out.println("THE AREA OF SQUARE IS : " + (a * a));;
    }

    public static void area(double l, double b){
        System.out.println("THE AREA OF RECTANGLE IS : " + (l * b));
    }

    public static void area(double x,double bt,double h){
        System.out.println("THE AREA OF TRIANGLE IS : " + (x * bt * h));
    }

    public static void main(String[] args) {
        double a,l,b,bt,h;
        final double x=0.5;
       
        Scanner sc = new Scanner(System.in);

        System.out.print("+++++++++++METHOD OVERLOADING+++++++++++\n1.Area of square\n2.Area of Rectangle\n3.Area of Triangle\nEnter your choice : ");
        int choice = sc.nextInt();

        while(choice<0||choice>3){
            System.out.print("please Enter a valid choice : ");
             choice = sc.nextInt();
        }
    

        if(choice == 1){
            
            System.out.print("Enter length for Sqaure: ");
            a = sc.nextDouble();

            area(a);
        }

        else if(choice == 2){
            
            System.out.print("Enter length for rectangle : ");
            l = sc.nextDouble();
            
            System.out.print("Enter breath for rectangle : ");
            b = sc.nextDouble();

            area(l,b);
        }

        else{
            
            System.out.print("Enter base length for triangle : ");
            bt = sc.nextDouble();
            
            System.out.print("Enter height for triangle : ");
            h = sc.nextDouble();
    
            area(x,bt,h);
        }
        
        sc.close();
    }
}