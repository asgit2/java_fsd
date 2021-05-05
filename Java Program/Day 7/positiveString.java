import java.util.Scanner;

public class positiveString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        if(!isPositive(str)){
            System.out.println("Not a Positive no");
        }
        else{
            System.out.println("Positive number");
        }
    }

    private static boolean isPositive(String str) {
        
        int first = (int)(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(first> (int)str.charAt(i)){
                return false;
            }
        }
        return true;

    }
}