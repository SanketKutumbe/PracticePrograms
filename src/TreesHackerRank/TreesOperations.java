package TreesHackerRank;



import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*
class Node
{
	int data;
	Node left;
	Node right;
}
*/

public class TreesOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = (Queue) new ArrayList();
		
		}

	/*
	void levelOrder(Node root) {
	      
	       java.util.Queue q = new java.util.LinkedList();
	       q.add(root);
	       
	       Node tempHead = new Node();
	       
	       while(!q.isEmpty())
	       {
	            tempHead = (Node) q.poll();
	           
	           System.out.print(tempHead.data + " ");
	           if(tempHead.left != null)
	               q.add(tempHead.left);
	           if(tempHead.right != null)
	               q.add(tempHead.right);
	       }
	      
	    }

	static Node Insert(Node root,int value) {

	    Node newNode = new Node();
	    newNode.data = value;
	    newNode.left = null;
	    newNode.right = null;
	    
	    if(root == null)
	        return newNode;
	    
	    Node temp = new Node();
	    temp = root;
	    
	    while(root != null)
	    {
	        if(root.data > value)
	        {
	            if(root.left !=null)
	            root = root.left;
	            else
	            {
	                root.left = newNode;
	                break;
	            } 
	        }
	        else if(root.data < value)
	        {
	            if(root.right != null)
	            root = root.right;
	            else
	            {
	                root.left = newNode;
	                break;
	            }
	        }
	    }
	    root = temp;
	    
	    return root;   
	}

	//Decode method has some input string in bit format. We need to construct tree using bit format
	//Rest thing will be taken care by the program itself
	void decode(String S ,Node root)
    {
        Node temp = root;
        int n = S.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
    
        while( i < n )
        {
            temp = S.charAt(i) == '1'? temp.right : temp.left;
            if(temp.right == null && temp.left == null)
            {
                sb.append(temp.data);
                temp = root;
            }
            i++;
        } 
     System.out.print(sb);
    }
	*/

}

