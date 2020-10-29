package HashMap;

public class MyLinkedList<k> {

	INode<k> head;
	INode<k> tail;

	public MyLinkedList() {
		super();
		this.head = null;
		this.tail = null;
	}

	// adds node to the tail
	public void add(INode<k> myNode) {

		if (this.tail == null) {
			this.tail = myNode;
		}

		if (this.head == null) {
			this.head = myNode;
		} else {
			INode<k> tempNode = this.tail;
			this.head = myNode;
			myNode.setNext(tempNode);
		}
	}

	// uc3 it adds node to the head
	public void append(INode<k> myNode) {

		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	// uc4 insert new node after particular node
	public void insert(INode<k> myNode, INode<k> newNode) {
		INode<k> tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	// uc5 remove the first element present and return its value
	public INode<k> pop() {

		INode<k> tempNode = this.head;
		this.head = tempNode.getNext();
		return tempNode;
	}

	// uc6 removes the last element present and return its value
	public INode<k> popLast() {

		INode<k> prevNode = head;
		while (!prevNode.getNext().equals(tail)) {
			prevNode = prevNode.getNext();
		}
		INode<k> tempNode = tail;
		prevNode.setNext(null);
		tail = prevNode;
		return tempNode;
	}

	// uc7 searches for an element if present returns true and if absent returns
	// false
	public INode<k> search(k key) {
		INode<k> temp = head;
		while (temp != null) {
			if (temp.getKey().equals(key))
				return temp;
			temp = temp.getNext();
		}
		return null;
	}

	// uc8 insert node after a specified node
	public void insert(k prevKey, k newKey) {
		INode<k> prevNode = search(prevKey);
		MyNode<k> newNode = new MyNode<>(newKey);
		insert(prevNode, newNode);
	}

	// uc9 Deletes a specified node using key
	public void delete(k key) {
		INode<k> nodeToDelete = search(key);
		INode<k> nextNode = nodeToDelete.getNext();
		INode<k> prevNode = head;
		while (!prevNode.getNext().equals(nodeToDelete)) {
			prevNode = prevNode.getNext();
		}
		prevNode.setNext(nextNode);
	}

	// finds the size of the list
	public int size() {
		int size = 0;
		INode<k> tempNode = head;
		while (!tempNode.equals(tail)) {
			tempNode = tempNode.getNext();
			size++;
		}
		return size + 1;
	}

}