package assignment3;
public class PrintColumnWiseMatrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int rows=3;
    int columns=5;
    int matrix[][]= {
    		{1,2,3,4,5},
    		{6,7,8,9,10},
    		{11,12,13,14,15}
    		};
    for(int i=0;i<rows;i++)
    {
    	for(int j=0;j<columns;j++)
    	{
    		System.out.println(matrix[i][j]+" ");
    	}
    }
    System.out.println();
	}
}