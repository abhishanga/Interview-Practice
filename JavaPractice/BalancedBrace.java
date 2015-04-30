package practice;
import java.util.*;
public class BalancedBrace {
	public boolean check(String s){
		char l_paren='(';
		char r_paren=')';
		char l_brace='{';
		char r_brace='}';
		char l_bracket='[';
		char r_bracket=']';
		Stack<Character> set=new Stack<Character>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==l_paren)
			set.push(l_paren);
			else if(s.charAt(i)==l_brace)
				set.push(l_brace);
			else if(s.charAt(i)==l_bracket)
				set.push(l_bracket);
			else if(s.charAt(i)==r_paren)
			{
				if(set.isEmpty())
					return false;
				if(set.pop()!=l_paren)
					return false;
					
			}
			else if(s.charAt(i)==r_brace)
			{
				if(set.isEmpty())
					return false;
				if(set.pop()!=l_brace)
					return false;
					
			}
			else if(s.charAt(i)==r_bracket)
			{
				if(set.isEmpty())
					return false;
				if(set.pop()!=l_bracket)
					return false;
					
			}
		}
		return set.isEmpty();
	}
	public static void main(String[] args){
		BalancedBrace b1=new BalancedBrace();
		boolean result;
		result=b1.check("{([a]p)9}");
		System.out.println(result);
	}

}
