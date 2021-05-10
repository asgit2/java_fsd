import java.util.*;
public class ValidateName{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Name");
        String firstName = sc.next();
        System.out.println("Enter second name");
        String lastName = sc.next();

        isValid(firstName,lastName);
    }
    public static void isValid(String fname,String lname) {
        try{
            if(!(isAlpha(fname)) || !(isAlpha(lname))){
                throw new InvalidNameInputException("Invalid Name! please Enter again");
            }
            else{
                System.out.println("Valid you can go ahead");
            }
        }
        catch(InvalidNameInputException ref){
            System.out.println(ref);
        }
        
    }
    public static boolean isAlpha(String name){
        char[] chars = name.toCharArray();
        for(char c : chars){
            if(!Character.isLetter(c)){
                return false;
            }
        }
        return true;
    }
}
class InvalidNameInputException extends Exception{
    public InvalidNameInputException(String msg){
        super(msg);
    }
}