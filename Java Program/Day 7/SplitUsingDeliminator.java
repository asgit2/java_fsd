
public class SplitUsingDeliminator {
    public static void main(String[] args) {
        String str = args[0];
        String deluminator = args[1];
        String[] output = str.split(deluminator);
        System.out.println("Output array Split using deluminator");
        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }
    }
    
}