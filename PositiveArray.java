package assignment3;
import java.util.Scanner;
public class PositiveArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers=new int[10];
	        Scanner sc=new Scanner(System.in);
	        for(int i=0;i<numbers.length;i++)
	        {
	        	System.out.println("Enter numbers:");
	        	numbers[i]=sc.nextInt();
	        }
	        System.out.println("Print Positive Numbers is:");
	        for(int i=0;i<numbers.length;i++)
	        {
	        	if(numbers[i]>0)
	        	{
	        		System.out.println(numbers[i]);
	        	}
	        }
	}
}
