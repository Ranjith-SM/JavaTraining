package Practice_abstract;

public class A_Main extends Abs_Class{

    public static void main(String[] args) {
        A_Main Aobj =new A_Main();
//        Abs_Class aa = new Abs_Class() ; //create child class and implement.


        Aobj.start();


    }

    @Override
    void start() {
        System.out.println("Start Running.....");
    }

//    @Override
//    void start() {
//        System.out.println("Start Running.....");
//    }
}
