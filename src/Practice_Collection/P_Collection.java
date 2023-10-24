package Practice_Collection;

import java.util.ArrayList;

public class P_Collection {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ranjith");
        names.add("Kaviya");
        names.add("keerthana");
        names.add("mohan");

        System.out.println(names);

        names.remove(2);
        System.out.println(names);

        names.remove("mohan");
        System.out.println(names);
    }
}
