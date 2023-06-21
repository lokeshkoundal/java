class base {
    int a = 5;
    // final void func(){             
    //     System.out.println("This is the base class method");
    // }
     void x(){
        System.out.println("gu");
    }
    void t(){
        System.out.println("hi");
    }
}

 class deriv extends base{  
   
    @Override       //ensures the compiler and devloper that the method is being overridden     
     void x(){
        super.x();       //super keyword to run super class method !!
        //super.t();     //koi or function b call kr skte hn
        System.out.println("Gu 2");
        
    }
    
}

//must read rules

public class MethodOvrr {
    public static void main(String[] args) {
        
        deriv obj = new deriv();
        obj.x();

    }
}
