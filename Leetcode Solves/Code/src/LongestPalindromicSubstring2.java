import java.util.ArrayList;
//By Dynamic Programming Method(DP)
public class LongestPalindromicSubstring2 {
	public static void main(String [] args)
	{
		//For Processing the data
		String s="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		boolean ans=false;
		int maxLen=0;
		String maxVal="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=s.length()-1;j>i;j--)
			{
				ans= recursivelyChecking(s, i, j);
				if(ans==true)
				{
					String tempAns="";
					tempAns=s.substring(i, j+1);
					int tempLen=tempAns.length();
					if(tempLen>maxLen)
					{
						maxLen=tempLen;
						maxVal=tempAns;
					}
				}
			}
		}	
		
		//For processing final Output
		if(maxLen==0)
		{
				System.out.println(s.charAt(0)+"");
		}
		else
		{
			System.out.println(maxVal);
		}
	}
	public static boolean recursivelyChecking(String s, int startIndex, int endIndex)
	{
		boolean alright=true;
			if(s.charAt(startIndex)==s.charAt(endIndex))
			{
				if(startIndex==endIndex || (endIndex-startIndex)==1)
				{
					return true;
				}
				alright= recursivelyChecking(s, startIndex+1, endIndex-1);
			}
			else {
				alright=false;
			}
		return alright;
	}
}
