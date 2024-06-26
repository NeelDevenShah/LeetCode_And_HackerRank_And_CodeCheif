import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
//Done By Self
//Answer Is Coming Same, But There Is Problem Of Arrangement of answer,And 15 test cases passed out of 20 
public class Subsets2SelfTry {
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
        List<List<Integer>> ans = new ArrayList < > ();
        HashSet < String > res = new HashSet < > ();
        List < Integer > ds = new ArrayList < > ();
        recursiveFun(nums, 0, ds, res);
        for (String it: res) {
        	ArrayList<Integer> subAns=new ArrayList<>();
        	if(it.equals("[]")) {
        		ans.add(subAns);
        	}
        	else if(it.length()==3) {
        		subAns.add(Integer.parseInt(""+it.charAt(1)));
        		ans.add(subAns);
        	}
        	else {
        		for(int i=1;i<=it.length()-2;i++){
        			if(it.charAt(i)!=' ' && it.charAt(i)!=',')
        			{
        				subAns.add(Integer.parseInt(""+it.charAt(i)));
        			}
        		}
        		ans.add(subAns);
        	}
        }
        ans.sort((a,b)->(a.size()-b.size()));
        for(int i=0;i<ans.size();i++) {
        	ans.get(i).sort((a,b)->(a-b));
        }
        return ans;
    }
	
	public static void recursiveFun(int[] nums, int index, List < Integer > ds, HashSet < String > res) {
        if (index == nums.length) {
            Collections.sort(ds);
            res.add(ds.toString());
            return;
        }
        ds.add(nums[index]);
        recursiveFun(nums, index + 1, ds, res);
        ds.remove(ds.size() - 1);
        recursiveFun(nums, index + 1, ds, res);
    }
}
