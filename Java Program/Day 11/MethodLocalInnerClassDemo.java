public class MethodLocalInnerClassDemo{
    public static void main(String[] args) {
        new outerClass().doSomething();

    }
}
class outerClass{
    void doSomething(){
        class InnerClass{
            void in(){
                System.out.println("Inside Inner class method");
            }
        }
        new InnerClass().in();
    }
}