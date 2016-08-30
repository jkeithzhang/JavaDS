package linkedlist;

public class pushtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a = new LinkedList();
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		a.push(5);
		a.push(6);
		a.push(7);
		a.push(8);
		
		a.swapNodes(2, 6);
		a.printList();

	}

}
