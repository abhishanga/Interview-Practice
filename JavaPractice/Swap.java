package practice;
import java.util.*;
public class Swap {
public static void main(String[] args) { 
		String s = "GUM";
		String d = "MUG";
		ArrayList<String> result = swap(s,d);
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i));
		}
	} 
	
	private static ArrayList<String> swap(String s,String d) { 
		ArrayList<String> result = new ArrayList<String>();
		result.add(s);
		char[] st = s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(st[i]!=d.charAt(i)){
				for(int j=i+1;j<s.length();j++){
					if(st[j] == d.charAt(i)){
						for(int k = j;k>i;k--){
							char temp = st[k];
							st[k] = st[k-1];
							st[k-1] = temp;
							result.add(String.valueOf(st));
						}
					}
				}
			}
		}
		return result;
	}
}
