class base{
    int a =544;
     base(){
        System.out.println("This is base class constructor !!"+ a);
    }
    base(int a,int b){
        System.out.println(a + b);
    }
    // void fun(int n){
    //     System.out.println("FIRST");
    // }

}
class derivv extends base {
    int b= 10;
    derivv(){
      super(2,55);
      System.out.println("this is derived class constructor " + a);
      
    }
    // derivv(int x){
    //     super (2,500);
    //     System.out.println("this is derived class constructor " + x);
        
    //   }

}
 class third extends derivv{
    third(int a){
        //super(5);
        System.out.println("This is third class " + a);
    }
    void fun(){
        System.out.println("third");
    }
}
public class constructorIninheritance {
    public static void main(String[] args) {
        third obj = new third(5);
        //obj.fun(5);
       // System.out.println(obj.b);ṇ

    }
}