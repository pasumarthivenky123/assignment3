package assignment3;
public class PalindromeString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="Sir";
       int start=0;
       int end=str.length()-1;
       while(start<end)
       {
    	   if(str.charAt(start)==str.charAt(end))
    	   {
    		   System.out.println("Not a palindrome");
    		   break;
    	   }
    	   start++;
            end--;
       }
       System.out.println("Palindrome");
}
}