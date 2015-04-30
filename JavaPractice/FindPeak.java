import java.util.*;
public class FindPeak {
public int FindIndex(int[] a,int low,int high){
	int mid=(low+high)/2;
	if(high<low)
		return 0;
	if(high==low)
		return low;
	if(mid<high && a[mid+1]>a[mid])
		return mid+1;
	if(mid>low && a[mid-1]<a[mid])
		return mid;
	if(a[high]<a[mid])
		return FindIndex(a,mid+1,high);
	return FindIndex(a,low,mid-1);
}
public static void main(String[] args){
	FindPeak f1=new FindPeak();
	int[] a={1, 2, 3, 1};
	int result=f1.FindIndex(a,0,3);
	System.out.print(result);
}
}
