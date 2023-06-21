//getName and currentThread

class A extends Thread{
    public void run(){
        System.out.println(getName());
        System.out.println("hiii");
    }
}

public class getname{

    public static void main(String[] args) {
        Thread.currentThread().setName("okok");
        System.out.println(Thread.currentThread().getName());
        A t = new A();
        t.start();
        t.setName("Lokesh");
       
    }
}