import java.util.*;
public class CircularQueue {
	public class Node{
		double value;
		Node next;
		public Node(double x){
			value=x;
			next=null;
		}
		public String toString(){
			return "" + value;
		}
	}
	public double[] buf;
	public int read,write;
	public CircularQueue(int size){
		buf=new double[size];
		read=0;
		write=0;
	}
	public void enqueue(double x){
		if(read==(write+1)%buf.length)
			System.out.println("Queue is full");
		buf[write]=x;
		write=(write+1)%buf.length;
	}
	public double dequeue(){
		double r;
		if(read==write)
			System.out.println("Queue is empty");
		r=buf[read];
		read=(read+1)%buf.length;
		return r;
	}
	 public static void main( String[] args )  throws Exception
	   {
	      CircularQueue  myQ = new CircularQueue(3);
	      double x;

	      myQ.enqueue(1.0);
	      System.out.println("enqueue(1.0): " + "myQ = " + myQ);
	      myQ.enqueue(2.0);
	      System.out.println("enqueue(2.0): " + "myQ = " + myQ);
	      myQ.enqueue(3.0);        // <--- will cause exception
	      System.out.println("enqueue(3.0): " + "myQ = " + myQ);
	   }
}
