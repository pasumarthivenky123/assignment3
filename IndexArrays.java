package assignment3;
import java.util.Scanner;
public class IndexArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers=new int[10];
		 int FirstIndex;
		 int LastIndex;
	        Scanner sc=new Scanner(System.in);
	        for(int i=0;i<numbers.length;i++)
	        {
	        	System.out.println("Enter numbers:");
	        	numbers[i]=sc.nextInt();
	        }
	       	System.out.println("Array entered is:");
	        for(int i=0;i<numbers.length;i++)
	        {
	         FirstIndex=numbers[0];
	         System.out.println("FirstIndex:"+FirstIndex);
	        	LastIndex=numbers[9];
	        	System.out.println("LastIndex:"+LastIndex);
	        	}
	}

}
