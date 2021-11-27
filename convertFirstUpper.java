package assignment3;
public class convertFirstUpper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Venky";
     char[] arr=str.toCharArray();
     for(int i=0;i<arr.length;i++)
     {
    	 if(i==0)
    	 {
    		 System.out.println(arr[i]);
    	 }
    	 if(arr[i]==' ')
    	 {
           System.out.println(arr[i+1]);		 
    	 }
     }
	}
}