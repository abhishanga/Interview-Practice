package practice;

public class CircularList {
	
	private LinkedListNode last;
	
	CircularList(){
		
		last=null;
	}
	public void insert(int a){
		insert(a,last);
		
	}
	private void insert(int elem,LinkedListNode n){
		LinkedListNode start=n;
		LinkedListNode temp=new LinkedListNode(elem);
		if(start==null){
			start=temp;
			temp.next=start;
		}
		else{
			temp.next=start.next;
			start.next=temp;
			start=temp;
		}
		last=start;
	}
		public void display(){
			display(last);
		}
		private void display(LinkedListNode last){
			if(last==null)
				System.out.println("List is empty");
			else{
				LinkedListNode q=last.next;
				while(q!=last){
					System.out.print(q.data+"->");
					q=q.next;
				}
				System.out.print(last.data);
			}
		}
				
		
		public static void main(String[] args){
		CircularList c1=new CircularList();
		c1.insert(1);
		c1.insert(2);
		c1.insert(3);
		c1.insert(4);
		c1.display();
	}

}
