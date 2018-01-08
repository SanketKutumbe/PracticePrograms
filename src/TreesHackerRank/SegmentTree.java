package TreesHackerRank;

class Node
{
	Node left, right;
	int val;
	public int data;
	
	Node(int val)
	{
		this.val = val;
		left = right = null;
	}
}

public class SegmentTree 
{
	static int[] arr = { 1, 2, 3, 4 };
	
	public static Node build(Node root, int start, int end)
	{
		if( start == end )
		{
			root = new Node(arr[start]);
			
		}
		else
		{
			int mid = (start + end) / 2;
			
			root.left = new Node(0);
			root.right = new Node(0);
			
			build(root.left, start, mid);
			
			build(root.right, mid + 1, end);
		
			root.val = root.left.val + root.right.val;
			System.out.println(root.val);
		}
		
		return root;
	}
	
	public static void main(String[] args)
	{
		
		Node root = build( new Node(0) , 0, 3);
		System.out.println(root.val);
		
	}
}
