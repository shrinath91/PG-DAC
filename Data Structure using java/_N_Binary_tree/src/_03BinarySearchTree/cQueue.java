package _03BinarySearchTree;

public class cQueue {
	public static class Node{
		cBinarySearchTree.Node data;
		Node next;
		Node(cBinarySearchTree.Node data){
			this.data = data;
		}
	}
	Node front;
	Node rear;
	
	public void enqueue(cBinarySearchTree.Node data) {
		Node rec = new Node(data);
		if(front == null) {
			front = rec;
		}else {
			rear.next = rec;
		}
		rear = rec;
	}
	public cBinarySearchTree.Node dequeue() {
		if(isEmpty()) {
			return null;
		}
		cBinarySearchTree.Node rec = front.data;
		if(front == rear) {
			front = rear = null;
		}else {
			front = front.next;
		}
		return rec;
	}
	public boolean isEmpty() {
		return front == null ? true:false;
	}
}
