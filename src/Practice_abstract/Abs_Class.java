package Practice_abstract;

abstract public class Abs_Class implements Abs_interface {
    abstract void start();

    public void run() {
        System.out.println("running");
    }

    public void stop() {
        System.out.println("Stopped...");
    }
}
