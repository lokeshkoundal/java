package MultiThreading;

class threadr implements Runnable{

    public void run(){
        int i= 0;
        while(i<400){
            System.out.println("---------------------------");
            i++;
        }
    }
}

class threadr2 implements Runnable{

    public void run(){
        int i = 0;
        while(i<400){
            System.out.println("++++++++++++++++++++++++++++++++");
            i++;
        }
    }
}

public class runnable {
    public static void main(String[] args) {
        threadr t1 = new threadr();
        threadr2 t2 = new threadr2();

        Thread t11 = new Thread(t1);
        Thread t22 = new Thread(t2);

        t11.start();
        t22.start();
         
    }
}