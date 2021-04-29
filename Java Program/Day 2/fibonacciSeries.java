public class fibonacciSeries {
    public static void main(String[] args){
    int a=1,b=1,n=11;
    System.out.print(a+ " " +b);
    for(int i=2;i<n;i++){
        int c = a+b;
        System.out.print(" "+c); 
        a=b;
        b=c;
    }
    }
}