public class MethodOverload {
    public static void main(String[] args){
        MethodOverload obj = new MethodOverload();
        System.out.println(obj.add(20, 10));
        System.out.println(obj.add(10, 92, 9));

    }
    int add(int n1, int n2){
        return n1+n2;
    }
    int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}