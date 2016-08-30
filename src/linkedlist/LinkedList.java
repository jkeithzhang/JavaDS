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
	
	// Swap Nodes x and y in linked list by changing links (assuming all the keys in array are distinct)
	public void swapNodes(int a, int b) {
		//a=b, no need to take action
		if(a == b)
			return;
		//a!=b
		Node prevA = null;
		Node curA = this.head;
		while(curA != null && curA.data != a) {
			prevA = curA;
			curA = curA.next;
		}
		
		Node prevB = null;
		Node curB = this.head;	
		while(curB != null && curB.data != b) {
			prevB = curB;
			curB = curB.next;
		}		
		
		if(curA == null || curB == null) {
			//msg: keys not found
			return;
		}
		
		System.out.println(curA.data);
		System.out.println(curB.data);
		
		if(prevA != null) {
			prevA.next = curB;
		} else {
			this.head = curB;
		}
		
		if(prevB != null) {
			prevB.next = curA;
		} else {
			this.head = curA;
		}	
		
        Node temp = curA.next;
        curA.next = curB.next;
        curB.next = temp;		
	}
	
	// Find the length of the list with iterative way
	public int getLengthIterative() {
		int len = 0;
		while(this.head != null) {
			len++;
			this.head = this.head.next;
		}
		return len;
	}
		
	// Find the length of the list with recursive way
	private int getLengthRecursive(Node node) {
        // Base case
        if (node == null)
            return 0;
        // Count is this node plus rest of the list
        return 1 + getLengthRecursive(node.next);
	}
	
	// Wrapper for getLengthRecursive()
	public int getLengthRecursive() {
		return getLengthRecursive(this.head);
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
		// Line breaker
		System.out.println("");
	}
}
