package JavaTrainingTask;

public class _3_PrimeNumber {
    public static void main(String[] args) {
        System.out.print("PrimeNumbers between 1-100 are: ");

        for (int i = 2; i < 101; i++) {
            int count=0;
            for (int j = 1; j <=i; j++) {
                if (i%j == 0) {
                    count++;
                }
            }
            if (count==2){
                System.out.print(i +"\t");
            }
        }
    }
}
