import java.util.*;
public class trafficLights{
    public static void main(String[] args){
        System.out.println("Enter your Choice \n 1. Red \n 2. Yellow \n 3. Green");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("STOP");
                break;
            case 2:
                System.out.pritnln("READY");
                break;
            case 3:
                System.out.println("GO");
                break;
            default:
                System.out.println("Please select from the given choice");
                break;
        }
    }
}