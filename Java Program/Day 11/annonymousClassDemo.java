interface remote{
    void calculate();
}
public class annonymousClassDemo{
    public static void main(String[] args) {
        remote ref = new remote(){
            
            public void calculate(){
                System.out.println("Interface method");
            }
        };
    }
}