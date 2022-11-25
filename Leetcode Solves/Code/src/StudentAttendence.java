public class StudentAttendence {
	public static void main(String [] args)
	{
		int a=0, p=0, lcount=0;
		String s="PPALLL";
        boolean wrong=false;
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)=='L' && lcount>=2)
            {
                wrong=true;
                break;
            }
            else if(s.charAt(i)=='P')
            {
                p++; 
                lcount=0;
            }
            else if(s.charAt(i)=='A')
            {
                a++;
                lcount=0;
            }
            else
            {
                lcount++;
            }
        }
        
        if(a<2 && wrong==false)
        {
            System.out.println(true);
        }
        else {
        	System.out.println(false);
        }
	}
}
