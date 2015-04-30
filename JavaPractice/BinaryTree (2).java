import java.util.*;
public class BinaryTree {
	private Tree root;
	class Tree{
		int data;
		Tree right;
		Tree left;
		
		Tree(int d){
			left=null;
			right=null;
			data=d;
		}
	}
	public BinaryTree(){
		root=null;
	}
	public boolean lookup(int data){
		return(lookup(root,data));
	}
	private boolean lookup(Tree root,int d){
		if(root==null)
			return false;
		if(d==root.data)
			return true;
		else if(d<root.data)
			return lookup(root.left,d);
		else
			return lookup(root.right,d);
		
	}
	public void insert(int data){
		root=insert(root,data);
	}
	private Tree insert(Tree root,int d){
		if(root==null)
			new Tree(d);
		if(d<root.data)
			insert(root.left,d);
		if(d>root.data)
			insert(root.right,d);
		return root;
	}
	public int size(){
		return size(root);
	}
	private int size(Tree root){
		if(root==null)
			return (0);
		else
			return (size(root.left)+size(root.right)+1);
	}
	public int maxDepth(){
		return maxDepth(root);
	}
	private int maxDepth(Tree root){
		if(root==null)
			return 0;
		int lDepth;
		int rDepth;
		lDepth=maxDepth(root.left);
		rDepth=maxDepth(root.right);
		return (Math.max(lDepth, rDepth)+1);
	}
	
	public int minValue(){
		return (minValue(root));
	}
	private int minValue(Tree root){
		Tree current;
		current=root.left;
		while(current!=null)
			current=current.left;
		return(current.data);
		
	}
	public int maxValue(){
		return (maxValue(root));
	}
	private int maxValue(Tree root){
		Tree current;
		current=root.right;
		while(current!=null)
			current=current.right;
		return(current.data);
		
	}
	public void printPostOrder(){
		printPostOrder(root);
	}
  private void printPostOrder(Tree root){
	  if(root==null)
		  return;
	  printPostOrder(root.left);
	  printPostOrder(root.right);
	  System.out.println(root.data);
  }
  public boolean hasPathSum(int sum){
	  return(hasPathSum(root,sum));
  }
  private boolean hasPathSum(Tree root,int sum){
	  if(root==null)
		  return(sum==0);
	  int subSum=sum-root.data;
	  return (hasPathSum(root.left,subSum) || hasPathSum(root.right,subSum));
  }
  public void mirror(){
	  mirror(root);
  }
  private void mirror(Tree root){
	  if(root!=null){
		  mirror(root.left);
		  mirror(root.right);
		  Tree temp;
		  temp=root.left;
		  root.left=root.right;
		  root.right=temp;
	  }
	  
  }
  public boolean isBST1(){
	  return isBST1(root);
  }
  private boolean isBST1(Tree root){
	  if(root==null)
		  return true;
	  if(root.left!=null && root.data<=minValue())
		  return false;
	  if(root.right!=null && root.data>maxValue())
		  return false;
	  return isBST1(root.left) && isBST1(root.right);
	  
  }
  public ArrayList<Integer> inorder(){
	  return (inorder(root));
  }
  private ArrayList<Integer> inorder(Tree root){
	  Stack<Tree> set=new Stack<Tree>();
	  ArrayList<Integer> list=new ArrayList<Integer>();
	  Tree current;
	  current=root;
	  if(current==null)
		  return list;
	  while(current!=null && !set.empty())
	  {
		  if(current!=null)
		  {   set.push(current);
			  current=current.left;
		  }
		  else
		  {
			  Tree present;
			  present=set.pop();
			  list.add(present.data);
			  current=present.right;
		  }
	  }
	  return list;
  }
  public void MorrisTraversal(){
	  MorrisTraversal(root);
  }
  private void MorrisTraversal(Tree root){
	  Tree current,pre;
	  if(root==null)
		  return;
	  current=root;
	  while(current!=null){
		  if(current.left==null)
		  {
			  System.out.println(current.data);
			  current=current.right;
		  }
		  else{
			  pre=current.left;
			  while(current.right!=null && pre.right!=current)
				  pre=pre.right;
			  if(pre.right==null){
				  pre.right=current;
				  current=current.left;
			  }
			  else{
				  pre.right=null;
				  System.out.println(current.data);
				  current=current.right;
			  }
		  }
	  }
	  
	  }
	  public void PostOrder(){
		  PostOrder(root);
		  
		  
	  }
	  private void PostOrder(Tree root){
		  if(root==null)
			  return;
		  Stack<Tree> set=new Stack<Tree>();
		  Tree prev=null;
		  Tree current;
		  while(!set.isEmpty()){
			  Tree curr=set.peek();
			  if(prev==null || prev.left==curr || prev.right==curr){
				  if(curr.left!=null)
					  set.push(curr.left);
				  else if(curr.right!=null)
					  set.push(curr.right);
				  else
				  {
					  System.out.println(curr.data);
					  set.pop();
				  }
				  
				  
			  }
			  else if(curr.left==prev){
				  if(curr.right!=null)
					  set.push(curr.right);
				  else{
					  System.out.println(curr.data);
					  set.pop();
				  }
			  }
			  else if(curr.right==prev){
				  System.out.println(curr.data);
				  set.pop();
			  }
		  }
		  
	  }
	  public void PreOrder(){
		  PreOrder(root);
	  }
	  private void PreOrder(Tree root){
		  if(root==null)
			  return;
		  Stack<Tree> set=new Stack<Tree>();
		  
		  set.push(root);
		  while(!set.isEmpty()){
			  Tree current=set.pop();
			  System.out.println(current.data);
			  if(current.right!=null)
				  set.push(current.right);
			  if(current.left!=null)
				  set.push(current.left);
			  
		  }
	  }
	  public Tree LowestCommonAncestor(int value1,int value2){
		  return (LowestCommonAncestor(root,value1,value2));
		  
	  }
	  private Tree LowestCommonAncestor(Tree root,int value1,int value2){
		  Tree current=root;
		  while(current!=null){
			  int value=current.data;
			  if(value>value1 && value>value2)
				current=current.left;
			  else if(value<value1 && value<value2)
				  current=current.right;
			  else
				  return current;
		  }
		 return null; 
	  }
  }


