package practice;

public class validateintegrity {
	private Node root;
	public boolean validBST(){
		return validBST(root);
	}
	private boolean validBST(Node root)
	{
		if(root==null)
			return true;
		if(root.left!=null && maxValue(root.left)>root.data)
			return false;
		if(root.right!=null && minValue(root.right)<=root.data)
			return false;
		return(validBST(root.left) && validBST(root.right));
	}
	public int minValue(){
		return minValue(root);
	}
	private int minValue(Node n){
		while(n.left!=null)
			n=n.left;
		return n.data;
			
	}
	public int maxValue(){
		return maxValue(root);
	}
	private int maxValue(Node n){
		while(n.right!=null)
			n=n.right;
		return n.data;
			
	}


private static class Node {
	Node left;
	Node right;
	int data;
	Node(int n){
		left=null;
		right=null;
		data=n;
	} }
	public void insert(int data){
		root=insert(root,data);
	}
	private Node insert(Node n,int data){
		if(n==null)
			n=new Node(data);
		else{
			if(data<=n.data)
				n.left=insert(n.left,data);
			else
				n.right=insert(n.right,data);
		}
		return n;	
	}
	public static void main(String[] args){
		validateintegrity v1=new validateintegrity();
		v1.insert(1);
		v1.insert(2);
		v1.insert(3);
		boolean a;
		a=v1.validBST();
		System.out.println(a);
	}

}
	

