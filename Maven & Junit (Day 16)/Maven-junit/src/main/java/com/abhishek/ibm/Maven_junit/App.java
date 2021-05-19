package com.abhishek.ibm.Maven_junit;


public class App 
{
    public static void main( String[] args ){
        
    }
    
	public int divide(int first, int second) {
		int output= first/second;
    	return output;
		
	}
	public boolean isPallendrome(String str) {
		String reverse="";
		for(int i= str.length()-1;i>=0;i--) {
			reverse+= "" +str.charAt(i);
		}
		if(str.equals(reverse)) {
			return true;
		}
		return false;
	}
}
