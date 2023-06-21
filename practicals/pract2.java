//import java.util.Scanner;
//square--side
//rectangle--l*b
//triangle--1/2*b*h
 class pract2 {
    
    public static void area(double side){
        System.out.println("The area of square is : " + (side*side));
            
    }

    public static void  area(double l,double b){
        System.out.println("The area of rectangle is : "+(l*b));
    }

    public static void area(double a,double b,double h){
        System.out.println("The area of Triangle is : "+(a*b*h));

    }
    public static void main(String[] args){
        area(5);
        area(5,5);
        area(0.5,5,6);
        

    }
}