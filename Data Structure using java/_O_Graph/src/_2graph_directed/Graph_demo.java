package _2graph_directed;

public class Graph_demo 
{

	public static void main(String[] args) {
//		Graph g1 = new Graph(7);
//		g1.acceptGraph();
//		g1.display();
		
		//or
		
		Graph g2 = new Graph(7);
		g2.addEdge(0, 1);
		g2.addEdge(0, 2);
		g2.addEdge(0, 3);
		g2.addEdge(0, 4);
		
		g2.addEdge(1, 5);
		g2.addEdge(2, 5);
		g2.addEdge(3, 6);
		g2.addEdge(4, 6);
		
		g2.addEdge(5, 6);
		
		g2.display();
		
		g2.indegree();
		g2.outdegree();
	}

}
