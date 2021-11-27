package assignment3;
public class WordString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Hello Venky";
        int intIndex=str.indexOf("Venky");
        if(intIndex==-1)
        {
        System.out.println("Hello not found");	
        }
        else
        {
        	System.out.println("Found Hello at index"+intIndex);
        }
	}
}