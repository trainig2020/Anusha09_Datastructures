package io.anusha;

import java.util.Scanner;

public class BinaryTree {

	private BinaryNode root;

	/* Constructor */
	public BinaryTree() {
		root = null;
	}

	/* Function to check if tree is empty */
	public boolean isEmpty() {
		return root == null;
	}

	/* Functions to insert data */
	public void insert(int data) {
		root = insert(root, data);
	}

	/* Function to insert data recursively */
	private BinaryNode insert(BinaryNode node, int data) {
		if (node == null)
			node = new BinaryNode(data);
		else {
			if (data > node.data)
				node.right = insert(node.right, data);
			else if (data < node.data)
				node.left = insert(node.left, data);
		}
		return node;
	}

	/* Function to count number of nodes */
	public int countNodes() {
		return countNodes(root);
	}

	/* Function to count number of nodes recursively */
	private int countNodes(BinaryNode r) {
		if (r == null)
			return 0;
		else {
			int l = 1;
			l += countNodes(r.getLeft());
			l += countNodes(r.getRight());
			return l;
		}
	}

	/* Function to search for an element */
	public boolean search(int val) {
		return search(root, val);
	}

	/* Function to search for an element recursively */
	private boolean search(BinaryNode r, int val) {
		if (r.getData() == val)
			return true;
		if (r.getLeft() != null)
			if (search(r.getLeft(), val))
				return true;
		if (r.getRight() != null)
			if (search(r.getRight(), val))
				return true;
		return false;
	}

	// ************************************************************//

	public void delete(int value) {
		root = deleteRecursive(root, value);
	}

	public BinaryNode deleteRecursive(BinaryNode root, int value) {
		/* Base Case: If the tree is empty */
		if (root == null)
			return root;

		/* Otherwise, recur down the tree */
		if (value < root.data)
			root.left = deleteRecursive(root.left, value);
		else if (value > root.data)
			root.right = deleteRecursive(root.right, value);

		// if key is same as root's key, then This is the node
		// to be deleted
		else {
			// node with only one child or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// node with two children: Get the inorder successor (smallest
			// in the right subtree)
			root.data = minValue(root.right);

			// Delete the inorder successor
			root.right = deleteRecursive(root.right, root.data);
		}

		return root;
	}

	int minValue(BinaryNode root) {
		int minv = root.data;
		while (root.left != null) {
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}

	// ********************************************************//

	// UPDATION//

	public boolean update(int value) {
		return updateElement(root, value);
	}

	private boolean updateElement(BinaryNode current, int value) {
		Scanner sc = new Scanner(System.in);
		if (current.data == value) {
			System.out.println("Enter new element to update :");
			current.data = sc.nextInt();
			return true;

		}
		if (current.left != null) {
			if (updateElement(current.left, value)) {

				return true;
			}
		}
		if (current.right != null) {
			if (updateElement(current.right, value)) {

				return true;
			}
		}
		return false;
	}

	/* Function for inorder traversal */
	public void inorder() {
		inorder(root);
	}

	private void inorder(BinaryNode r) {
		if (r != null) {
			inorder(r.getLeft());
			System.out.print(r.getData() + " ");
			inorder(r.getRight());
		}
	}

	/* Function for preorder traversal */
	public void preorder() {
		preorder(root);
	}

	private void preorder(BinaryNode r) {
		if (r != null) {
			System.out.print(r.getData() + " ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}

	/* Function for postorder traversal */
	public void postorder() {
		postorder(root);
	}

	private void postorder(BinaryNode r) {
		if (r != null) {
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getData() + " ");
		}
	}
}