import java.util.*;
public class ageValidation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        isAgeValid(age);
    }
    public static void  isAgeValid(int age){
        try{
            if(age<15){
                throw new AgeException("Age should be above 15 years");
            }
            else{
                System.out.println("You can proceed further");
            }
        }
        catch(AgeException ref){
            System.out.println(ref);
        }
    }
}
class AgeException extends Exception{
    public AgeException(String msg){
        super(msg);
        //System.out.println(msg);
    }
}