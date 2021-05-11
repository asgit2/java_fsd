interface some{
    void doSomething();
}
class myThreadClass {
    void run(some ref){
        ref.doSomething();
        Thread Thread1 = new Thread(){
            @override
            public void run(){
                System.out.println("Thread Running ... ");
            }
        };
        Thread1.start();
    }
}
public class threadAnnoymous{
    public static void main(String[] args) {
        myThreadClass mt = new myThreadClass();
        mt.run(new some(){
            public void doSomething(){
                System.out.println("Overriding interface methods");
            }
        });

    }
}