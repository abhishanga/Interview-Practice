package practice;

public class MergeSort {
	private int[] array;
	private int[] temp;
	private int length;
	public static void main(String[] args){
		  int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
	        MergeSort mms = new MergeSort();
	        mms.sort(inputArr);
	        for(int i:inputArr){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	
	}
	public void sort(int[] a){
		this.array=a;
		this.length=a.length;
		temp=new int[length];
		doMergeSort(0,length-1);
	}
	private void doMergeSort(int lowerIndex,int higherIndex){
		if(lowerIndex<higherIndex){
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;
			doMergeSort(lowerIndex,middle);
			doMergeSort(middle+1,higherIndex);
			mergeParts(lowerIndex,middle,higherIndex);
		}
	}
	private void mergeParts(int lowerIndex,int middle,int higherIndex){
		for(int i=lowerIndex;i<=higherIndex;i++){
			temp[i]=array[i];
		}
		int i=lowerIndex;
		int j=middle+1;
		int k=lowerIndex;
		while(i<=middle && j<=higherIndex){
			if(temp[i]<=temp[j]){
				array[k]=temp[i];
				i++;
			}
			else{
				array[k]=temp[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			array[k]=temp[i];
			k++;
			i++;
		}
	}

}
