package practice;

public class WellOrdered {
	public static void main(String[] args){
	printWellOrdered(0,0,4); // 4 digit numbers 

	}
	private static void printWellOrdered(int number, int prev, int n) { 

	if(n==0){ 
	System.out.println(number); 
	return; 
	} 

	for(int i=(prev+1); i<(11-n); i++){ 
	printWellOrdered(number*10 + i, i, n-1) ; 
	} 

	}
}
