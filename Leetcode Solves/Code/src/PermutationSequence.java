public class PermutationSequence {
	//The Algorithm Used For This Problem Is As Shown Below:
	//Step 1: Find Start Of Decreasing Sequence Starting From End(As Genarraly From End It Is In Increasing Order)
	//Step 2: Find Number For Substitution(Less Than Or Equal To One We Find In Upper Case) And Perform Swap
	//Step 3: Rearrange Remaining Array By Reversing It(i.e Increasing Order From Reverse Order)
	public static void main(String [] args)
	{
		System.out.println(getPermutation(4,9));
	}
	
	public static String getPermutation(int n, int k) {
		int arr[]=new int[n];
		for(int i=1;i<=n;i++)
		{
			arr[i-1]=i;
		}
		for(int i=2;i<=k;i++) {
			nextPermutation(arr);
		}
		String ans="";
		for(int j=0;j<arr.length;j++) {
			ans+=arr[j];
		}
		return ans;
    }
	
	public static void nextPermutation(int[] arr)
	{
		int i=arr.length-2;
		while(i>=0 && arr[i]>=arr[i+1]) {
			i--;
		}
		if(i>=0) {
			int j=arr.length-1;
			while(arr[j]<=arr[i]) {
				j--;
			}
			swap(arr, i, j);
		}
		reverse(arr, i+1, arr.length-1);
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void reverse(int[] arr, int i, int j)
	{
		while(i<j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
}
