package _1_b_tree;

import java.util.Scanner;

public class Binary_Tree
{
	Node root;

	public Binary_Tree()
	{
		super();
		this.root = null;
	}

	public void addNode(int data)
	{	
		Node n1 = new Node(data);

		if(root==null)
		{
			root=n1;
			return;
		}

		Node mv = root;
		int ch;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("Press 1-left ,2-right to add at "+mv.data+": ");
			ch = sc.nextInt();
			if(ch==1)
			{
				if(mv.left==null)
				{
					mv.left=n1;
					System.out.println("Node added at "+mv.data);
//					break;
					return;
				}
				else
				{
					mv=mv.left;
				}
			}
			else if(ch==2)
			{
				if(mv.right==null)
				{
					mv.right=n1;
					System.out.println("Node added at "+mv.data);
//					break;
					return;
				}
				else
				{
					mv=mv.right;
				}
			}
			else
			{
				System.out.println("Invalid Choice!!!");
			}
		}
	}

	public void display()
	{	
		System.out.println();
		System.out.println("**** In-Order ****");
		inOrder(root);
		System.out.println();

		System.out.println("**** Pre-Order ****");
		preOrder(root);
		System.out.println();

		System.out.println("**** Post-Order ****");
		postOrder(root);
		System.out.println();
	}

	private void inOrder(Node mv)
	{
		if(mv!=null)
		{
			inOrder(mv.left);
			System.out.print(mv.data+" ");
			inOrder(mv.right);
		}
	}
	private void preOrder(Node mv)
	{
		if(mv!=null)
		{
			System.out.print(mv.data+" ");
			preOrder(mv.left);
			preOrder(mv.right);
		}
	}
	private void postOrder(Node mv)
	{
		if(mv!=null)
		{
			postOrder(mv.left);
			postOrder(mv.right);
			System.out.print(mv.data+" ");
		}
	}
}



















