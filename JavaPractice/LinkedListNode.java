package practice;

import java.util.*;


public class LinkedListNode {
    int data;
    LinkedListNode next;
    
    public LinkedListNode(int x) {
        data = x;
        next = null;
    }
  
    public static LinkedListNode buildList(int[] a) {
        LinkedListNode n = new LinkedListNode(a[0]);
        LinkedListNode head = n;
        for (int i = 1; i < a.length; ++i) {
            n.next = new LinkedListNode(a[i]);
            n = n.next;
        }
        return head;
    }
    public static LinkedListNode FindBeginning(LinkedListNode head){
    	LinkedListNode slow=head;
    	LinkedListNode fast=head;
    	while(fast!=null && fast.next!=null){
    		slow=slow.next;
    		fast=fast.next.next;
    		if(slow==fast)
    			break;
    	}
    	if(fast==null && fast.next==null)
    		return null;
    	slow=head;
    	while(slow!=fast){
    		slow=slow.next;
    		fast=fast.next;
    	}
    	return fast;
    }
    public static boolean checkPalindrome(LinkedListNode head){
    	Stack<Integer> set=new Stack<Integer>();
    	LinkedListNode fast=head;
    	LinkedListNode slow=head;
    	while(fast!=null  && fast.next!=null){
    		set.push(slow.data);
    		slow=slow.next;
    		fast=fast.next.next;
    	}
    	if(fast!=null)
    		slow=slow.next;
    	while(slow!=null){
    		int top=set.pop().intValue();
    		if(top!=slow.data){
    			return false;
    			
    		}
    		slow=slow.next;
    	}
    	return true;
    }
    	
    
    public static void printList(LinkedListNode n) {
        if (n == null) System.out.print("NULL");
        while (n != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println();
    }
    public static void deleteDups(LinkedListNode head){
    	LinkedListNode n,prev;
    	prev=head;
    	n=head;
    	HashSet<Integer> set=new HashSet<Integer>();
    	while(n!=null){
    		if(set.contains(n.data))
    			prev.next=n.next;
    		else{
    			set.add(n.data);
    			prev=n;
    	}
    		n=n.next;
    }
    }
    public static int ktolast(LinkedListNode head,int k){
    LinkedListNode p1;
    LinkedListNode p2;
    p1=head;
    p2=head;
    int i=1;
    while(p1!=null){
    	if(p1==null)
    		return 0;
    	
    	if(i==k)
    		break;
    	p1=p1.next;
    	i++;
    }
    if(p1==null)
    	return 0;
    while(p1.next!=null){
    	p2=p2.next;
    	p1=p1.next;
    	
    }
    return p2.data;
    }
    public static LinkedListNode reverseList(LinkedListNode n){
    	if(n==null || n.next==null)
    		return n;
    	LinkedListNode next;
    	LinkedListNode head=n;
    	LinkedListNode current=head;
    	LinkedListNode prev=null;
    	while(current!=null){
    		next=current.next;
    		current.next=prev;
    		prev=current;
    		current=next;
    	}
    	head=prev;
    	return head;
    }
    public static LinkedListNode partition(LinkedListNode node,int x){
    	LinkedListNode head=node;
    	LinkedListNode tail=node;
    	while(node!=null){
    		
    		if(node.data<x){
    			node.next=head;
    			head=node;
    		}
    		else{
    			tail.next=node;
    			tail=node;
    		}
    		node=node.next;
    	}
    	tail.next=null;
    	return head;
    }
    public static int countNode(LinkedListNode node){
    	int count=0;
    	LinkedListNode n;
    	n=node;
    	while(n!=null){
    		count++;
    		n=n.next;
    	}
    	return count;
    }
    public static void swapKth(LinkedListNode node,int k)
    {
    	int n=countNode(node);
    	if(n<k)
    		return;
    	if(2*k-1==n)
    		return;
    	LinkedListNode x=node;
    	LinkedListNode x_prev=null;
    	for(int i=1;i<k;i++)
    	{
    		x_prev=x;
    		x=x.next;
    	}
    	LinkedListNode y=node;
    	LinkedListNode y_prev=null;
    	for(int i=1;i<n-k+1;i++)
    	{
    		y_prev=y;
    		y=y.next;
    	}
    	if(x_prev!=null)
    		x_prev.next=y;
    	if(y_prev!=null)
    		y_prev.next=x;
    	
       
       if(k==1)
    	   node=y;
       if(k==n)
    	   node=x;
    	
    }
    public static void main(String[] args) {
        LinkedListNode list = buildList(new int[] {1,1,3,2,5});
       printList(list);
       deleteDups(list);
       printList(list);
       boolean a;
       a=checkPalindrome(list);
       System.out.println(a);
       int r;
      r=ktolast(list,3); 
      System.out.println(r);
      LinkedListNode n;
      n=reverseList(list);
      printList(n);
      n=partition(n,3);
      printList(n);
      swapKth(n,2);
      printList(n);
      
    }

}
