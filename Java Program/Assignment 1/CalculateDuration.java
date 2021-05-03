import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class CalculateDuration {
    public static void main(String[] args) {
        System.out.println("Enter Date in this format (DD/MM/YYYY)");
        Scanner sc = new Scanner(System.in);
        String inputDate = sc.next();
        String[] DateComponents = inputDate.split("/");
        int DD = Integer.parseInt(DateComponents[0]);
        int MM = Integer.parseInt(DateComponents[1]);
        int YYYY= Integer.parseInt(DateComponents[2]);
        LocalDate enteredDate = LocalDate.of(YYYY,MM,DD);
        System.out.println("Current Date = " +LocalDate.now());
        System.out.println("Entered Date = " + enteredDate);
        Period p = Period.between(enteredDate, LocalDate.now());
        System.out.println("---------------------------");
        System.out.println("Days:"+ p.getDays());
        System.out.println("Months: "+p.getMonths());
        System.out.println("Years:" + p.getYears());
    }    
}