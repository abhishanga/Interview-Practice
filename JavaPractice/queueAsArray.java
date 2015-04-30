package practice;

public class queueAsArray {
    int front,rear,size;
    int[] myqueue;
    queueAsArray(int size){
    	front=-1;
    	rear=-1;
    	this.size=size;
    	myqueue=new int[size];
    }
    public void insert(int d){
    	if(rear==size-1)
    		System.out.println("Queue is full");
    	if(front==-1){
    		front=0;
    	}
    	rear++;
    	myqueue[rear]=d;
    }
    public void delete(){
    	if(front==size || front==-1)
    		System.out.print("Queue is empty");
    	else
    	front++;
    }
    public void display()
    { for(int i=front;i<size;i++)
    	System.out.print(myqueue[i]);
}
    public static void main(String[] args){
    	queueAsArray q1=new queueAsArray(3);
    	q1.insert(1);
    	q1.insert(2);
    	q1.insert(3);
    	q1.delete();
    	q1.display();
    }
}
