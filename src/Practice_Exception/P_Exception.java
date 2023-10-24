package Practice_Exception;

public class P_Exception {

    public static void main(String[] args) throws Exception {

        Test obj = new Test();
        obj.mThrow();


        try {
            int a= 12/0;
        } catch(Exception e) {
            if(e instanceof ArithmeticException) {
                System.out.println("error");
            } else {
                System.out.println(e);
            }
        }
    }
}

class Test {
    void mThrow() throws Exception  {
        throw new Exception("Custom Error");
    }
}

