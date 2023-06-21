class base {
    // final void func(){             
    //     System.out.println("This is the base class method");
    // }
    base x(){
        System.out.println("gu");
        return this;
    }
    void t(){
        System.out.println("hi");
    }
}

 class deriv extends base{  
   
    @Override      
    deriv x(){
        
        System.out.println("Gu 2");
        return  this;
       // return this;
        
    }
    
}

class Covariant {
    public static void main(String[] args) {
        
        deriv obj = new deriv();
        obj.x();
    }
}

