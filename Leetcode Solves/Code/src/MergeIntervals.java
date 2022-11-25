import java.util.ArrayList;
import java.util.Arrays;
/*
 * Here In Question It Is Not Mentioned That the given array is sorted or not, So we have to ask the interviwer that the array would be sorted or not
 * if the array would be given not sorted than By help of the Arrays.sort function we have to sort the array, but as we know the given array is 2d array, so that
 * we have to define the strategy on basis of which we can sort the given array,Hence the function for sorting would look like,
 * Arrays.sort(nums, (a,b)->(a[0]-b[0]));
 * */
public class MergeIntervals {
	public static void main(String [] args)
	{
		int[][] nums=new int[][] {{0,2},{2,3},{4,4},{0,1},{5,7},{4,5},{0,0}};
		int[][] ans= merge(nums);
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i][0]+" "+ans[i][1]);
		}
	}
	
	public static int[][] merge(int[][] nums)
	{
		Arrays.sort(nums, (a,b)->(a[0]-b[0]));
		return manageMerge(nums);
	}
	
	public static int[][] manageMerge(int[][] intervals)
	{
		int tempM=Integer.MAX_VALUE;
		int m=Integer.MAX_VALUE;
		int tempN=Integer.MIN_VALUE;
		int n=Integer.MIN_VALUE;
		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		
		for(int i=0;i<intervals.length;i++)
		{
			m=intervals[i][0];
			n=intervals[i][1];
			if(tempN>=m)
			{
				if(tempM>m)
				{
					ans.get(ans.size()-1).set(0, m);
				}
				
				if(tempN<n)
				{
					ans.get(ans.size()-1).set(1, n);
					tempN=n;
				}
			}
			else {
				ArrayList<Integer> temp=new ArrayList<>();
				temp.add(m);
				temp.add(n);
				ans.add(temp);
				
				tempM=m;
				tempN=n;
			}
		}
		int[][] ans1=new int[ans.size()][2];
		for(int i=0;i<ans.size();i++)
		{
			ans1[i][0]=ans.get(i).get(0);
			ans1[i][1]=ans.get(i).get(1);
		}
		if(intervals.length!=ans1.length)
		{
			return manageMerge(ans1);
		}
		else {
			return ans1;
		}
	}
}
