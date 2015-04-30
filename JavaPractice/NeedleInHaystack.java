package practice;

public class NeedleInHaystack {
	public int strStr(String haystack, String needle) {
        if(haystack.length()==0&&needle.length()==0){
            return 0;
        }else if(needle.length()>haystack.length()){
            return -1;
        }else if(needle.length()==0){
            return 0;
        }
        int i = 0;
        while(i<haystack.length()){
            //find possible substring
            if(haystack.charAt(i)==needle.charAt(0)){
                if(i+needle.length()>haystack.length()){
                    return -1;
                }
                else if(haystack.substring(i, i+needle.length()).equals(needle))
                {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }
public static void main(String[] args){
	NeedleInHaystack h1=new NeedleInHaystack();
	int result=h1.strStr(" ","abhi");
	System.out.println(result);
	
}
}
