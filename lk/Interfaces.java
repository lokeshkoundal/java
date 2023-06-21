//Interface   -- all the methods are abstract methods in it
interface cycle{
    int x = 5;  //by default public + static + final -- overidding not mandatory

    void brake(int decre); //by default public + abstract  --must be overridden
    //void speedup(int incre);
    default  void x(){       //to remove the boundation 
        System.out.println("Hello");
        //xxx();  //private method !
        System.out.println(x);
     }
    static void xx(){       //removes bound but can only be called using interface name
        System.out.println("Hello fraands");
         
     }
     private void xxx(){     ///can only be called from default method !!
        System.out.println("Pvt method ,can only be called by default method");
     }

}

interface B {
    int x =7;
} 

class C implements cycle,B{
     int x = 7;
int speed,brake;
// void brake(int decre){  //error bcoz cant reduce visibility

//     speed = speed - decre;

// }

@Override
public void brake(int decre){  
    System.out.println(cycle.x);
    System.out.println(x);  //-- ambiguous
    System.out.println(B.x);  //-- ambiguity resolved
    speed = speed - decre;

}
}
public class Interfaces extends C implements B {
    public static void main(String[] args) {
     System.out.println(cycle.x);//variable is static tht is why we can directly access it thru intrface(doesnt rely on obj)
     C obj1 = new C();
     cycle obj = new C();
      obj.brake(5);
      obj1.brake(7);
      obj1.x();         //default method of interface

    }
}