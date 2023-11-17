package _3undirected_graph_DFS;

import java.util.Scanner;

public class Graph
{
	int ver;
	int arr[][];

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
				System.out.print("Value for arr["+i+"]["+j+"]: ");
				if(arr[j][i]==1)
				{
					arr[i][j]=0;
					System.out.print(arr[i][j]+"\n");
					continue;
				}
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
	}

	public void display()//////////////////////////////////
	{
		for(int i=0; i<arr.length; i++)
		{
			//			System.err.print(i+": ");

			for(int j=0; j<arr[0].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public void indegree()//////////////////////
	{
		int sum;
		System.out.println("Indegree");
		for(int i=0; i<arr.length; i++)
		{
			sum=0;
			for(int j=0; j<arr[0].length; j++)
			{
				sum+=arr[j][i];
			}
			System.out.println(i+": "+sum);
		}
	}

	public void outdegree()///////////////////
	{
		int sum;
		System.out.println("Outdegree");
		for(int i=0; i<arr.length; i++)
		{
			sum=0;
			for(int j=0; j<arr[0].length; j++)
			{
				sum+=arr[i][j];
			}
			System.out.println(i+": "+sum);
		}
	}

	public void dfs(int start)
	{
		boolean v[] = new boolean[ver];
		travDFS(start, v);

	}
	private void travDFS(int start, boolean v[])
	{
		v[start]=true;
		System.out.print(start+" ");

		for(int i=0; i<arr.length; i++)
		{
			if(arr[start][i]==1 &&v[i]==false)
			{
				travDFS(i, v);
			}
		}
	}

}//class end
//



//Graph of 7 vertex created.
//0 1 1 1 1 0 0 
//0 0 0 0 0 1 0 
//0 0 0 0 0 1 0 
//0 0 0 0 0 0 1 
//0 0 0 0 0 0 1 
//0 0 0 0 0 0 1 
//0 0 0 0 0 0 0 
//Indegree
//0: 0
//1: 1
//2: 1
//3: 1
//4: 1
//5: 2
//6: 3
//Outdegree
//0: 4
//1: 1
//2: 1
//3: 1
//4: 1
//5: 1
//6: 0
//0 1 5 6 2 3 4 
//






















