package assignment3;
public class TriangularMatrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=3,columns=3;
	    int matrix[][]= {
	    		{1,2,3},
	    		{6,5,4},
	    		{11,12,13}
	    		};
	    if(rows!=columns)
	    {
	    	System.out.println("Square Matrix");
	    }
	    else
	    {
	    	System.out.print("Lower Triangular Matrix");
	    }
	    for(int i=0;i<rows;i++)
	    {
	    	for(int j=0;j<columns;j++)
	    	{
	    		if(j>i)
	    		{
	    		System.out.println("0");
	    	}
	    		else
	    		{
	    			System.out.print(matrix[i][j]+" ");
	    		}
	    }
	    System.out.println();
		}
	}
}