package JavaTrainingTask;

import java.util.Objects;
import java.util.Scanner;

public class _4_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str1 = new StringBuilder();


        System.out.println("Enter String 1:");
        str1.append(sc.next());

        StringBuilder rev =str1.reverse();

        if(str1.equals(rev.toString())) {
            System.out.println("The Given String "+str1+" is a palindrome. Reversed String: "+rev);
        } else {
            System.out.println("The Given String "+str1+" is Not a palindrome. Reversed String: "+rev);
        }




    }
}
