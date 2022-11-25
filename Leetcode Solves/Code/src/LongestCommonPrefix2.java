public class LongestCommonPrefix2 {
	//My Approach Pure One
	public static String longestCommonPrefixfun(String[] strs)
	{
		String common=strs[0];
		for(int i=0;i<strs.length;i++)
        {
            if(strs[i]=="")
            {
            	return "";
            }
        }
		String newOne="";
		if(strs.length==1)
		{
			return strs[0];
		}
		for(int i=1;i<strs.length;i++)
		{
			if(i==1)
			{
				String searchStr=strs[1];
				int count=0;
				for(int j=0;j<searchStr.length();j++)
				{
					try {
						if(common.charAt(j)==searchStr.charAt(j) && count==j)
						{
							newOne+=common.charAt(j);
							count++;
						}
						else {
							break;
						}
					}
					catch(Exception e)
					{
						return "";
					}
				}
			}
			else {
				String searchStr=strs[i];
				int count=0;
				String tempStr="";
				for(int j=0;j<searchStr.length();j++)
				{
						if(common.charAt(j)==searchStr.charAt(j) && count==j)
						{
							tempStr+=common.charAt(j);
							count++;
						}
						else {
							if(newOne.length()>tempStr.length())
							{
								newOne=tempStr;
							}
							break;
						}
				}
			}
		}
		return newOne;
	}
	
	public static void main(String [] args)
	{
		String[] strs=new String[]{"abab","aba",""};
		String ans=longestCommonPrefixfun(strs);
		System.out.println(ans);
	}
}
