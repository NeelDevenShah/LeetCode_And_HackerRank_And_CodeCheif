import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String [] args)
	{
		int arr[]=new int[] {0, 0, 0};
		System.out.println(threeSum(arr));
	}
	
	public static List<List<Integer>> threeSum(int[] nums)
	{
		Arrays.sort(nums);
		List<List<Integer>> ans=new ArrayList<>();
		//As we have to stop before the last two elements, As from that we have to take the tripplets, And if we move on than that will not possible
		for(int i=0;i<nums.length-2;i++)
		{
			if(i==0 || (i>0 && nums[i]!=nums[i-1]))
			{
				int low=i+1;
				int high=nums.length-1;
				
				while(low<high)
				{
					if(nums[i]+nums[low]+nums[high]>0)
					{
						high--;
					}
					else if(nums[i]+nums[low]+nums[high]<0)
					{
						low++;
					}
					else {
						ans.add(Arrays.asList(nums[i], nums[low], nums[high]));
						while(low<high && nums[low]==nums[low+1]) low++;
						while(low<high && nums[high]==nums[high-1]) high--;
						low++;
						high--;
					}
				}
			}
		}
		return ans;
	}
}
