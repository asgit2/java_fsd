public class VarArgDemo {
    public static void main(String[] args){
        VarArgDemo ref = new VarArgDemo();
        System.out.println(ref.add(99));
        System.out.println(ref.add(67,6,99));
    }
    int add(int... values){
        int sum =0;
        for(int i:values){
            sum = sum+i;
        }
        return sum;
    }
}