import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int a=1,b=1;
        System.out.println("Series :");
        System.out.print(a+ " " +b);
        for(int i=2;i<n;i++){
            int c = a+b;
            System.out.print(" "+c); 
            a=b;
            b=c;
        }
        }
    
}