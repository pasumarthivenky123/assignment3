package assignment3;
import java.util.Scanner;
public class DifferenceArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers1=new int[10];
		 int[] numbers2=new int[10];
	        int diff=0;
	        int n=10;
	        Scanner sc=new Scanner(System.in);
	        for(int i=0;i<n;i++)
	        {
	        	System.out.println("Enter numbers1:");
	        	System.out.println("Enter numbers2:");
	        	numbers1[i]=sc.nextInt();
	        	numbers2[i]=sc.nextInt();
	        }
	        System.out.println("Array entered is:");
	        for(int i=0;i<n;i++)
	        {
	        	diff=numbers1[i]-numbers2[i];
	        	System.out.println(diff);
	        }
	}
}