
public class LinkedList {
	Node headNode;
	Node firstNode;

	LinkedList(int headContent) {
		Node newNode = new Node();
		newNode.setElement(headContent);
		newNode.setNext(null);
		newNode.setPrev(null);
		headNode = newNode;
		firstNode = newNode;
	}

	public void addItem(int itemContent) {
		Node newNode = new Node();
		newNode.setElement(itemContent);
		newNode.next = headNode;
		headNode.prev = newNode;
		headNode = newNode;
	}

	public void addItemOnBegining(int itemContent) {
		Node newNode = new Node();
		newNode.setElement(itemContent);
		newNode.prev = firstNode;
		firstNode.next = newNode;
		firstNode = newNode;
	}

	public int getLength() {
		int returnValue = 0;

		Node currentNode = headNode;

		while (currentNode != null) {
			returnValue++;
			currentNode = currentNode.next;
		}
		return returnValue;
	}

	public void removeHead() {
		System.out.println("Removing head");

		headNode = headNode.next;
		headNode.prev = null;
	}

	public void removeTail() {
		System.out.println("Removing tail");

		firstNode = firstNode.prev;
		firstNode.next = null;
	}

	public void find(int content) {
		Node currentNode = headNode;

		while (currentNode != null) {
			if (currentNode.getElement() == content) {
				System.out.println("Found ");

			}

			currentNode = currentNode.next;

		}
	}

	public void insertBefore(Node node, Node newNode) {
		System.out.println("Insert Before");
		Node currentNode = headNode;
		while (currentNode != null) {
			if (currentNode == node) {
				System.out.println("Hit");
				// insert prev.
		
				Node tNewNode = newNode;
				tNewNode.next = currentNode;
				tNewNode.prev = currentNode.prev;
				if (headNode == currentNode) { // isHead node then set new head
					headNode = tNewNode;
			}
			
				currentNode.prev = tNewNode;

			}	

			currentNode = currentNode.next;
		}
	}

	public void insertAfter(Node node, Node newNode) {
		System.out.println("Insert After");
		Node currentNode = headNode;
		while (currentNode != null) {
			if (currentNode == node) {
				System.out.println("Hit");
				// insert prev.
		
				Node tNewNode = newNode;
				
				tNewNode.prev = currentNode;
				tNewNode.next = currentNode.next;
				//if (firstNode == currentNode) { // isHead node then set new head
				//	firstNode = tNewNode;
				//}
				currentNode.next.prev = tNewNode;
				currentNode.next = tNewNode;
				
					
			}

			currentNode = currentNode.next;
		}
	}

	public void printAll() {
		Node currentNode = headNode;
		System.out.println("Printing :");
		while (currentNode != null) {
			System.out.print(currentNode.toString() + " ");

			currentNode = currentNode.next;

		}
		System.out.println("");
		System.out.println("Head :" + headNode.getElement() + " Tail: " + firstNode.getElement());
	}

	public void printAllReverse() {
		Node currentNode = firstNode;
		System.out.println("Printing Reverse Order :");

		while (currentNode != null) {
			System.out.print(currentNode.toString() + " ");
			currentNode = currentNode.prev;

		}
		System.out.println();
		System.out.println("Head :" + headNode.getElement() + " Tail: " + firstNode.getElement());

	}
}