
public class IndexOfFirstOccurence {
	public static void main(String [] args)
	{
		String haystack="leetcode";
		String needle="leeto";
		System.out.println(strStr(haystack, needle));
	}
	
	public static int strStr(String haystack, String needle)
	{
		if(haystack.contains(needle))
		{
			return haystack.indexOf(needle);
		}
		else {
			return -1;
		}
	}
	
}
