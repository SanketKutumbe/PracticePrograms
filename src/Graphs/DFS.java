package Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

	private int n;
	private boolean visited[];
	private LinkedList<Integer> adjList[];
	private boolean flag = false;
	
	DFS(int n)
	{
		this.n = n;
		visited = new boolean[n];
		adjList = new LinkedList[n];
		
		for(int i = 0; i < n; i++)
			adjList[i] = new LinkedList<Integer>();
	}

	void addEdge(int start, int end)
	{
		adjList[start].add(end);
	}
	
	public static void main(String[] args) 
	{
		DFS g = new DFS(4);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
		
		g.dfs(2);
		

	}

	void dfs(int start)
	{
		Iterator<Integer> i = adjList[start].listIterator();
		int current;
		//System.out.println(start + " ");
		visited[start] = true;
		
		while(i.hasNext())
		{
			current = i.next();

			if(!visited[current])
			{
				visited[current] = true;
				//System.out.println(current + " ");
				dfs(current);
			}
			else
			{
				flag = true;
				break;
			}
		}
		
		System.out.println(flag?"true":"False");
		//System.exit(0);
		
	}
}
