package practice;
import java.util.*;
public class MinStack {
	int min=Integer.MAX_VALUE;
	Stack<Integer> set=new Stack<Integer>();
	public void push(int x){
		if(x<=min)
		{  set.push(min);
			min=x;
		}
		set.push(x);
	}
	public void pop(){
		if(set.peek()==min){
			set.pop();
			min=set.peek();
			set.pop();
		}
		else
			set.pop();
		if(set.isEmpty())
			min=Integer.MAX_VALUE;
	}
	public int top(){
		return set.peek();
	}
	public int getMin(){
		return min;
	}
	public static void main(String[] args){
		MinStack m1=new MinStack();
		m1.push(5);
		m1.push(2);
		m1.push(-5);
		m1.push(3);
		m1.push(1);
		
		m1.pop();
		int top=m1.top();
		System.out.println(top);
		int min=m1.getMin();
		System.out.print(min);
		
		
	}

}
