public class RegularInnerClassDemo{
    public static void main(String[] args) {
        outerClass.InnerClass refIn = new outerClass().new InnerClass();
        refIn.in();
    }
}
class outerClass{
    class InnerClass{
        void in(){
            System.out.println("Inside inner class method");
        }
    }
}