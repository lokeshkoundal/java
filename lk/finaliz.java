class A{
    A(){
        System.out.println("hi");
    }

    public void finalize(){
        System.out.println("Inside finalize");
    }
}

public class finaliz{
    public static void main(String[] args) {
        A obj = new A();
        A obj2 = new A();
        obj2 = obj;
        new A();
        obj=null;
        System.gc();
    }
}