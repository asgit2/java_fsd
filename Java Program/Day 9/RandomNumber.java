import java.util.*;
public class RandomNumber{
    public static void main(String[] args){
        int min= 1000;
        int max = 9999;
        Random obj = new Random();
        for(int i=1;i<=10;i++){
            int output = obj.nextInt(max-min) + min;
            System.out.println("Number :"+output);
        }
    }
}