public class MaximumSubarray {
	public static void main(String [] args)
	{
		int nums[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums)
	{
		//1. Non-Effective Solution(Not Recomended As it takes lot of time)(last 5 test cases not solved due to time limit)
//		if(nums.length==0)
//		{
//			return 0;
//		}
//		else if(nums.length==1)
//		{
//			return nums[0];
//		}
//		
//		int max=Integer.MIN_VALUE;
//		for(int n=0;n<nums.length;n++)
//		{
//			for(int i=0;i<(nums.length);i++)
//			{
//				if(i+n<nums.length)
//				{
//					int tempSum=0;
//					for(int j=i;j<=(n+i);j++)
//					{	
//							tempSum+=nums[j];
//					}
//					if(tempSum>max)
//					{
//						max=tempSum;
//					}
//				}
//			}
//		}
		//2. Most Effective And Easy Solution That Is Un-belivable But Working
			int n=nums.length;
			int max=Integer.MIN_VALUE, sum=0;
			
			for(int i=0;i<n;i++)
			{
				sum+=nums[i];
				max=Math.max(max, sum);
				
				if(sum<0)
				{
					sum=0;
				}
			}
		return max;
	}
}
