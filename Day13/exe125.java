package Day13;

import Day13.exe121.Node;

public class exe125 {
	static class Node
	{
	int value ;
	Node left;
	Node right;

	Node(int value)
	{
	this.value = value;
	left = null;
	right = null;
	}
	}

	public void insert(Node node , int value)
	{
	if(value < node.value)
	{
	if(node.left != null)
	{
	insert(node.left , value);
	}
	else
	{
	System.out.println("Inserted " + value + " to the left of " + node.value);
	node.left = new Node(value);
	}
	}
	else if(node.value < value)
	{
	if(node.right != null)
	{
	insert(node.right , value);
	}
	else
	{
	System.out.println("Inserted " + value + " to the right of " + node.value);
	node.right = new Node(value);
	}
	}
	}

	public void print(Node node)
	{
	if(node != null)
	{
	System.out.print(" " + node.value);
	print(node.left);

	print(node.right);
	}
	}

	public static void main(String [] args)
	{
	Node root = new Node(10);
	exe125 p = new exe125();

	p.insert(root , 55);
	p.insert(root, 21);
	p.insert(root, 80);
	p.insert(root, 9);

	System.out.println("The Binary tree is ");
	p.print(root);
	}

	}
