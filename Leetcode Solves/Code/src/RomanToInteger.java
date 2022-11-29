import java.util.*;

public class RomanToInteger {
	
	public static int romanToInt(String s)
	{	
		Map<Character, Integer> map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int total=0;
		for(int i=0;i<s.length();i++)
		{
			if(i==s.length()-1)
			{
				total+=map.get(s.charAt(i));
			}
			else {
				int a=map.get(s.charAt(i));
				int b=map.get(s.charAt(i+1));
				if(a>=b)
				{
					total+=a;
				}
				else {
					total-=a;
				}
			}
		}
		
		return total;
	}
	
	public static void main(String [] args)
	{
		int total=romanToInt("III");
		System.out.println(total);
	}
}
