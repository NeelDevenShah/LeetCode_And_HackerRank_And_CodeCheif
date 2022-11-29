public class UniquePaths {
//	In This Program, We have Make an 2d matrix and in it we have marked the position where we want to go as 0, And 
//	Also we have made the last row and column of the matrix to be 1
//	Now As Per given question we know that the robot can only perform in two direction downward or rightward
//	So the one way to find the possible way an robot can move to go to destination is that if we start counting from the final point where we want to go
//	And than we will make the sum of the possibilities at the resultant box, By adding the possibilities at the right box and downward box
//	Example is:
	/*
	 * ......1  ......1  ......0  ......0  ......0
	 * ......1->.....21->.....20->....320->...4320  -->Answer is at arr[0][0], we will get the total number of the possibilities by which one can reach desired position
	 * 1111110  1111110  1111110  1111110  1111110
	 * */
	public static void main(String [] args) {
		System.out.println(uniquePath(1, 2));
	}
	
	public static int uniquePath(int m, int n) {
		
		if(m==1 || n==1) {
			return 1;
		}
		
		int arr[][]=new int[m][n];
		arr[m-1][n-1]=0;
		
		for(int i=0;i<m;i++) {
			arr[i][n-1]=1;
		}
		for(int j=0;j<n;j++) {
			arr[m-1][j]=1;
		}
		
		for(int i=(m-2);i>=0;i--)
		{
			for(int j=(n-2);j>=0;j--){
				arr[i][j]=arr[i][j+1] + arr[i+1][j];
			}
		}
		return arr[0][0];
	}
}
