import java.util.Scanner;

public class SumOfCubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int sum=0,digits;
        while(num!=0){
            digits = num%10;
            sum = sum+ (digits * digits * digits);
            num = num/10;
        }
        System.out.println("Result= "+ sum);
    }
}