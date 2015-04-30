package practice;

public class FindMinimum {
  public static int find(int[] a){
	int l=a.length;
	int i=0;
	for(i=0;i<l-1;i++){
		if(a[i]-a[i+1]>=0)
			return a[i+1];
	}
	return -1;
  }
  public static void main(String[] args){
	  int[] num={4,5,6,7,0,1,2};
	  int result=find(num);
	  System.out.println(result);
  }
  }
