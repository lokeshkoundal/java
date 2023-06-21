abstract class A{
    int x =5;
    void x(){
        System.out.println("X method");
    }
    void y(){
        System.out.println("y method");
    }
}
class B extends A{

}
class c{
    public static void main(String[] args) {
        B obj = new B();
        obj.x();
    }
}