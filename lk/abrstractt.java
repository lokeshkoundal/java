
abstract class A{             //to be inherited only 
    int num = 5;
    A(){
        System.out.println("Constructor");
    }
    void y(){
        System.out.println("y");
    }
    abstract void u();     //must be overidden  -- opposite of final 
    //abstract void v();    //all the methods must be overidden  !
}

 class B extends A{
    int num =10;
    @Override
     u(){       // overidding abstract method
        System.out.println(num);
        //super.y();
        return this;
        System.out.println("Hello xx");

    }
    @Override
    void y(){
        System.out.println("y xx");
    }
}
class C extends B{
    
   @Override
    void u(){    //if method not made, error bcoz 'u' method must be overidden
    System.out.println(num);
         System.out.println("madarchod");
    }        
}                               
abstract class D extends A{               //we dont need to override that method in an extended abstract class
    int y = 50; int x = 56; int  z = 12;  
     void u(){
   System.out.println("hulle hulaare");
    }
   
}

public class abrstractt {
    public static void main(String[] args) {
       // A obj = new A();   //error
        B obj2 = new B();
       // obj2.u();
        C cobj = new C();
        cobj.u();
    }
}