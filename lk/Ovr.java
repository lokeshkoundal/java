
class A{
    int a=5;
   A(int a){
    System.out.println("A ka constructor");
   }
   void display(){
    System.out.println("A ka method");
   }
    
}
class B extends A{
    int a=10;
    B(int a){
        super(7);
        System.out.println("B ka constructor");        
    }

    void display(){
        System.out.println("B ka method");
        super.display();
        super.a++;
        System.out.println(super.a);
    }

}
public class Ovr {
    public static void main(String[] args) {
        B obj = new B(7);
        obj.display();
        
    }
}
