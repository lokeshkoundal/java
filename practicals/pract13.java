class ChildThread extends Thread {
    private String name;

    public ChildThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Child thread " + name + " is running...");
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Child thread " + name + " -has finished-");
    }
}

public class pract13 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread childThread = new ChildThread("Thread " + (i + 1));
            childThread.start();
        }
    }
}
