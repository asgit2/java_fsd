package pakage1;

class ScopePackageDemo{
    public static void main(String[] args){
        System.out.println("Inside package pakage1 main finction");
        other obj = new other();
        obj.doSomething();
        obj.protectedMethod();

    }
}
public class other {
    int var;
    public void doSomething(){
        System.out.println("inside Public class and public method");
    }
    protected void protectedMethod(){
        System.out.println("inside public class and protected method");
    }
    private void privateMethod(){
        System.out.println("Inside private method");
    }
    
}