public class NextPermutation {
	//Lexicographical order means in increasing order of the number
	//Example:
		//123 -> 132 -> 213 -> 231 -> 312 -> 321
	//There Are Two Method To Solve This Problem
	//1.(Not Preferred) By Listing All Permutation lexicographically wise and than select the next one to the given one
	//2.(Preferred) By Using Algorithm Of Permutation
		//Algorithm Is As Shown Below:
		//Step 1: Find Start Of Decreasing Sequence Starting From End(As Generally It Would Be In Order Least To Highest(Opposite To One We Are Finding))(If Not Found Than It Is In Highest Order Just Swap It)
		//Step 2: Find Number For Substitution(Less Than Or Equal To One We Find In Upper Case)) And Perform Swap
		//Step 3: Rearrange Remaining Array By Reversing It(i.e. Increasing Order From Reverse Order)(If Step1 Success Than Remaining Part Or If Failed Than Whole Array)
		//And If Given Array Is Largest Lexicographical Order, Than Find Lowest One From That And For It We Simply Reverse Given Array
	public static void main(String [] args)
	{
		int A[]=new int[] {1, 3, 2};
		nextPermutationsol(A);
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]);
		}
	}
	
	public static void nextPermutationsol(int[] A)
	{
		if(A==null || A.length<=1)
		{
			return;
		}
		
		//As We Have A[i] And A[i+1], If we do -1 than it will Not Able To find i+1
		int i=A.length-2;
		while(i>=0 && A[i]>=A[i+1])
		{
			i--;
		}
		//If Lowest Found In Step 1 Than Only
		if(i>=0)
		{
			int j=A.length-1;
			while(A[j]<=A[i])
			{
				j--;
			}
			swap(A, i,j);
		}
//		For Both Cases(For Remaining ?Or Whole One)
		reverse(A, i+1, A.length-1);
	}
	
	public static void swap(int[] A, int i, int j)
	{
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
	
	public static void reverse(int[] A, int i, int j)
	{
		while(i<j)
		{
			swap(A, i++, j--);
		}
	}
}
