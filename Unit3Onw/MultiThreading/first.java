package MultiThreading;


class MyThread extends Thread{

    public void run(){
        int i = 0 ;
         while(i<10){
         System.out.println("My thread is runningg..."); 
         i++;         }
    }

}

class MyThread2 extends Thread{

    public void run(){
        int i = 0;
        while(i<10){
          System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
          i++;
        }
        
    }
}
public class first {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();  
       t1.start();
       t2.start();
        // t1.run();
        // t2.run();
    }
}
