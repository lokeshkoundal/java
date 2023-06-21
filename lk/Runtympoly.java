//dynamic method dispatch !!

class A{
    A(){
        System.out.println("Constructor");
    }
    void x(){
        System.out.println("This is the fuction of A class.");
    }
    void ab(){
        System.out.println("Function AB");
    }
    void n(){
        System.out.println("qwerty");
    }
}
class B extends A{
    @Override
    void x(){
        System.out.println("This is the function of class B.");
    }
   
    void y(){
        System.out.println("This is the  Y fucntion of  B class");
    }
    B(){
        System.out.println("derived class constructor");
    }
}
public class Runtympoly {
    public static void main(String[] args) {
        A obj = new B(); // new ->runtym
        obj.ab();
        obj.x();
       // obj.y();
    }

}
