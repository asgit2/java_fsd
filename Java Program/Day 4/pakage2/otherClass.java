package pakage2;
import pakage1.other;

class otherClass extends other{
    public static void main(String[] args) {
        other obj = new other();
        obj.doSomething();
        //to call a protected method you have to call using subclass object
        otherClass obj2 = new otherClass();
        obj2.protectedMethod();
    }

    
}