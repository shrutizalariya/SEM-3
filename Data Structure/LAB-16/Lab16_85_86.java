import java.util.*;

class Graph{

	private Map<Integer , List<Integer>> adjList;

	public Graph(){
		adjList = new HashMap<>();
	}

	public void AddEdge(int u,int v){
		adjList.putIfAbsent(u,new ArrayList<>());
		adjList.putIfAbsent(v,new ArrayList<>());
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}

	public void dfs(int start){
		Set<Integer> visited = new HashSet<>();
		dfsHelper(start , visited);
	}

	public void dfsHelper(int vertex , Set<Integer>visited){
			visited.add(vertex);
			System.out.println(vertex +" ");
			for(int neighbour : adjList.getOrDefault(vertex ,new ArrayList<>())){
				if(!visited.contains(neighbour)){
					dfsHelper(neighbour,visited);
				}
			}

	}

	public void bfs(int vertex){
		Set<Integer> visited= new HashSet<>();
		Queue<Integer> Queue =new LinkedList<>();
		visited.add(vertex);
		Queue.add(vertex);


		while(!Queue.isEmpty()){
			int start = Queue.poll();
			System.out.println(start +" ");
			for(int neighbour : adjList.getOrDefault(start ,new ArrayList<>())){
				if(!visited.contains(neighbour)){
					visited.add(neighbour);
					Queue.add(neighbour);
				}
			}
		}
	}
}



public class Lab16_85_86{
	public static void main(String[] args) {
		Graph g = new Graph();
		g.AddEdge(0,1); 
		g.AddEdge(0,2);
		g.AddEdge(1,2);
		g.AddEdge(1,3);
		g.AddEdge(2,4);
		g.AddEdge(3,4);

		System.out.println("DFS Starting");
		g.dfs(0);

		System.out.println("BFS Starting");
		g.bfs(0);
	}
}