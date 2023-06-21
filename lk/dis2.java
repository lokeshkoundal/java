class base{
    base(){
        //this(7);
        
        System.out.println("base");
    }
    base(int a,int b){
        System.out.println("base wit 2 para");
    }
    base(int a){
        this();
        System.out.println("The value of a is " + a);
             // itll call the method of same class but if it is being overidden ,then only overidden method will run
    }
    void x(){
        System.out.println("X method");
    }
    void met(){
        System.out.println("met");
    }
}
class derivd extends base{
    derivd(){
        System.out.println("Default derived");
    }
    @Override
    void x(){
          System.out.println("Void x of deriv");
    }
    derivd(int x){
           //this(7);                                                                             //error becasue constructor will become recursive !!
           super(6);                                                                          //itll call the parametarized constructor of superclass !!
           this.x();                                                                                              // itll call the function of the 'same class(derived)' --(it is overridden) !!
           super.x();                                                                                                    //itll call the function of 'super class' !!     
           this.met();                                                                                                      //itll call the met fucntion of the same class,if not found,super ka run hoga !!
           super.met();                                                                                                        //itll call the fucntion of super class,if not found,error dega !!
    }
    @Override
    void  met(){
       // this();  //error becase cannot call constructor in the method !!
    }
}
public class dis2 {
    public static void main(String[] args) {
        derivd obj = new derivd(5);
        // obj.met();
    }
}