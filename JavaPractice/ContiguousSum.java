package practice;

public class ContiguousSum {
 public int sum(int[] a){
	 int max=a[0],i=0,result=a[0],temp=0;
	 for(i=1;i<a.length;i++){
		 temp=max;
		 max=max+a[i];
		 if(max<=0)
			 max=temp;
		
		 if(result<max)
			 result=max;
	 }
	return result; 
 }
 public static void main(String[] args){
	 int[] a={-2,-3,4,-1,-2,1,5,-3};
	 int result;
	 ContiguousSum s1=new ContiguousSum();
	 result=s1.sum(a);
	 System.out.print(result);
	 
 }
}
