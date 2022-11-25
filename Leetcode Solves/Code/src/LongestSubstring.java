import java.util.ArrayList;
import java.util.Map;

public class LongestSubstring {
	public static void main(String [] args)
	{
		ArrayList<Character> arr=new ArrayList<>();
		int max=0, counter=0, starting=0;
		String s=" ";
		for(int i=0;i<s.length();i++)
		{
			if(arr.contains(s.charAt(i)))
			{
				if(counter>max)
				{
					max=counter;
				}
				
				if(starting==s.length()-1)
				{
					break;
				}
				else {
					counter=0;
					arr.clear();
					i=starting;
				}
			}
			else {
				if(counter==0)
				{
					starting=i;
				}
				arr.add(s.charAt(i));
				counter+=1;
				if(counter>max)
				{
					max=counter;
				}
			}
		}
		System.out.println(max);
	}
}
