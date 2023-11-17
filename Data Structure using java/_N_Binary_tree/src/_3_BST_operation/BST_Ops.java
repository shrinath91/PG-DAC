package _3_BST_operation;

public class BST_Ops
{
	Node root;

	public BST_Ops()
	{
		this.root = null;
	}

	public void addNode(int data)///////////////////////////////
	{
		Node n1 = new Node(data);
		if(root==null)
		{
			root=n1;
			System.out.println("Node added at Root!!!");
			return;
		}

		Node mv = root;
		while(true)
		{
			if(data < mv.data)
			{
				if(mv.left==null)
				{
					mv.left=n1;
					System.out.println("Node added at "+mv.data);
					return;
				}
				mv=mv.left;
			}
			else if(data > mv.data)
			{
				if(mv.right==null)
				{
					mv.right=n1;
					System.out.println("Node added at "+mv.data);
					return;
				}
				else
					mv=mv.right;
			}
		}
	}

	private void in_order(Node mv)
	{
		if(mv!=null)
		{
			in_order(mv.left);
			System.out.print(mv.data+" ");
			in_order(mv.right);
		}
	}
	private void pre_order(Node mv)
	{
		if(mv!=null)
		{			
			System.out.print(mv.data+" ");
			pre_order(mv.left);
			pre_order(mv.right);
		}
	}
	private void post_order(Node mv)
	{
		if(mv!=null)		
		{
			post_order(mv.left);
			post_order(mv.right);
			System.out.print(mv.data+" ");
		}
	}
	public void display()////////////////////////////////////////////////////////
	{	
		System.out.println("**** In Order ****");
		in_order(root);
		System.out.println();

		System.out.println("**** Pre Order****");
		pre_order(root);
		System.out.println();

		System.out.println("**** Post Order****");
		post_order(root);
		System.out.println();
	}
	
	public void deleteNode(int data)///////////////////////////////////
	{		
		Node temp = root;
		Node flag=null;
		if(data==temp.data)
		{
			Node tr=temp.right;
			while(tr.left!=null)
				tr=tr.left;
			
			tr.left=temp.left;
			root=temp.right;
			temp=null;
			return;	
		}
			
		while(temp!=null && temp.data!=data)
		{
			flag=temp;
			if(data < temp.data)
				temp=temp.left;
			else
				temp=temp.right;
		}
		
		if(temp==null)
		{
			System.out.println("Node Not Fount!!!");
			return;
		}
		
		if(temp.right==null)
		{
			if(temp.data < flag.data)
				flag.left=temp.left;
			else
				flag.right=temp.left;
		}
		else if(temp.left==null)
		{
			if(temp.data < flag.data)
				flag.left=temp.right;
			else
				flag.right=temp.right;
		}
		
		if(temp.left==null && temp.right==null)
		{
			Node tr=temp.right;
			while(tr.left!=null)
				tr=tr.left;
			
			tr.left=temp.left;
			if(temp.data < flag.data)
				flag.left=temp.right;
			else
				flag.right=temp.right;
		}
		
		temp=null;
	}
	
	public void SearchNode(int data)
	{
		if(data==root.data)
		{
			System.out.println("Node"+data+" found at Root");
			return;
		}
		
		Node temp=root;
		Node flag=null;
		while(temp!=null && temp.data!=data)
		{
			flag=temp;
			if(data < temp.data)
				temp=temp.left;
			else
				temp=temp.right;
		}
		if(temp==null)
			System.out.println("Node not found");
		else
			System.out.println("Node fount after Node: "+flag.data);
	}
	
	public int findHighest()///////////////////////////////
	{
		Node tr=root;
		while(tr.right!=null)
			tr=tr.right;
		
		return tr.data;	
	}
	
	public int findLowest()///////////////////////////////
	{
		Node tr=root;
		while(tr.left!=null)
			tr=tr.left;
		
		return tr.data;	
	}
	
	public void displayLevelwise()
	{	
		NodeQue q1=new NodeQue(15);
		q1.enQueue(root);
		 
		
		while(!q1.isEmpty())
		{
			Node temp=q1.deQueue();
			System.out.print(temp.data+" ");
			  
			if(temp.left!=null)
				q1.enQueue(temp.left);
			if(temp.right!=null)
				q1.enQueue(temp.right);
			
		}
	}
	
}



















