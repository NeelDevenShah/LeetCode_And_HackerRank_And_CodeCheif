import java.util.Stack;

public class ValidParentheses {
	public static void main(String [] args)
	{
		String s="(){}}{";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s)
	{
		if(s.length()<2)
		{
			return false;
		}
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
            	stack.add(s.charAt(i));
            }
            else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
            	if(stack.isEmpty()==false)
            	{
            		char poped=stack.pop();
                	char tempCheck= poped=='('?')':(poped=='{'?'}':']');
                	if(s.charAt(i)!=tempCheck)
                	{
                		return false;
                	}
            	}
            	else {
            		return false;
            	}
            }
            else{
                return false;
            }
        }
		if(stack.isEmpty()==false)
		{
			return false;
		}
		return true;
	}
}
