import java.util.Scanner;
public class applicationDetails {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        final String str = sc.next();
        if (!isValidate(str)) {
            System.out.println("Invalid User Name");
        } else {
            System.out.println("Valid Username");
        }
    }
    private static boolean isValidate( String str) {
        if (str.length() < 12 || str.length() > 12) {
            return false;
        }
        String last = str.substring(8);
        if((last.equals("_job") == false)){
            return false;
        }
        return true;
    }
}