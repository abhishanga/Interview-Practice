package practice;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxOddMinEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);System.out.print("type in numbers and ends with 0");
	    ArrayList<Integer> arr=new ArrayList<Integer> ();  
		while(sc.hasNext()){ 
			int in=sc.nextInt();
			if(in==0) break;
			arr.add(in);		
		}
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.size();i++){
		
		if (arr.get(i)%2!=0){
			if (arr.get(i)>max){
				max=arr.get(i);
			}
			
		}else{
			if (arr.get(i)<min){
				min=arr.get(i);
			}
		}
		
	}
    System.out.println("the numbers are: "+arr.toString());
	System.out.println(max);
	System.out.println(min);
		

	}

}