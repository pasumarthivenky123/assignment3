package assignment3;
public class FrequencyEvenOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=3,columns=3,CountOdd=0,CountEven=0;
	    int matrix[][]= {
	    		{1,2,3},
	    		{6,5,4},
	    		{11,12,13}
	    };
	    for(int i=0;i<rows;i++)
	    {
	    	for(int j=0;j<columns;j++)
	    	{
	    		if(matrix[i][j]%2==0)
	    		{
	            		CountEven++;
	    		}
	    		else
	    		{
	    			CountOdd++;
	    		}
	}
}
	    System.out.println("Frequency Of Odd Numbers:"+CountOdd);
	    System.out.println("Frequency Of Even Numbers:"+CountEven);
	    
}
}