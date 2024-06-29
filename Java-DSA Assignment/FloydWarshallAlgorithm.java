//Implement the Floyd-Warshall algorithm in Java to find the shortest paths between all pairs of vertices in a weighted graph.

public class FloydWarshallAlgorithm {
	final static int INF = 99999;
	final static int V = 4;
	
	void floydWarshall(int graph[][]) {
		int dist[][] = new int[V][V];
		int i,j,k;
		
		for(i=0;i<V;i++) {
			for(j=0;j<V;j++) {
				dist[i][j]=graph[i][j];
			}
		}
		for(k=0;k<V;k++) {
			for(i=0;i<V;i++) {
				for(j=0;j<V;j++) {
					if(dist[i][k]+dist[k][j]<dist[i][j]) {
						dist[i][j]=dist[i][k]+dist[k][j];
					}
				}
			}
		}
		printSolution(dist);
	}
	
	void printSolution(int dist[][]) {
		System.out.println("The Matrix Shows the Shortest Distance Between Every Pair Of Vertices:");
		for(int i=0;i<V;i++) {
			for(int j=0;j<V;j++) {
				if(dist[i][j]==INF)
					System.out.print("INF");
				else
					System.out.print(dist[i][j] + "  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graph[][] = { {0,10,1,INF},
				{10,0,INF,2},
				{1,INF,0,1},
				{INF,2,1,0}};
		FloydWarshallAlgorithm obj = new FloydWarshallAlgorithm();
		obj.floydWarshall(graph);
	}
}

/*Output:
The Matrix Shows the Shortest Distance Between Every Pair Of Vertices:
0  4  1  2  
4  0  3  2  
1  3  0  1  
2  2  1  0  
*/