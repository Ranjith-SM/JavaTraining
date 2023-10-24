package Practice_obj;

import javax.xml.namespace.QName;

public class Practice {

    String Name = "RAnjith";

    public static void main(String[] args) {

        Practice pObj = new Practice();
        System.out.println(pObj.Name);
        String fname = "Mohan";
        pObj.m1(fname);

    }
    public final void m1(String name) {
        String fName = "Kaviya";
        System.out.println(fName);
        fName = name;
        System.out.println(fName);
//        return fName;
    }
}
