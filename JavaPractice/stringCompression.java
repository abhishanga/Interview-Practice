package practice;
import java.util.Scanner;
public class stringCompression {
public String compress(String s){
	
	StringBuffer str=new StringBuffer();
	char last=s.charAt(0);
	int count=1;
	for(int i=1;i<s.length();i++){
		if(s.charAt(i)==last)
			count++;
		else{
			str.append(last);
			str.append(count);
			last=s.charAt(i);
			count=1;
		}
	}
	str.append(last);
	str.append(count);
	return (str.toString());
}
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	String s,result;
	System.out.println("Please enter a string");
	s=in.nextLine();
	stringCompression s1=new stringCompression();
	result=s1.compress(s);
	System.out.println(result);
}

}
