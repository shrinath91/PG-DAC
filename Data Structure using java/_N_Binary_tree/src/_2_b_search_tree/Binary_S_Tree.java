package _2_b_search_tree;


public class Binary_S_Tree
{
	Node root;

	public Binary_S_Tree()
	{
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
		while(true)
		{
			if(mv.data > data)
			{
				if(mv.left==null)
				{
					mv.left=n1;
					System.out.println("Node added at "+mv.data);
					break;
				}
				else
				{
					mv=mv.left;
				}
			}
			else if(mv.data < data)
			{
				if(mv.right==null)
				{
					mv.right=n1;
					System.out.println("Node added at "+mv.data);
					break;
				}
				else
				{
					mv=mv.right;
				}
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



















