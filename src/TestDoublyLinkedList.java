
public class TestDoublyLinkedList {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(3);
		linkedList.addItem(2);
		linkedList.addItem(1);
		linkedList.printAll();

		linkedList.addItemOnBegining(0);
			
		linkedList.printAll();
		linkedList.removeHead();
		linkedList.printAll();
		linkedList.printAllReverse();
		linkedList.removeTail();
		linkedList.printAll();
		
		Node newNodeToBeTested = new Node();
		newNodeToBeTested.setElement(7);
		Node newNodeToBeTestedz = new Node();
		newNodeToBeTestedz.setElement(8);
	//	linkedList.insertBefore(linkedList.headNode, newNodeToBeTested);
	//	linkedList.printAll();
	//	linkedList.printAllReverse();
		linkedList.insertAfter(linkedList.headNode, newNodeToBeTestedz);
		linkedList.printAll();
		linkedList.printAllReverse();
	}

}
