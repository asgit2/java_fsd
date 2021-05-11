interface Some{
    void doSomething();
}
class other{
    void run(Some ref){
        ref.doSomething();
    }
}
public class annoymousType2{
    public static void main(String[] args) {
        other obj = new other();
        obj.run(
            new Some(){
                @override
                public void doSomething(){
                    System.out.println("Inside Annoymouse type 2 class");
                }
            }
        );
    }
}