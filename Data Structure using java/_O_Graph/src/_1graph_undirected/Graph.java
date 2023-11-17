package _1graph_undirected;

import java.util.Scanner;

public class Graph
{
	int ver;
	int arr[][];
	
//	{
//		System.out.println("Graph of "+ ver +"vertex created.");
//	}
	public Graph(int ver)
	{
		super();
		this.ver = ver;
		this.arr = new int[ver][ver];
		System.out.println("Graph of "+ ver +" vertex created.");
	}

	public void acceptGraph()/////////////////////////////////////
	{
		int no;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<ver; i++)
		{
			for(int j=0; j<ver; j++)
			{
				System.out.print("Value for ["+i+"]["+j+"]: ");
				no=sc.nextInt();
				arr[i][j]=no;
			}
			System.out.println();
		}
		sc.close();
	}
	
	public void addEdge(int i, int j)////////////////////////
	{
		arr[i][j]=1;
		arr[j][i]=1;
	}
	
	public void display()
	{
		for(int i=0; i<arr.length; i++)
		{
			System.err.print(i+": ");
			for(int j=0; j<arr[0].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}

























