package practice;

public class unique {
public boolean uniqueCharacters(String s){
	int i,l,flag=0;
	l=s.length();
	int temp;
	if(s.length()>128)
		System.out.println("Not a unique string");
	boolean[] char_set=new boolean[256];
	for(i=0;i<l;i++){
		temp=s.charAt(i);
		if(char_set[temp])
			return false;
		char_set[temp]=true;
	}
	return true;
}
public static void main(String[] args){
	unique u1=new unique();
	boolean a;
	a=u1.uniqueCharacters("Abhishanga is a good person.");
	System.out.println(a);
	
}
}
