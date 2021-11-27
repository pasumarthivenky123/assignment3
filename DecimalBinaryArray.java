package assignment3;
public class DecimalBinaryArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]=new int[4];
        int d=11;
        int r;
         for(int i=0;i<arr.length;i++)
         {
        	while(d>0)
        	{
        	  r=d%2;
        arr[i]=r;
        	  d=d/2;
        	  i++;
        	}
         }
         for(int i=3;i>=0;i--)
         {
        	 System.out.println(arr[i]);
         }
	}
}