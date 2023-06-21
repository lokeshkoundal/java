class base {
    final void func(){              //yahii function chalna chahiyee--issi class ka(no overridding)
        System.out.println("This is the base class method");
    }
    void x(){
        System.out.println("gu");
    }
}

final class deriv extends base{  //final class cant be inherited 
    //      void func(){
    //     System.out.println("This is the deriv class method");   //this function cant be created bcoz there is already
    //                                                     same name  final method in a base class nd cant be overridden !
    // }
    @Override            //ensures the compiler and devloper that the method is being overridden
    void x(){
        System.out.println("Gu 2");
    }
    
}

public class Finall {
    public static void main(String[] args) {
        //final int A = 10; // A constant variable !
       // A++;              //Error
        deriv obj = new deriv();
        obj.func();

    }
}
