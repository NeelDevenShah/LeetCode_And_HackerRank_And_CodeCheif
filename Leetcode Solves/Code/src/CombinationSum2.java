import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum2 {
	public static void main(String [] args)
	{
		int arr[]=new int[] {10,1,2,7,6,1,5};
		int target=8;
		System.out.println(combinationSum2(arr, target));
	}
	
	public static List<List<Integer>> combinationSum2(int[] arr, int target) {
		List<List<Integer>> ans=new LinkedList<>();
		List<Integer> tempList=new LinkedList<>();
		Arrays.sort(arr);
		backtrack(arr, tempList, target, 0, ans);
		return ans;
    }

	public static void backtrack(int[] candidates, List<Integer> tempList, int remain,int curr, List<List<Integer>> ans)
	{
		if(remain==0)
		{
//			if(!ans.contains(tempList))
//			{
				ans.add(new LinkedList<>(tempList));
//			}
			return;
		}
		
		for(int nextCur=curr;nextCur<candidates.length;nextCur++)
		{
			//This Two Line Or The Upper Comment Ones, The Time Complexity For Bellow Two Are Less As Compared To Upper One
			if (nextCur > curr && candidates[nextCur] == candidates[nextCur - 1])
                continue;
			
			int pick=candidates[nextCur];
			if(remain-pick<0)
			{
				break;
			}
			else {
				tempList.add(pick);
				backtrack(candidates, tempList, remain-pick, nextCur+1, ans);
				tempList.remove(tempList.size()-1);
			}
		}
	}
}
