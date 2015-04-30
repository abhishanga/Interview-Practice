package practice;

public class QuickSort {
 private int[] array;
 private int length;
 public void sort(int[] arr){
	 if(arr==null || arr.length==0)
		 return;
	 this.array=arr;
	 length=arr.length;
	 quickSort(0,length-1);
 }
 private void quickSort(int lowerIndex,int higherIndex)
 {
	 int i=lowerIndex;
	 int j=higherIndex;
	 int pivot=array[(higherIndex+lowerIndex)/2];
	 while(i<=j){
		 while(array[i]<pivot)
			 i++;
		 while(array[j]>pivot)
			 j--;
		 if(i<=j)
		 {
			 swap(i,j);
			 i++;
			 j--;
		 }
	 }
	 if(lowerIndex<j)
		 quickSort(lowerIndex,j);
	 if(i<higherIndex)
		 quickSort(i,higherIndex);
 }
 private void swap(int i,int j){
	 int temp=array[i];
	 array[i]=array[j];
	 array[j]=temp;
 }
 public static void main(String[] args){
	 QuickSort sorter = new QuickSort();
     int[] input = {24,2,45,20,56,75,2,56,99,53,12};
     sorter.sort(input);
     for(int i:input){
         System.out.print(i);
         System.out.print(" ");
     }

 }
}
