import java.util.ArrayList;
//Expand Around Center
public class LongestPalindromicSubstring {
	public static void main(String [] args)
	{
		String s="abc";
		if(s==null || s.length()<1)
		{
			System.out.println("");
		}
		
		int start=0, end=0;
		for(int i=0;i<s.length();i++)
		{
			//Will Help For Finding Word Having Odd Length From Center Of Word i.e. i
			int len1=exandAroundCentre(s, i, i);
			//Will Help For Finding Word Having Even Length From Center Of Word i.e. i, i+1
			int len2=exandAroundCentre(s, i, i+1);
			
			int len=Math.max(len1,  len2);
			if(len>end-start)
			{
				start=i-(len-1)/2;
				end=i+len/2;
			}
		}
		System.out.println(s.substring(start, end+1));
	}
	
	private static int exandAroundCentre(String s, int left, int right)
	{
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
		{
			left--;
			right++;
		}
		return right-left-1;
	}
}
