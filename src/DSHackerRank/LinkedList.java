package DSHackerRank;

class Node
{
	int data;
	Node next;
}

class Node2
{
	int data;
	Node2 left;
	Node2 right;
}

public class LinkedList {

	void Print(Node head) {
		  if(head==null) return;
		    System.out.print(head.data + "-->");
		    Print(head.next);	 
		    
		}
	Node Insert(Node head,int data) {
		// This is a "method-only" submission. 
		// You only need to complete this method. 
		    Node temp = head;
		    
		    while(head!=null) 
		    {
		        if(head.next == null)
		        {
		            Node t = new Node();
		            t.data = data;
		            t.next = null;
		            head.next = t;
		            head = t;
		        }
		        head = head.next;
		    }
		    return temp;
		    
		}
	Node InsertStart(Node head, int data)
	{
		Node newHead = new Node();
		newHead.data = data;
		newHead.next = head;
		head = newHead;
		return head;
	}
	Node Delete(Node head, int position) {
		  // Complete this method
		    
		    if(head==null) return null;
		    
		    Node temp = new Node();
		    temp = head;
		    
		    Node delNode = new Node();
		    
		    if(position==0)
		    {
		        delNode = head.next;
		        head.next = null;
		        head = delNode;
		        return head;
		    }
		    while(position>=1)
		    {
		        position--;
		        if(position==0)
		        {
		            delNode = head.next;
		            head.next = delNode.next;
		            delNode.next = null;
		        }
		        head = head.next;
		    }
		    head = temp;
		    return head;

		}	
	Node Reverse(Node head) {
	    if(head==null) return null;
	    
	    if(head.next == null) return head;
	    
	    Node prev, tail;
	    
	    prev = null;
	    tail = null;
	    
	    
	    while(head != null)
	    {
	        tail = head.next;
	        head.next = prev;
	        prev = head;
	        head = tail;
	    }
	    
	    head = prev;
	    
	    return head;
	}
	int CompareLists(Node headA, Node headB) {
	    // This is a "method-only" submission. 
	    // You only need to complete this method 
	    int count = 0;
	   
	    while(headA.data == headB.data)
	    {
	         headA = headA.next;
	         headB = headB.next;
	         if(headA == null) 
	         {
	             if( headB == null)
	             count++;
	             break;
	         }
	    }
	    
	    if(count==0) return 0;
	    else return 1;
	  
	}

	Node mergeLists(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method 
	    Node temp = new Node();
	    Node newHead = new Node();
	    
	    if(headA != null && headB != null)
	    {
	        newHead = (headA.data>headB.data)?headB:headA;
	    }
	    
	    if(headA == null) return headB;
	    if(headB == null) return headA;
	    
	    while(headA != null && headB != null)
	    {
	        if(headA.data > headB.data)
	        {
	        	if( headB.next != null && headA.data > headB.next.data )
	        	{
	        		headB = headB.next;
	        	}
                else
                {
                	temp = headB.next;
                	headB.next = headA;
                	headB = temp;
                }
	        }
	        else
	        {
	        	if( headA.next != null && headA.next.data < headB.data)
	        	{
	        		headA = headA.next;
	        	}
	        	else
	        	{
	        		temp = headA.next;
	        		headA.next = headB;
	        		headA = temp;
	        	}
	        }
	    }
	    return newHead;

	}

	static int height(Node2 root) {
      	// Write your code here.
        if (root != null)
        return 1 + Math.max(height(root.left), height(root.right));
        else
        return -1;
        
    }
	Node RemoveDuplicates(Node head) {
		  // This is a "method-only" submission. 
		  // You only need to complete this method. 
		    if(head == null) return null;
		    
		    Node newHead = new Node();
		    newHead = head;
		    
		    while(head.next != null)
		    {
		        if(head.data == head.next.data)
		        {
		            head.next = head.next.next;
		        }
		        else
		            head = head.next;
		    }
		    
		    return newHead;
		}
	/*static Node Reverse(Node head) {
	    if(head==null) return null;
	    
	    if(head.next == null) return head;
	    
	    Node prev, tail;
	    
	    prev = head;
	    tail = head.next;
	    prev.next = null;
	    
	    while(head.next != null)
	    {
	        head = tail;
	        tail = head.next;
	        head.next = prev;
	        prev = head;
	    }

	    return head;
	}
	
	/*public static void main(String [] args)
	{
		LinkedList ll = new LinkedList();
		
		Node list = new Node();
		Node head = ll.Insert(list, 1);
		list = ll.Insert(list, 2);
		list = ll.Insert(list, 3);
		
		ll.Print(list);
		Node newList = new Node();
		
		System.out.println();
		
		newList = ll.Reverse(list);
		ll.Print(newList);
	}*/
}
