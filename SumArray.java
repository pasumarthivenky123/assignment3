package assignment3;
import java.util.Scanner;
public class SumArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] numbers=new int[10];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<numbers.length;i++)
        {
        	System.out.println("Enter numbers:");
        	numbers[i]=sc.nextInt();
        }
        System.out.println("Array entered is:");
        for(int i=0;i<numbers.length;i++)
        {
        	sum=sum+numbers[i];
        	System.out.println(sum);
        }
	}

}
