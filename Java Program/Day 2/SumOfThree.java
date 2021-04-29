class SumOfThree{
    public static void main(String[] args){
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int third = Integer.parseInt(args[2]);
        int sum = first+second+third;
        if(first<=40){
            System.out.println("Student is Failing!");
            return;
        }
        if(second<=40){
            System.out.println("Student is Failing!");
            return;
        }
        if(third<=40){
            System.out.println("Student is Failing!");
            return;
        }
        if(sum<=125){
            System.out.println("Student is Failing!");
            return;
        }
        else{
            System.out.println("Student is Passing!");
        }
    }
}