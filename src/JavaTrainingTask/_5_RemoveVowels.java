package JavaTrainingTask;

import java.util.Scanner;

public class _5_RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("Enter the String:");
        str = sc.next();
        System.out.println("String with Vowels: " + str);

        str = str.replaceAll("([aeiou])", "");
        System.out.println("String Without Vowels: " + str);

    }
}
