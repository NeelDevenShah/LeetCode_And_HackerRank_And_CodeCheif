import java.util.LinkedList;
public class AddTwoNumbers {
	public static void main(String [] args)
	{
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(2);
		l1.add(4);
		l1.add(3);
		
		LinkedList<Integer> l2=new LinkedList<>();
		l2.add(5);
		l2.add(6);
		l2.add(4);
		
		String a="", b="";
		for(int i=1;i<l1.size()+1;i++)
		{
			a+=l1.get(l1.size()-i);
			b+=l2.get(l2.size()-i);
		}
		String temp=""+(Integer.parseInt(a)+Integer.parseInt(b));
		
		LinkedList<Character> ans=new LinkedList<>();
		for(int i=0;i<temp.length();i++)
		{
			ans.addFirst(temp.charAt(i));
		}
		System.out.println(ans);
		
	}
}
