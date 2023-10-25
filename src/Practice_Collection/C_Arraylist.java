package Practice_Collection;
import java.util.ArrayList;
public class C_Arraylist {

    public static void main(String[] args) {

//        java.util.ArrayList<String> names = new java.util.ArrayList<>();
//        names.add("Ranjith");
//        names.add("Kaviya");
//        names.add("keerthana");
//        names.add("mohan");
//
//        System.out.println(names);
//
//        names.remove(2);
//        System.out.println(names);
//
//        names.remove("mohan");
//        System.out.println(names);

        ArrayList<Student> Details = new ArrayList<>();

        //setting data using constructor
        Details.add(new Student(1,"Ranjith"));
        Details.add(new Student(2,"Kaviya"));
        Details.add(new Student(3,"keerthana"));
        Details.add(new Student(4,"Mohan"));
        for (Student detail:Details){
            System.out.println(detail.getName());
        }
        System.out.println("\n");

        //setting data through object
        Student studObj = new Student();
        studObj.setrollno(1);
        studObj.setName("Ranjith");
        Details.add(studObj);
        for (Student detail:Details){
            System.out.println(detail.getName());
        }
        System.out.println("\n");


        //updating data
        Details.set(4,new Student(4,"Sree"));
        for (Student detail:Details){
            System.out.println(detail.getName());
        }
        System.out.println("\n");


    }
}
