package Practice_Thread;

public class PThread extends Thread{
    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args) {
        PThread thrd = new PThread();
        thrd.start();
    }
}
