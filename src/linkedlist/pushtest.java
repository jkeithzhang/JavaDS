package linkedlist;

public class pushtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a = new LinkedList();
		LinkedList b = new LinkedList();
		a.push(8);
		a.push(7);
		a.push(6);
		a.push(5);
		a.push(4);
		a.push(3);
		a.push(2);
		a.push(1);
		
		b.head = a.reverse();
		System.out.println(b.head);
		b.printList();
	}

}
