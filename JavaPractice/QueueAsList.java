package practice;

public class QueueAsList {
	Node front,rear;
	
	QueueAsList(){
		front=null;
		rear=null;
		
	}
	public void insert(int d){
		Node n=new Node(d);
		if(rear==null){
			front=n;
			rear=n;
		}
		else
		{
			rear.next=n;
			rear=n;
			
		}
	}
	public void delete(){
		front=front.next;
	}
	public void display(){
		Node q;
		q=front;
		while(q!=null){
			System.out.print(q.data+"->");
			q=q.next;
		}
	}
	public static void main(String[] args){
		QueueAsList q1=new QueueAsList();
		q1.insert(1);
		q1.insert(2);
		q1.insert(3);
		q1.delete();
		q1.display();
	}
  
}
