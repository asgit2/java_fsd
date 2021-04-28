import java.util.Scanner;

public class multply {
    public static void main(String[] args){
        new multply().takeInput();
    }
    void takeInput(){
        Scanner sc= new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int result = multplyNum(first, second);
        printResult(result);
    }
    int multplyNum(int first, int second){
        return first*second;
    }
    void printResult(int output){
        System.out.println(output);
    }
    
}