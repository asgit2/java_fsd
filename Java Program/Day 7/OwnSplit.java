
public class OwnSplit {
    public static void main(String[] args) {
        String str = args[0];
        String deluminator = args[1];
        int count=0;
        String output[] = SplitFunction(str,deluminator);
        for(String S : output){
            System.out.println(S);
        }

    }
    /*
    private static String[] SplitFunction(String str, String deluminator) {
        char compare1,compare2;
        int count =0;
        String[] result = new String[str.length()];
        for(int i=0;i<result.length; i++) {
            result[i] = "";
        }
        for(int i=0;i<str.length();i++){
            compare1 = str.charAt(i);
            compare2 = deluminator.charAt(0);
            if(compare1 == compare2){
                count++;
                result[count] = result[count] + str.charAt(i);
                count++;
            }
            else{
                result[count] = result[count] + str.charAt(i);
            }
        }
        String[] output = new String[count];
        for(int i=0;i<output.length;i++){
            output[i] = result[i];
        }
        return output;
	}*/

    private static String[] SplitFunction(String str, String deluminator) {
        int index,count=0;
        int len = deluminator.length();
        String[] splitArray = new String[str.length()];
        for(int i=0;i<str.length();i++){
            index = str.indexOf(deluminator);
            if(index != -1){
                splitArray[count] = str.substring(0, index);
                count++;
                if((index+len-1) < str.length()){
                    str = str.substring(index+len);
                }
            }
            else{
                splitArray[count] = str;
            }
        }
        String[] output = new String[count];
        for(int i=0;i<output.length;i++){
            output[i] = splitArray[i];
        }
        return output;
    }

    
    
        
}