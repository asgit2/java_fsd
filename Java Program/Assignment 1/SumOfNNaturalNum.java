import java.util.*;

public class SumOfNNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Sum of N Natural numbers: "+calculateSum(num));
    }

    private static Object calculateSum(int num) {
        int sum =0;
        for(int i=1;i<=num;i++){
            if(i%3 == 0 || i%5 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }



}