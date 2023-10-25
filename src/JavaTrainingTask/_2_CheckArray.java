package JavaTrainingTask;

import java.util.Scanner;

public class _2_CheckArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1Tot;
        int arr2Tot;

        System.out.print("enter total number in array1:");
        arr1Tot= sc.nextInt();
        System.out.print("enter total number in array2:");
        arr2Tot=sc.nextInt();

        int[]arr1 = new int[arr1Tot];
        int[]chkarr = new int[arr2Tot];

        System.out.println("Enter numbers for array1");
        for (int i=0;i<arr1Tot;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter numbers for array2");
        for (int i=0;i<arr2Tot;i++){
            chkarr[i] = sc.nextInt();
        }

//        int[] A = { 3, 5, 7, 12, 1, 9, 10, 0, 2 };
//        int[] B = { 6, 3, 8 };

        System.out.println(checkSubset(arr1,chkarr));


    }

    public static boolean checkSubset(int[] arr1, int[] chkarr) {
        for (int i=0;i< chkarr.length;i++){
            int j=0;
            for (j=0;j< arr1.length;j++) {
                if(chkarr[i]==arr1[j]) {
                    break;
                }
            }
            if(j==arr1.length) return false;


        }
        return true;
    }
}
