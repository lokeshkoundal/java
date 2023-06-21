abstract class A{
    int x =5;
    abstract void x();  //only declare ,no implementation  & abstract class me hi hota h &  must be overridden
}
class B extends A{
    @Override
    void x(){
        System.out.println("X method");
    }
}
public class c{
    public static void main(String[] args) {
      B obj = new B();
      obj.x();
    }
}