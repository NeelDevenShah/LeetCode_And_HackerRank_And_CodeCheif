public class PowXN {
	//There Are Two Solutions To This Problem
	//1. Brut Force (This One) (Not Passing 3 Test Cases)
	//2. Binary Exponention Approach (Another File With This Name, having 1 on end)
	public static void main(String [] args)
	{
		System.out.println(myPow(-1.00001, 447125));
	}
	
	public static double myPow(double x, int n)
	{
		if(x==0)
		{
			return 0;
		}
		else if(x==1)
		{
			return 1;
		}
		if(x==-1)
		{
			if(n%2==0)
			{
				return 1;
			}
			else {
				return -1;
			}
		}
		
		if(n<=-2147483648)
		{
			return 0;
		}
		
		double temp=1;
		if(n>0)
		{
			temp=myPow2(1, x, n);
		}
		else if(n<0) {
			temp=myPow2(1, x, n);
		}
		else {
			return 1.0000;
		}
		return temp;
	}
	
	public static double myPow2(double tillVal, double x, int n)
	{
		if(n==0)
		{
			return tillVal;
		}
		else if(n>0)
		{
//			if(x<0.1 && n>20000)
//			{
//				return 0;
//			}
			return myPow2(tillVal*x, x, n-1);
		}
		else
		{
			if(x<0.1 && n>20000)
			{
				return 0;
			}
			return myPow2(tillVal/x, x, n+1);
		}
	}
	
}
