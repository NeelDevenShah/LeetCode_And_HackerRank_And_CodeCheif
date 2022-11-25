public class CountAndSay {
	//Here We Have To Make The Expansion From 1 To nth Term
	//By Going Like 1 -> 11 -> 21 -> 1211 --> go on up to nth term...
	//Here First Is The Time It Is There, And On The Second One There Is The Number Which We Are Counting And We Have To Make String Of It
	public static void main(String [] args)
	{
		System.out.println(sol(10));
	}
	
	public static String sol(int num)
	{
		if(num==1) return "1";
		if(num==2) return "11";
		String solution="11";
		for(int i=3;i<=num;i++)
		{
			String temp="";
			int counter=1;
			for(int j=1;j<solution.length();j++)
			{
				if(solution.charAt(j)!=solution.charAt(j-1))
				{
					temp+=counter;
					temp+=solution.charAt(j-1);
					counter=1;
					if(j==solution.length()-1)
					{
						temp+=1;
						temp+=solution.charAt(j);
						counter=1;
					}
				}
				else {
					counter++;
					if(j==solution.length()-1)
					{
						temp+=counter;
						temp+=solution.charAt(j);
						counter=1;
					}
				}
			}
			solution=temp;
		}
		return solution;
	}
}
