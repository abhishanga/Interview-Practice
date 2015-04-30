package practice;

public class DoubleLinkedList {
	private Node prev;
	private Node next;
	private int size;
	private Node head;
	DoubleLinkedList(){
		size=0;
		head=null;
		
	}
	
	class Node{
		Node prev;
		Node next;
		int data;
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	public int size(){
		return size;
	}
	
	public void insert(int[] d){
		Node n=new Node(d[0]);
		head=n;
		n.prev=null;
		for(int i=1;i<d.length;i++){
			Node tail=new Node(d[i]);
			n.next=tail;
			tail.prev=n;
			tail.next=null;
			n=n.next;
		}
		
			
	}
	public void display(){
		display(head);
	}
	private void display(Node head){
		if (head == null) System.out.print("NULL");
		Node n=head;
        while (n != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println();
	}
	public void ins_beg(int a){
		ins_beg(a,head);
	}
	private void ins_beg(int a,Node n){
		Node newnode=new Node(a);
		Node start=n;
		while(start.next!=null)
			start=start.next;
		start.next=newnode;
		newnode.prev=start;
		
		
		
			
	}
	public static void main(String[] args){
		DoubleLinkedList d=new DoubleLinkedList();
		int[] a={1,2,3,4,5};
		d.insert(a);
		d.display();
		d.ins_beg(6);
		d.display();
	}
	

}
