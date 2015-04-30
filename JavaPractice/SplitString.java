package practice;
import java.util.*;
public class SplitString {
	public String Split(String s){
		String regex=" ";
		s.trim();
		String str1,str2;
		String[] part=s.split(regex);
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<part.length;i++){
			
			char[] temp=part[i].toCharArray();
			int counter=0; 

			for(int j=0; j<temp.length; j++) 
			{ 
			if((temp[j]>='a' && temp[j]<='z') || (temp[j]>='A' && temp[j]<='Z')) 
			{ 
			counter++; 
			} 
			} 
			if(counter>=4 && counter%2==0) 
			{ 
			for(int j=0; j<temp.length; j++) 
			{ 
			sb.append(temp[j]); 
			if(j==(counter/2)-1) 
			sb.append(" "); 
			} 
			} 
			else 
			{ 
			sb.append(temp); 
			} 
			sb.append(" "); 
			} 
		
		return sb.toString();
	}
	public static void main(String[] args){
		SplitString s1=new SplitString();
		String result=s1.Split("A person can't walk in this street");
		System.out.print(result);
	}

}
