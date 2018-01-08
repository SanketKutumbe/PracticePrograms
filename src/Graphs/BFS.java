package Graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BFS 
{
	private static int i;
	private static LinkedList<Integer>[] list;
	public BFS(int i) {

		this.i = i;
		list = new LinkedList[i];
		
		for(int j = 0; j < i; j++)
		{
			list[j] = new LinkedList<Integer>();
			list[j].add(j);
		}
			
	}

	/* Idea is to create array of linked list for each of the graph node.
	 * Then inserting elements according to edge-connection with other nodes.
	 * 
	 */
	void addEdge(int graphNode, int graphNodeNeedToAdd)
	{
		list[graphNode].add(graphNodeNeedToAdd);
	}
	
	public static void main(String[] args)
	{
		BFS b = new BFS(3);
		b.addEdge(0, 1);
		b.addEdge(0, 2);
		b.addEdge(1, 2);
		b.addEdge(2, 0);
		
	
		
//		for(int j = 0; j < 3; j++)
//		{
//			System.out.println(list[j]);
//		}
		b.bfs(2);
		
	}

	private void bfs(int j) {

		boolean visited[] = new boolean[i];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[j] = true;
		queue.add(j);
		
		System.out.println("BFS list is: ");
		
		while(!queue.isEmpty())
		{
			/*
			 * Printing front element of the queue
			 */
			
			int front = queue.poll();
			System.out.print(front + ", ");
			
			
			Iterator<Integer> iterator = list[front].listIterator();
			
			while(iterator.hasNext())
			{
				int nextElement = iterator.next();
				
				if(!visited[nextElement])
				{
					queue.add(nextElement);
					visited[nextElement] = true;
				}			
			}
		}
		
		
	}
	
}
