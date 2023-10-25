package Practice_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class C_Set {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        System.out.println(num);

        num.add(1);
        System.out.println(num);

        Set<Integer> number = new HashSet<>(num);
        System.out.println(number);


//        number.add(1);
//        number.add(2);
//        number.add(3);
//        System.out.println(number);
//
//        number.add(1);
//        System.out.println(number);
//
//        number.add(4);
    }
}
