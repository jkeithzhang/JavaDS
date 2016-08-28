package linkedlist;

class LinkedList {
	Node head;	
	// Used to define the component of the linked list
	class Node {
		int data;
		Node next;
		// constructor method
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	
	// Find the length of the list
	public void getLength() {
		int len = 0;
		while(this.head != null) {
			len++;
			this.head = this.head.next;
		}
		System.out.println(len);
	}
	
	// Inserts a new Node at front of the list.
	public void push(int new_data)
	{
	    Node new_node = new Node(new_data);	 
	    new_node.next = head;
	    head = new_node;
	}	
	
	// Append a new Node at the end of the list.
	public void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if(this.head == null) {
			this.head = new_node;
			return;
		}
		
		while(head.next != null)
			head = head.next;
		head.next = new_node;		
	}
	
    // Inserts a new node after the given prev_node.
    public void insertAfter(Node prev_node, int new_data)
    {
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }	
 
    // Delete the node at given position
    public void deleteNode(int position) {	
    	if(this.head == null) {
    		System.out.println("Cannot delete node as linkedlist is empty!");
    		return;
    	}
    	if(position == 0) {
    		this.head = this.head.next;
    		return;
    	}
    	//state machine..
    	for(int i = 0; i < position-1; i++) {
    		if(this.head != null) {
    			this.head = this.head.next;
    		}
    	}
    	if(this.head == null || this.head.next == null) {
    		System.out.println("Cannot delete node as position is more than number of ndoes");
    		return;
    	}
    	this.head.next = this.head.next.next;
    }
     
	// Function that print out the whole linked list 
	public void printList() {
		Node node = head;
		while(node != null) {
			System.out.print(node.data);
			node = node.next;
		}
	}
}
