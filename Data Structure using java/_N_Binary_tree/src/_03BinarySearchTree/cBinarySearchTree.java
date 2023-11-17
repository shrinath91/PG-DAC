package _03BinarySearchTree;

import java.util.Scanner;

public class cBinarySearchTree {
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;		
		}
	}
	Node root;
	Scanner sc = new Scanner(System.in);
	
	public Node insertNode(Node root,int data) {
		
		if(root == null) {
			root = new Node(data);
			return root;
		}
		
		if(data < root.data) {
			root.left = insertNode(root.left,data);
		}else if(data > root.data) {
			root.right = insertNode(root.right, data);
		}
		
		return root;
	}
	
	public void addNode(int data) {
		Node rec = new Node(data);
		if(root == null) {
			root = rec;
			return;
		}
		Node move = root;
		while(true) {
			if(move.data > data) {
				if(move.left == null) {
					move.left = rec;
					break;
				}else {
					move = move.left;
					continue;
				}
			}else {
				if(move.right == null) {
					move.right = rec;
					break;
				}else {
					move = move.right;
					continue;
				}
			}
		}	
	}
	
	public Node insertNodeRecursive(Node root,int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		
		if(root.data < data) {
			root.right = insertNode(root.right, data);
		}
		else if(root.data > data) {
			root.left = insertNode(root.left, data);
		}
		return root;
	}
	
	public void inOrder(Node root) {
		if(root != null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	public void postOrder(Node root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	public void preOrder(Node root) {
		if(root != null) {
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public int height(Node root) {
		if(root == null) {
			return -1;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		
		return lh > rh ? lh+1 : rh+1;
	}
	
	public int largestElement() {
		Node move = root;
		while(move.right != null) {
			move = move.right;
		}
		return move.data;
	}
	public int smallestElement() {
		Node move = root;
		while(move.left != null) {
			move = move.left;
		}
		return move.data;
	}
	
	public boolean searchNode(int data) {
		Node move = root;
		while(move != null && move.data != data) {
			if(data > move.data) {
				move = move.right;
			}else if(data < move.data){
				move = move.left;
			}else {
				break;
			}
		}
		if(move != null && move.data == data) {
			return true;
		}
		return false;
	}
	
	public void deleteNode(int data) {
		Node temp = root;
		Node tag = null;
		while(temp != null && temp.data != data) {
			tag = temp;
			if(data > temp.data) {
				temp = temp.right;
			}else {
				temp = temp.left;
			}
		}
		
		if(temp.right == null || temp.left == null) {
			if(temp.right == null) {
				if(tag.data < temp.data) {
					tag.right = temp.left;
				}else {
					tag.left = temp.left;
				}
			}else if(temp.left == null) {
				if(tag.data < temp.data) {
					tag.right = temp.right;
				}else {
					tag.left = temp.right;
				}
			}else {
				tag.left = tag.right = null;
			}
		}
		
		if(temp.right != null && temp.left != null) {
			Node tr = temp.right;
			while(tr.left != null) {
				tr = tr.left;
			}
			tr.left = temp.left;
			temp.left = null;
			
			if(tag.data < temp.data) {
				tag.right = temp.right;
			}
			else {
				tag.left = temp.right;
			}
		}
	}
	public void displayLevelWise() {
		cQueue q = new cQueue();
		q.enqueue(root);
		while(!q.isEmpty()) {
			Node move = q.dequeue();
			System.out.print(move.data+" ");
			if(move.left != null) {
				q.enqueue(move.left);
			}
			if(move.right != null) {
				q.enqueue(move.right);
			}
		}
	}
}
