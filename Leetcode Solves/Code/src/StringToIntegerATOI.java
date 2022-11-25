import java.util.ArrayList;

import javax.print.DocFlavor.INPUT_STREAM;

public class StringToIntegerATOI {
	public static int myAtoi(String s) {
		String ansArr = "";
		if(s.length()==0)
		{
			return 0;
		}
		if (s.charAt(0) == '0' || s.charAt(0) == '1' || s.charAt(0) == '2' || s.charAt(0) == '3' || s.charAt(0) == '4' || s.charAt(0) == '5' || s.charAt(0) == '6' || s.charAt(0) == '7' || s.charAt(0) == '8' || s.charAt(0) == '9' || s.charAt(0) == '+' || s.charAt(0) == '-' || s.charAt(0) == ' ') {
			int counter = 0;
			int sign=1;
			while (ansArr.length() != 1) {
				if(s.charAt(counter) == '+'  || s.charAt(counter) == '-' )
				{
					char sec=s.charAt(counter)=='+'?'-':'+';
					if(s.length()==1)
					{
						return 0;
					}
					else if(s.charAt(counter+1)==sec)
					{
						return 0;
					}
					else {
						sign=s.charAt(counter)=='+'?1:-1;
					}
				}
				if (s.charAt(counter) == '1' || s.charAt(counter) == '2' || s.charAt(counter) == '3' || s.charAt(counter) == '4' || s.charAt(counter) == '5' || s.charAt(counter) == '6' || s.charAt(counter) == '7' || s.charAt(counter) == '8' || s.charAt(counter) == '9' && s.charAt(counter) != ' ') {
					ansArr += s.charAt(counter);
				}
				counter++;
				if (s.length() == counter) {
					break;
				}
			}
			if(counter<s.length())
			{
				while (s.charAt(counter) == '1' || s.charAt(counter) == '2' || s.charAt(counter) == '3' || s.charAt(counter) == '4' || s.charAt(counter) == '5' || s.charAt(counter) == '6' || s.charAt(counter) == '7' || s.charAt(counter) == '8' || s.charAt(counter) == '9' && s.charAt(counter) != ' ') {
					ansArr += s.charAt(counter);
					counter++;
					if (s.length() == counter) {
						break;
					}
				}
			}
			//For checking if our answer is more than or less than max or min value of the integer, And if it is than send the max or min value of integer instead of or answer(Do It, Not mentioned in question)
			if(Integer.MAX_VALUE/10 < Long.parseLong(ansArr) || Integer.MAX_VALUE/10 == Long.parseLong(ansArr) && Integer.MAX_VALUE %10 < Long.parseLong(ansArr))
			{
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			else {
				return Integer.parseInt(ansArr)*sign;
			}
		} 
		else
		{
			return 0;
		}
	}

	public static void main(String[] args) {
		String s = "-91283472332";
		int ans = myAtoi(s);
		System.out.println(ans);
	}
}
