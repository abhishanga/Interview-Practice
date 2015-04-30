import java.util.*;
public class NonRepeated {
	public Character FindRepeat(String s){
		HashMap<Character,Integer> set=new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(set.containsKey(c))
				set.put(c,set.get(c)+1);
			else
				set.put(c, 1);
				
		}
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(set.get(c)==1)
				return c;
		}
		return null;
		
	}
	public static void main(String[] args){
		String s="abhishanga";
		NonRepeated n1=new NonRepeated();
		char result=n1.FindRepeat(s);
		System.out.println(result);
	}

}
