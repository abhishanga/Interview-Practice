package practice;
import java.util.*;
public class BinaryTree {
	nNode root;
	BinaryTree(){
		root=null;
	}
	public void insertNode(int d){
		root=insertNode(root,d);
	}
	  public nNode ArrayToBST(int[] a,int start,int end){
	    	if(start>end)
	    		return null;
	    	int middle=(start+end)/2;
	    	nNode root=new nNode(a[middle]);
	    	root.left=ArrayToBST(a,start,middle);
	    	root.right=ArrayToBST(a,middle+1,end);
	    	return root;
	    	
	    }
	  public void mirror() { 
		  mirror(root); 
		}

		private void mirror(nNode node) { 
		  if (node != null) { 
		    // do the sub-trees 
		    mirror(node.left); 
		    mirror(node.right);

		    // swap the left/right pointers 
		    nNode temp = node.left; 
		    node.left = node.right; 
		    node.right = temp; 
		  } 
		} 
	public nNode insertNode(nNode n,int d){
		if(n==null)
			n=new nNode(d);
		else{
			if(d<=n.data)
				n.left=insertNode(n.left,d);
			else{
				n.right=insertNode(n.right,d);
			}
		}
		return n;	
	}
	public int size(){
		int result;
		result=size(root);
		return result;
	}
	private int size(nNode n){
		if(n==null)
			return 0;
		else{
			return size(n.left)+size(n.right)+1;
		}
		
	}
	public int maxDepth(){
		int d;
		d=maxDepth(root);
		return d;
	}
	private int maxDepth(nNode n){
		if(n==null)
			return 0;
		else
			return (Math.max(maxDepth(n.right), (maxDepth(n.left))))+1;
	}
	public int minValue(){
		int d;
		d=minValue(root);
		return d;
	}
	private int minValue(nNode n){
		while(n.left!=null)
		{
			n=n.left;
		}
		return n.data;
	}
	public void printTree(){
		printTree(root);
		System.out.println();
	}
	private void printTree(nNode n){
		if(n==null)
			return;
		printTree(n.left);
		System.out.print(n.data);
		printTree(n.right);
	}
	public boolean isBST1(){
		return isBST1(root);
	}
	private boolean isBST1(nNode n){
		if(n==null)
			return true;
		if(n.left!=null && maxValue(n.left)>n.data)
			return false;
			if(n.right!=null && minValue(n.right)<=n.data)
            return false;
		return (isBST1(n.left) && isBST1(n.right));
	}
	public int maxValue(){
		return maxValue(root);
	}
	private int maxValue(nNode n){
		nNode current;
		current=n;
		while(current.right!=null){
			current=current.right;
		}
		return current.data;
	}
	private void printGivenLevel(nNode n,int level){
		if(n==null)
			return;
		if(level==1)
			System.out.println(n.data);
		else{
			printGivenLevel(n.left,level-1);
			printGivenLevel(n.right,level-1);
		}
	}
	public void printGivenLevel(int level){
		printGivenLevel(root,level);
	}
	public ArrayList<Integer> inorder(){
		return inorder(root);
	}
	private ArrayList<Integer> inorder(nNode n){
		nNode current=n;
		Stack<nNode> set=new Stack<nNode>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(current==null)
			return list;
		while(!set.empty() || current!=null)
		{
			if(current!=null){
				set.push(current);
				current=current.left;
			}
			else {
				nNode p;
				p=set.pop();
				list.add(p.data);
				current=p.right;
			}
		}
		return list;
		
	}
	public int sumNumbers(){
		return sumNumbers(root,0);
	}
	private int sumNumbers(nNode n, int s){
	    if (n == null) return 0;
	    if (n.right == null && n.left == null) return s*10 + n.data;
	    return sumNumbers(n.left, s*10 + n.data) + sumNumbers(n.right, s*10 + n.data);
	}
	
	public int diameter(){
		return diameter(root);
	}
	private int diameter(nNode n){
		if(n==null)
			return 0;
		int lheight=maxDepth(n.left);
		int rheight=maxDepth(n.right);
		int ldiameter=diameter(n.left);
		int rdiameter=diameter(n.right);
		return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
	}
	
	public static void main(String[] args){
		BinaryTree b1=new BinaryTree();
		b1.insertNode(2);
		b1.insertNode(1);
		b1.insertNode(3);
		int result;
		result=b1.size();
		System.out.println(result);
		result=b1.maxDepth();
		System.out.println(result);
		result=b1.minValue();
		System.out.println(result);
		b1.printTree();
		boolean a;
		a=b1.isBST1();
		System.out.println(a);
		b1.printGivenLevel(2);
		ArrayList<Integer> result2;
		result2=b1.inorder();
		for(int i:result2)
			System.out.print(i);
		nNode ans;
		int[] b={1,2,3,4};
		ans=b1.ArrayToBST(b,0,3);
	}
	
}

	class nNode{
	nNode left;
	nNode right;
	int data;
	nNode(int data){
		this.data=data;
		left=null;
		right=null;
	}
	
}

