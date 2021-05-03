enum days{SUNDAY,MONDAY,TUESDAY,THRUSDAY,FRIDAY,SATURDAY};
public class EnumDemo{
    public static void main(String[] args) {
        days Day = days.MONDAY;

    switch (Day) {
        case SATURDAY:
            System.out.println("WeekEnd");
            break;
        case SUNDAY:
            System.out.println("WeekEnd");
            break;
    
        default:
            System.out.println("Week Day");
            break;

        }
    }
}