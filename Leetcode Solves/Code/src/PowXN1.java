public class PowXN1 {
	//There Are Two Solutions To This Problem
		//1. Brut Force (Not Passing 3 Test Cases)
		//2. Binary Exponention Approach(This One) (Another File With This Name, having 1 on end)
	public static void main(String [] args)
	{
		System.out.println(myPow(2.00, 10));
	}
	//Explanation:
		//2^10 = (2X2)^4 = (4)^4 =1024
		//4^5 = 4 X 4^4 = (16)^2 = 256
		//16^2 = (16 X 16) = 256
	
	public static double myPow(double x, int n)
	{
		double ans=1.0;
		double nn=n;
		if(nn<0)
		{
			nn=-1*nn;
		}
		while(nn>0)
		{
			if(nn%2==0)
			{
				x=x*x;
				nn=nn/2;
			}
			else {
				ans=ans*x;
				nn=nn-1;
			}
		}
		if(n<0)
		{
			ans=(double)1.0/(double)ans;
		}
		return ans;
	}
}
