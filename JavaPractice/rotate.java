package practice;

public class rotate {
	public void leftRotate(int[] a,int d,int n){
		int i=0;
		for(i=0;i<d;i++)
			leftRotatebyone(a,n);
		
	}
public void leftRotatebyone(int[] a,int n)
{
	int i, temp;
	  temp = a[0];
	  for (i = 0; i < n-1; i++)
	     a[i] = a[i+1];
	  a[i] = temp;
	}
public static void main(String[] args){
	int []a={1,2,3,4};
	rotate r1=new rotate();
	r1.leftRotate(a,1,4);
	for(int i=0;i<4;i++)
	System.out.print(a[i]);
}
}


