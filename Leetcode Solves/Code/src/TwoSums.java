public class TwoSums {
	public static void main(String [] args)
	{
		int[] nums=new int[]{3, 2, 4};
		int target=6;
		int a=0, b=0, aa=0, bb=0, done=0;
        for(int i=0;i<nums.length;i++)
        {
            a=nums[i];
            for(int j=0;j<nums.length;j++)
            {
                b=nums[j];    
                if(a+b==target && done==0 && i!=j)
                {
                    aa=i;
                    bb=j;
                    done=1;
                }
            }
        }
        int[] sol=new int[2];
        if(aa<bb)
        {
        	sol[0]=aa;
        	sol[1]=bb;
        }
        else {
        	sol[0]=bb;
        	sol[1]=aa;
        }
        System.out.println(sol[0]);
        System.out.println(sol[1]);
		}
}
