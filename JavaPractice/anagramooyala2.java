package practice;
import java.util.*;
public class anagramooyala2 {
	public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(strs.length < 2) return new ArrayList();
        
        HashMap<String, ArrayList<String>> map = new HashMap();
        
        for(String str : strs) {
            String key = sortChars(str);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            ArrayList<String> anagrams = map.get(key);
            anagrams.add(str);
        }
        
        ArrayList<String> result = new ArrayList();
        for(String key : map.keySet()) {
            ArrayList<String> anagrams = map.get(key);
            if(anagrams.size() > 1) {
                result.addAll(anagrams);            
            }
        }
        
        return result;
    }
    
    public String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
	public static void main(String[] args){
		String[] s={"tar","rat","banana","atr"} ;
		anagramooyala2 o1=new anagramooyala2();
		ArrayList<String> result=new ArrayList<String>();
		result=o1.anagrams(s);
		for (int i = 0; i < result.size(); i++) {
		    System.out.println(result.get(i));
	}

}
}
