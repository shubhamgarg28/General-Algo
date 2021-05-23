package linkedList;

public class SinglyLinkedList {
	
	public Node head;
	
	public void addInStart(int num) {
		Node node = new Node(num, head);
		head = node;
	}
	
	public void addAtEnd(int num) {
		Node node = new Node(num, null);
		Node start = head;
		if (start == null) {
			head = node;
		} else {
		while (start.next != null) {
			start = start.next;
		}
		start.next = node;
		}
	}
	
	public void printLL() {
		Node node = head;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.addInStart(1);
		ll.addInStart(2);
		ll.addInStart(3);
		ll.addAtEnd(0);
		ll.printLL();

	}

}
