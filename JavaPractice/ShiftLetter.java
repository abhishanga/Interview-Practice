package practice;
import java.util.*;
public class ShiftLetter {
	public static String strConverter(String str)
	{
	    StringBuilder newStr = new StringBuilder();
	    int shift = 2; // shift value



	for(int i=0;i< str.length();i++)
	{
	char ch = str.charAt(i);
	// perform Caesar shift
	if((ch >= 'a') && (ch <= 'z'))
	ch = (char)('a'+(ch-'a'+shift)%26);
	else if((ch >= 'A') && (ch <= 'Z'))
	ch = (char)('A'+(ch-'A'+shift)%26);
	// build the string with the shifted char
	newStr.append(ch);
	}
	return newStr.toString();
	}
	public static void main(String[] args)
{
	ShiftLetter s1=new ShiftLetter();
	String result=s1.strConverter("abcD");
	System.out.print(result);
}
}
