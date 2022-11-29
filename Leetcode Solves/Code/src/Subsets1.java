import java.util.ArrayList;
import java.util.List;

public class Subsets1 {
	public static void main(String [] args) {
		int arr[]=new int[]{1,2,3};
		List<List<Integer>> ans=subsets(arr);
		for(int i=0;i<ans.size();i++) {
			System.out.print("[");
			for(int j=0;j<ans.get(i).size();j++) {
				System.out.print(ans.get(i).get(j)+",");
			}
			System.out.print("]");
			System.out.println("");
		}
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
		recursionFun(0, nums, ans, new ArrayList<Integer>());
		return ans;
    }
    
    public static void recursionFun(int idx, int[] nums, List<List<Integer>> ans, List<Integer> subAns){
		if(idx==nums.length) {
			ans.add(new ArrayList<Integer>(subAns));
			return;
		}
		subAns.add(nums[idx]);
		recursionFun(idx+1, nums, ans, subAns);
		subAns.remove(subAns.size()-1);
		recursionFun(idx+1, nums, ans, subAns);
	}
	
}
