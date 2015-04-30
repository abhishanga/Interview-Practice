import java.util.*;
public class Polynomial {
	public static int[] multiply(int[] a,int[] b)
	{
		int m=a.length;
		int n=b.length;
		int len=m+n-1;
		int[] product=new int[len];
		int i;
		for(i=0;i<len;i++)
		product[i]=0;
		for(i=0;i<m;i++){
			for(int j=0;j<n;j++)
				product[i+j]+=a[i]*b[j];
		}
		return product;
	}
	public static void main(String[] args){
		int[] a={5,3,1};
		int[] b={9,7,2};
		int[] result=new int[a.length+b.length-1];
		result=multiply(a,b);
		
	}

}
