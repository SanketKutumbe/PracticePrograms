package TreesHackerRank;

/*class Node
{
	int data;
	Node left;
	Node right;
}*/
public class LowestCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
static Node lca(Node root,int v1,int v2)
{
    //Decide if you have to call recursively
    //Smaller than both
    if(root.data < v1 && root.data < v2){
        return lca(root.right,v1,v2);
    }
    //Bigger than both
    if(root.data > v1 && root.data > v2){
        return lca(root.left,v1,v2);
    }

    //Else solution already found
    return root;
}
}
