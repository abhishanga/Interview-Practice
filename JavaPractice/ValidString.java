package practice;

import java.util.HashMap;


public class ValidString {

	public static void main(String[] args) {
		String str = "123^123qs";
		boolean cond3 = isseqValid(str);
		boolean cond2 = ischarValid(str);
		boolean cond1 = islenValid(str);
		System.out.println(cond3&&cond2&&cond1);
	}
	
	private static boolean islenValid(String string) {
		if(string.length()>=5 && string.length()<=12) return true;
		return false;
	}

	private static boolean ischarValid(String string) {
		char[] crs = string.toCharArray();
		boolean num_flag = false;
		boolean char_flag = false;
		for(int i =0;i<string.length();i++){
			if(crs[i] >= '0' && crs[i] <= '9'){
				num_flag = true;
			}
			else
				return false;
			if(crs[i] >= 'a' && crs[i] <= 'z'){
				char_flag = true;
			}
			else
				return false;
		}
		return num_flag && char_flag;
	}

	public static boolean isseqValid(String str){
		/**
		 * HashMap store the substring as a key and its ending index as a value.
		 * Before putting value into the hashmap, it checks if the substring already exists.
		 * If yes, retrieve the value and compare value + 1 with the starting index of the new substring.
		 * If they are equal, it means there are consecutive substrings.
		 */
		HashMap<String,Integer> stringindexMap = new HashMap<String,Integer>();
		int len = str.length();
		
		for(int i = 1; i< len ; i++){
			
			for(int j = 0; j+i <= len;j++){
				String sub = str.substring(j,j+i);
				if(stringindexMap.get(sub) == null){
					stringindexMap.put(sub, j + i -1);
				}
				else{
					int prevlastIndex = stringindexMap.get(sub);
					if(prevlastIndex == j - 1) return false;
				}
		}
	}
		return true;
	}
}
