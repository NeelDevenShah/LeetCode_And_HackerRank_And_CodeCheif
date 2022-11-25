import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
//Done By Self
//Answer Is Coming Same, But There Is Problem Of Arrangement of answer,And 15 test cases passed out of 20 
public class Subsets2 {
	
	public static void main(String args[]) {
        int nums[]={4,4,4,1,4};
        List<List<Integer>> ans = subsetsWithDup(nums);
        for(int i=0;i<ans.size();i++) {
			System.out.print("[");
			for(int j=0;j<ans.get(i).size();j++) {
				System.out.print(ans.get(i).get(j)+",");
			}
			System.out.print("]");
			System.out.println("");
		}
    }
	
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(res,new ArrayList<>(),nums,0,false);
        return res;
    }
	
	public static void helper(List<List<Integer>> res, List<Integer> ls, int[] nums, int pos, boolean choosePre) {
        if(pos==nums.length) {
            res.add(new ArrayList<>(ls));
            return;
        }
        helper(res,ls,nums,pos+1,false);
        if(pos>=1&&nums[pos]==nums[pos-1]&&!choosePre) return;
        ls.add(nums[pos]);
        helper(res,ls,nums,pos+1,true);
        ls.remove(ls.size()-1);
    }
	
}
