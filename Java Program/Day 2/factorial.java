public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int num = new java.util.Scanner(System.in).nextInt();
        int result =1;
        while(num>0){
            result = result * num;
            num--;
        }
        System.out.println(result);
    }
}