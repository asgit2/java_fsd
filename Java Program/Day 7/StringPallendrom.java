
public class StringPallendrom {
    public static void main(String[] args) {
        String str = args[0];
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("Pallendrome");
        }
        else{
            System.out.println("Not a Pallendrome");
        }
    }
}