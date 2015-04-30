package practice;

public class RemoveDuplicates {
public static int remove(int[] a){
	int i=0;
	int l=a.length;
	int count=0;
	int duplicate=a[0];
	for(i=1;i<l;i++){
		if(a[i]==duplicate)
			count++;
		a[i-count]=a[i];
		duplicate=a[i];
	}
	return (l-count);
}
public static void main(String[] args){
	int[] a={1,1,1,2,3,4};
	int result=remove(a);
	System.out.print(result);
	
}
}
