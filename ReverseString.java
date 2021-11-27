package assignment3;
public class ReverseString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String str="Venky";
            String res="";
          char[] arr=str.toCharArray();
          for(int i=0;i<arr.length;i++)
          {
             res=arr[i]+res;   	  
          }
          System.out.println(res);
	}
}