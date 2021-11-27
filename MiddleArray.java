package assignment3;
import java.util.Scanner;
public class MiddleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers=new int[10];
		 int index=10;
		 int MiddleNumber;
	        Scanner sc=new Scanner(System.in);
	        for(int i=0;i<numbers.length;i++)
	        {
	        	System.out.println("Enter numbers:");
	        	numbers[i]=sc.nextInt();
	        }
	        System.out.println("Middle Number is:");
	        for(int i=0;i<numbers.length;i++)
	        {
	        	MiddleNumber=(index+1)/2;
            System.out.println(MiddleNumber);
	        }
	}
}