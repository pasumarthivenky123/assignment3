package assignment3;
public class TwoDSumMatrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[][] matrix1= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int[][] matrix2= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		sum=matrix1[i][j]+matrix2[i][j];
        		System.out.println(sum+" ");
        	}
      }
        System.out.println();
	}
}