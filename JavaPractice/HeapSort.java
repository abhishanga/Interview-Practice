import java.util.*;
public class HeapSort {
 public static int N;
 public static void sort(int[] a){
	 heapify(a);
	 for(int i=N;i>0;i--)
	 {
		 swap(a,0,i);
		 N=N-1;
		 maxheap(a,0);
	 }
 }
 public static void heapify(int[] a){
	 N=a.length-1;
	 for(int i=N/2;i>=0;i--)
		 maxheap(a,i);
 }
 public static void maxheap(int[] a,int i){
	 int left=2*i;
	 int right=2*i+1;
	 int max=i;
	 if(left<=N && a[left]>a[max])
		 max=left;
	 if(right<=N && a[right]>a[max])
		 max=right;
	 if(max!=i){
		 swap(a,i,max);
		 maxheap(a,max);
	 }
 }
	 public static void swap(int[] a,int i,int j)
	 {
		 int temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
	 }
	 public static void main(String[] args){
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Heap Sort");
		 System.out.println("*Please enter number of elements");
		 int n=scan.nextInt();
		 int[] a=new int[n];
		 System.out.println("Please enter elements");
		 for(int i=0;i<n;i++)
			 a[i]=scan.nextInt();
		 System.out.println("Sorted Array");
		 sort(a);
		 for(int i=0;i<n;i++)
			System.out.println(a[i]);
	 }
 
}
