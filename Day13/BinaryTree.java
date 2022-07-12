package Day13;

public class BinaryTree {
    Node root;
    
    BinaryTree()
    {
        root = null;
    } 
  
    // Print the nodes of binary tree in inorder
    void print_Inorder(Node node)
    {
        if (node == null)
            return;
 
        print_Inorder(node.left);
 
     // Print the data of node
        System.out.print(node.key + " ");
 
        print_Inorder(node.right);
    }
 
	void print_Inorder()
	   {     
	     print_Inorder(root);   
	     
	   }

	public void print_Postorder(Node node) {
		 if (node == null)
	            return;

	        print_Postorder(node.left);

	        print_Postorder(node.right);

	        System.out.print(node.key + " ");
	}
	 void print_Postorder()  
		{   
		   print_Postorder(root);  
		}

	public int maxDepth(Node root) {
		 if(root==null)
		        return 0;
		    int left_Depth = maxDepth(root.left);
		    int right_Depth = maxDepth(root.right);
		    int bigger = Math.max(left_Depth, right_Depth);
		    return bigger+1;
	}
}
