package MultiThreading;


class thread1 extends Thread{

    thread1(String s){
        super(s);
    }
    public void run(){
        int i = 0;
        while(i<10){
        System.out.println("Thread "+this.getName());
        i++;
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        thread1 t1 = new thread1("A-");
        thread1 t2 = new thread1("B------");
        thread1 t3 = new thread1("C----------");
        thread1 t4 = new thread1("D---------------------------------------");
        thread1 t5 = new thread1("E-----------------------");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);

        // t1.setPriority(1);
        // t2.setPriority(4);
        // t3.setPriority(5);
        // t4.setPriority(10);
        // t5.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        //t2.start();   --> will throw exception
    }
}

