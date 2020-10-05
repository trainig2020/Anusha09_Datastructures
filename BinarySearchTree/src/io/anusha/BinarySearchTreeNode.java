package io.anusha;

public class BinarySearchTreeNode {

	BinarySearchTreeNode left, right;
	int data;

	/* Constructor */
	public BinarySearchTreeNode() {
		left = null;
		right = null;
		data = 0;
	}

	/* Constructor */
	public BinarySearchTreeNode(int n) {
		left = null;
		right = null;
		data = n;
	}

	/* Function to set left node */
	public void setLeft(BinarySearchTreeNode n) {
		left = n;
	}

	/* Function to set right node */
	public void setRight(BinarySearchTreeNode n) {
		right = n;
	}

	/* Function to get left node */
	public BinarySearchTreeNode getLeft() {
		return left;
	}

	/* Function to get right node */
	public BinarySearchTreeNode getRight() {
		return right;
	}

	/* Function to set data to node */
	public void setData(int d) {
		data = d;
	}

	/* Function to get data from node */
	public int getData() {
		return data;
	}
}
