import java.util.ArrayList;

public class DefangingIp {
	public static void main(String [] args)
	{
		String address="1.1.1.1";
		String ans="";
		for(int i=0;i<address.length();i++)
        {
			if(address.charAt(i)=='.')
            {
            	ans+="[.]";
            }
			else {
				ans+=address.charAt(i);
			}
        }
		System.out.println(ans);
	}
}
