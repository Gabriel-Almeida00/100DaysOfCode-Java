package Day13;

public class exe127 {
	 public static void main(String[] args)
	    {
	       BinaryTree tree = new BinaryTree();
	        tree.root = new Node(55);
	        tree.root.left = new Node(21);
	        tree.root.right = new Node(80);
	        tree.root.left.left = new Node(9);
	        tree.root.left.right = new Node(29);
	        tree.root.right.left = new Node(76);
	        tree.root.right.right = new Node(91);

	        System.out.println("\nPostorder traversal of binary tree is: ");
	        tree.print_Postorder();
	    }
}
