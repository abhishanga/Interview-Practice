package practice;

public class subarray {
    public static int maxarray(int[] array){
    	int max1=0,l=0,result,temp;
    	l=array.length;
    	max1=array[0];
    	result=array[0];
    	for(int i=1;i<l;i++){
    		temp=max1;
    		max1=Math.max(array[i]+max1, array[i]);
    		if(max1>result)
    			result=max1;
    	}
    	return result;
    }
    public static void main(String[] args){
    	int[] a={1,2,-3,-4,-5};
    	int result;
    	subarray s1=new subarray();
    	result=s1.maxarray(a);
    	System.out.println(result);
    }
}
