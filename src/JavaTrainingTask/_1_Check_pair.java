package JavaTrainingTask;

import java.util.Scanner;

public class _1_Check_pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int No;
        System.out.print("Enter Total number in array:");
        No = sc.nextInt();

        int Target;
        System.out.println("Enter the Target value:");
        Target=sc.nextInt();

//        int[] arr = {-5, 4, -2, 16, 8, 9};
        int[] num = new int[No];
        System.out.println("enter the numbers:");
        for(int i=0;i<No;i++) {
            num[i] = sc.nextInt();
        }

        System.out.println(checkPair(num,Target));
    }

    public static boolean checkPair(int[] num, int target) {
        for (int i=0;i<num.length-1;i++){
            for (int j= (i+1);j< num.length;j++) {
                if (num[i]+num[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
