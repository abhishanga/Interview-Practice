package practice;

public class RemoveElement {
  public static int remove(int[] a,int value){
	  int i=0,count=0;
	  int l=a.length;
	  for(i=0;i<a.length;i++)
	  {
		  if(a[i]==value)
		  {
			 ++count; 
		  }
		  else if(count>0)
			  {a[i-count]=a[i];
			
	  }
	  }
	  
	 return l-count;
  }
  public static void main(String[] args){
	  int[] a={1,2,3,1,1,4,1,7};
	  int r=remove(a,1);
	  System.out.print(r);
	  }
  }

