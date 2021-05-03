import java.util.*;
public class PrintPrimeNum {
    static boolean checkPrime(int n) {
        if (n == 1 || n == 2)
            return true;
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        System.out.println("Prime Series up to " +num);

        for (int i = 1; i <= num; i++) {
            if (checkPrime(i) == true) {
                System.out.print(i +" ");
            }
        }

    }    
}