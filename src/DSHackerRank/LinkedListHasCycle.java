package DSHackerRank;

import java.util.HashSet;

public class LinkedListHasCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.floor(Math.log(7)));

	}

	boolean hasCycle(Node head) {
	    if (head == null) return false;
	    
	    Node hare = head;
	    HashSet<Node> nodesVisited = new HashSet<Node>();
	    
	    while (hare != null) {
	        if (nodesVisited.contains(hare)) return true;
	        nodesVisited.add(hare);
	        hare = hare.next;
	    }
	    
	    return false;
	}



}