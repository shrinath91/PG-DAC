package _1graph_undirected;

public class Graph_demo 
{

	public static void main(String[] args) {
//		Graph g1 = new Graph(5);
//		g1.acceptGraph();
//		g1.display();
		
		//or
		
		Graph g2 = new Graph(4);
		g2.addEdge(0, 1);
		g2.addEdge(0, 2);
		g2.addEdge(0, 3);
		g2.addEdge(1, 2);
		g2.addEdge(1, 3);
		g2.addEdge(2, 3);
		g2.display();
	}

}
