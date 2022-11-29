public class PalindromeNumber {
	public static void main(String [] args)
	{
		int x=565;
		if(x<0)
        {
			System.out.println(false);
        }
        else
        {
            String check=""+x;
            boolean ans=true;
            if(check.length()%2==0)
            {
                //Even
                for(int i=0;i<(check.length()/2);i++)
                {
                	if(check.charAt(i)!=check.charAt((check.length()-1-i)))
                     {
                         	//Send False
                    		ans=false;
                     }
                }
            }
            else
            {
                //Odd
                for(int i=0;i<(check.length()/2);i++)
                {
                	if(check.charAt(i)!=check.charAt((check.length()-1-i)))
                     {
                         //Send False
                         ans=false;
                     }
                }
            }
            System.out.println(ans);
        }
	}
}
