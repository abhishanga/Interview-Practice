package practice;

public class stackasarray {
	int maxSize;
	int[] stackArray;
	int top;
	stackasarray(int s){
		maxSize=s;
		top=-1;
		stackArray=new int[maxSize];
	}
public void push(int d){
	top++;
	stackArray[top]=d;
}
public void pop(){
	top--;
}
public static void main(String[] args){
	stackasarray s1=new stackasarray(5);
	s1.push(1);
	s1.push(2);
    s1.push(3);
    s1.push(5);
    s1.push(4);
    s1.pop();
    for(int i=s1.top;i>=0;i--)
    	System.out.print(s1.stackArray[i]);
	
}
}
