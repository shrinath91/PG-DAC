package _03BinarySearchTree;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cBinarySearchTree b = new cBinarySearchTree();
		
//		System.out.println("Enter Size: ");
//		int size = sc.nextInt();
//		while(size-- > 0) {
//			System.out.println("Enter data");
//			int data = sc.nextInt();
//			b.addNode(data);
//		}
		
		
		b.root = b.insertNode(b.root, 100);
		b.insertNode(b.root, 60);
		b.insertNode(b.root, 110);
		b.insertNode(b.root, 15);
		b.insertNode(b.root, 147);
		b.inOrder(b.root);
		System.out.println();
		System.out.println("height of tree: "+b.height(b.root));
		System.out.println("largest element: "+b.largestElement());
		System.out.println("largest element: "+b.smallestElement());
		System.out.println(b.searchNode(6));
		b.deleteNode(110);
		b.inOrder(b.root);
		System.out.println();
		b.displayLevelWise();
	}
}
