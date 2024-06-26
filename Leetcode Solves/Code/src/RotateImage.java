public class RotateImage {
	//Here It Can Be Done By Two Methods
	//1. (Not Recommended By Interviewer, As It Takes Extra Space Complexity) By Making New Array And By Taking The First Element Of Each Sub=Array From Starting Of Subarray, And Will Go From The Ending To Starting Of Array To Take The Subarray
	//And Than Will Make The New Sub-array With First Ones That We Have Collected
	//2. By Help Of Algorithm:
		//Step 1: First Make Transpose
		//Step 2: Than Interchange Or Swipe The Columns
		//In This Method No New Memory Location Is Required To Make, The Existing One Can Be Easily Be Utilized
	public static void main(String [] args)
	{
		int arr[][]=new int[][] {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		rotate(arr);

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static void rotate(int[][] matrix)
	{
		//Logic For Doing Transpose
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=i;j<matrix[0].length;j++)
			{
				int temp=0;
				temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		
		//Logic For Interchanging Columns
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length/2;j++)
			{
				int temp=matrix[i][j];
				matrix[i][j]=matrix[i][matrix.length-1-j];
				matrix[i][matrix.length-1-j]=temp;
			}
		}
	}	
}
