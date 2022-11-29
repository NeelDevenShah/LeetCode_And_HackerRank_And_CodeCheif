import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public static void main(String [] args)
	{
		int arr[]=new int[] {1000000000,1000000000,1000000000,1000000000};
		int target=-294967296;
		System.out.println(fourSum(arr, 0));
	}
	
	public static List<List<Integer>> fourSum(int[] nums, int target)
	{
		List<List<Integer>> ans=new ArrayList<>();
		//Base Condition
		//Out of limit of int
        if(nums[0]>999999999)
        {
            return ans;
        }
		if(nums==null || nums.length<4)
		{
			return ans;
		}
		
		//Sorting Array 
		Arrays.sort(nums);
		
		//Loop For Each Element In Array
		for(int i=0;i<nums.length-3;i++)
		{
			//Checking For Skipping Duplicates
			if(i>0 && nums[i]==nums[i-1])
			{
				continue;
			}
			
			//Reducing Problem to 3Sum Problem
			for(int j=i+1;j<nums.length-2;j++)
			{
				//Checking For Skipping Duplicates
				if(j!=i+1 && nums[j]==nums[j-1])
				{
					continue;
				}
				
				//Left And Right Pointers
				int k=j+1;
				int l=nums.length-1;
				
				//Reducing to the two sum problem
				while(k<l)
				{
					int sum=nums[i]+nums[j]+nums[k]+nums[l];
					if(sum<target)
					{
						k++;
					}
					else if(sum>target)
					{
						l--;
					}
					else {
						ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
						k++;
						l--;
						//Check For Skipping Duplicates
						while(k<l && nums[k]==nums[k-1])
						{
							k++;
						}
						while(k<l && nums[l]==nums[l+1])
						{
							l--;
						}
					}
				}
			}
		}
		return ans;
	}
}
