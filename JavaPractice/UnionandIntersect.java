
import java.util.*;
public class UnionandIntersect {
	public ArrayList<Integer> intersect(int[] arr1,int[] arr2)
	{
		int i=0,j=0;
		int len1=arr1.length;
		int len2=arr2.length;
		ArrayList<Integer> result=new ArrayList<Integer>();
		while(i<len1 && j<len2)
		{
			if(arr1[i]<arr2[j])
				i++;
			else if(arr2[j]<arr2[i])
				j++;
			else
			{ result.add(arr1[i]);
			i++;
			j++;
			}
		}
		return result;
	}
	public ArrayList<Integer> union(int[] arr1,int[] arr2)
	{
		int i=0,j=0;
		int len1=arr1.length;
		int len2=arr2.length;
		ArrayList<Integer> result=new ArrayList<Integer>();
		while(i<len1 && j<len2)
		{
			if(arr1[i]<arr2[j])
				{ result.add(arr1[i]);
				i++;
				}
			else if(arr2[j]<arr2[i])
			{
				result.add(arr1[j]);
				j++;
			}
			else
			{ result.add(arr1[i]);
			i++;
			j++;
			}
		
		}
		while(i<len1)
			result.add(arr1[i++]);
		while(j<len2)
			result.add(arr1[j++]);
		return result;
	}
	public static void main(String[] args)
	{
		UnionandIntersect u1=new UnionandIntersect();
		int[] a={1,2,3,4,5,5,6};
		int[] b={1,2,3,4,5,5};
		ArrayList<Integer> result=new ArrayList<Integer>();
		result=u1.intersect(a,b);
		for(int i=0;i<result.size();i++)
			System.out.println(result.get(i));
		result=u1.union(a,b);
		System.out.println("Union");
		for(int i=0;i<result.size();i++)
			System.out.println(result.get(i));
		}
	}


