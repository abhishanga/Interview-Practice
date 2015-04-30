package practice;

public class LongestPalindrome {
	public int longestpal(String s){
		int maxLength=1;
		int l=s.length();
		int start=0;
		int low,high;
		for(int i=1;i<l;i++){
			low=i-1;
			high=i;
			while(low>=0 && high<l && s.charAt(low)==s.charAt(high))
			{
				if(high-low+1>maxLength)
				{
					start=low;
					maxLength=high-low+1;
				}
				--low;
				++high;
			}
			low=i-1;
			high=i+1;
			
		}
		System.out.println("Longest palindrome substring is: ");
	    printSubStr(s, start, start + maxLength - 1);
	 
	    return maxLength;
	}
	public void printSubStr(String s, int low, int high)
	{
	    for( int i = low; i <= high; ++i )
	        System.out.print(s.charAt(i));
	    System.out.println();
	}
	public static void main(String[] args){
		LongestPalindrome l1=new LongestPalindrome();
		int r;
		r=l1.longestpal("forgeeksskeegfor");
		System.out.println(r);
	}
}
