import java.util.ArrayList;
import java.util.List;
//The Algorithm Used For This Problem Is As Shown Below:
//Step 1: Find Start Of Decreasing Sequence Starting From End(As Genarraly From End It Is In Increasing Order)
//Step 2: Find Number For Substitution(Less Than Or Equal To One We Find In Upper Case) And Perform Swap
//Step 3: Rearrange Remaining Array By Reversing It(i.e Increasing Order From Reverse Order)
public class Permutations {
	public static void main(String [] args)
	{
		int arr[]=new int[] {1, 2, 3};
		System.out.println(permute(arr));
	}
	
	public static List<List<Integer>> permute(int [] nums)
	{
		List<List<Integer>> ans=new ArrayList<>();
		String ans1="";
		String tempAns="";
		for(int i=0;i<nums.length;i++)
		{
			ans1+=nums[i];
		}
		while(ans1.equals(tempAns)==false)
		{
			tempAns="";
			nextPermute(nums);
			List<Integer> dumAns=new ArrayList<>();
			for(int k=0;k<nums.length;k++)
			{
				dumAns.add(nums[k]);
				tempAns+=nums[k];
			}
			ans.add(dumAns);
		}
		return ans;
	}
	
	public static void nextPermute(int[] nums)
	{
		if(nums==null || nums.length<=1)
		{
			return;
		}
		
		int i=nums.length-2;
		while(i>=0 && nums[i]>=nums[i+1])
		{
			i--;
		}
		
		if(i>=0)
		{
			int j=nums.length-1;
			while(nums[j]<=nums[i])
			{
				j--;
			}
			swap(nums, i, j);
		}
		reverse(nums, i+1, nums.length-1);
	}
	
	public static void swap(int[] nums, int i, int j)
	{
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	
	public static void reverse(int[] nums, int i, int j)
	{
		while(i<j)
		{
			swap(nums, i, j);
			i++;
			j--;
		}
	}
	
}
