
class Node
{
	int data, height;
//	int beginIndex, lastIndex;
	Node left, right;
	
	Node(int key)
	{
		data = key;
		right = left = null;
		height = 1;
	}
}


public class AvlTree {
	
	static Node insertion(Node root, int data)
	{
		if(root == null) return (new Node(data));
		
		if( data < root.data)
		{
			//left
			
			root.left = insertion(root.left, data);
		}
		else if ( root.data < data)
		{
			//right
			root.right = insertion(root.right, data);
		}
		else
		{
			//ignore as duplications are not allowed
			return root;
		}
		
		root.height = 1 + max(root.left, root.right);
		
		int difference = getBalance(root.left, root.right);

		
		if(difference > 1 && root.left != null)
		{
			//LR rotation
			if(root.left.data < data)
			{root.left = leftRotation(root);}
					
			//right rotation where LL is covered
			root = rightRotation(root);
		}
		
		
		if(difference < -1 && root.right != null)
		{
			//RL rotation
			if(root.right.data > data)
			{root.right = rightRotation(root);}
			
			//left rotation where RR is covered
			root = leftRotation(root);
		}
		
		
		return root;
	}

	private static Node leftRotation(Node top) {
		
		Node topRight = top.right;
		Node topLeft = top.left;
		Node topRightLeft = topRight.left;
		Node tempTop = top;
		
		top = topRight;
		top.left = tempTop;
		top.right.left = topRightLeft;
		
		//Updating height of all changed nodes is necessary
		top.height = max(top.left, top.right) + 1;
		top.left.height = max(top.left.left, top.left.right) + 1;
		top.right.height = max(top.right.left, top.right.right) + 1;
		
		return top;
	}

	private static Node rightRotation(Node top) {
		/*
		 * 				top (tempTop)
		 * 			/		 \
		 * 		topLeft		topRight
		 * 		/		\
		 * 			topLeftRight
		 */
		Node topLeft = top.left;
		Node topRight = top.right;
		Node topLeftRight = topLeft.right;
		Node tempTop = top;
		
		/*
		 * 				topLeft -----> top
		 * 				/	\
		 * 					top -----> top.right
		 * 					/
		 * 				topLeftRight	--->top.right.left
		 */
		top = topLeft;
		top.right = tempTop;
		top.right.left = topLeftRight;
		
		//Updating height of all changed nodes is necessary
		top.height = max(top.left, top.right) + 1;
		top.left.height = max(top.left.left, top.left.right) + 1;
		top.right.height = max(top.right.left, top.right.right) + 1;
		
		return top;
	}

	private static int max(Node left, Node right) {
		
		if( left == null && right == null) return 0;
		
		if( left == null ) return right.height;
		
		if( right == null ) return left.height;
		
		return (left.height > right.height) ? left.height : right.height;
	}

	private static int getBalance(Node left, Node right) {
		
		if( left == null && right == null) return 0;
		
		if( left == null ) return right.height;
		
		if( right == null ) return left.height;
		
		return (left.height - right.height);
		
	}

	public static void main(String[] args) 
	{
		//Root element added
		Node root = insertion(null, 1);
		
		//Childs added
		root = insertion(root,2);
		root = insertion(root,3);
		
		//Calling root
		preOrder(root);
	}

	private static void preOrder(Node root) {

		if(root == null) return;
		
		System.out.println(root.data);
		preOrder(root.left);
		
		preOrder(root.right);
		
	}

}
