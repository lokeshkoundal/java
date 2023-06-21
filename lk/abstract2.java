abstract class A{             //to be inherited only 
    int a=5;
    void y(){
        System.out.println("y");
    }
    void x(){
        System.out.println("xxx");
    }

}
class B extends A{
    @Override
    void y(){
        System.out.println("y xx");
    }
}
class C extends A{
    @Override
    void y(){    
         System.out.println("madarchod");
    }        
}                               


public class abstract2 {
    public static void main(String[] args) {
        // A obj = new A();   //error
        B obj2 = new B();
        // obj2.u();
        C cobj = new C();

    }
}