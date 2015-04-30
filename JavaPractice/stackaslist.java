package practice;

public class stackaslist {
	Node top;
	stackaslist(){
		top=null;
	}
	public void push(int d){
		Node n1=new Node(d);
		if(top==null)
			top=n1;
		else {
		n1.next=top;
		top=n1;
	}
	}
	public void pop()
	{ if(top==null)
		System.out.println("Stack is empty");
	else{
	 top=top.next;
	 
	}
	}
	
	public void print(){
	print(top);
	}
	private void print(Node n){
		if(n==null)
			System.out.println("Stack is empty");
		else {
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
	}
	} }
	public static void main(String[] args){
		stackaslist s1=new stackaslist();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.pop();
		s1.print();
		
	}
	

}
class Node{
	int data;
	Node next;
	
	Node(int d){
		data=d;
	   next=null;
	   
	}
	
}