import java.util.Scanner;

public class sumOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides");
        String str = sc.nextLine();
        String[] sides = str.split(" ");
        int sum=0;
        for(int i=0;i<sides.length;i++){
            
            sum = sum+ (Integer.parseInt(sides[i]));
            System.out.println(Integer.parseInt(sides[i]));
        }
        
        System.out.println("Sum:"+sum);
    }
}