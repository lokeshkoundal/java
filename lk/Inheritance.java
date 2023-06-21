//single level
//multi level
//hierarical


class base{
    int a = 50;
    protected int b = 20;
    //private int p = 10;
    public int pp = 555;

    void func(){
        System.out.println("The value of a is :" + a );
    }
}

class derived extends base{
    int x = 5;
    int a=69;
    
}
class derived2 extends base{
    int n =56 ;
    void func(){
       System.out.println("This is the function of derived 2 class !!");
    }
}


public class Inheritance {
    public static void main(String[] args){
     derived obj = new derived();
     obj.func();
     System.out.println(obj.a);
     System.out.println(obj.b);
    // System.out.println(obj.p);
     System.out.println(obj.pp);
     System.out.println();
    }
}
