package assignment3;
public class SquareMatrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=3,columns=3;
	    int matrix[][]= {
	    		{1,2,3},
	    		{6,5,4},
	    		{11,12,13}
	    		};
	    for(int i=0;i<rows;i++)
	    {
	    	for(int j=0;j<columns;j++)
	    	{
	    		if(rows==columns)
	    		{
	    		System.out.println("Square Matrix");
	    	}
	    		else
	    		{
	    			System.out.println("Not a Square Matrix");
	    		}
	}
	    }
}
}