package Day14;

public class exe135 {
	public static void main(String args[])
	{
		LinkedList l_list = new LinkedList();
		// Insert data into LinkedList
		l_list.push(17);
		l_list.push(17);
		l_list.push(16);
		l_list.push(15);
		l_list.push(15);
		l_list.push(14);
		l_list.push(13);
		l_list.push(12);
		l_list.push(12);
		
		System.out.println("Original List with duplicate elements:");
		l_list.printList();
		l_list.remove_Duplicates();
		
		System.out.println("After removing duplicates from the said list:");
		l_list.printList();
	}
}
