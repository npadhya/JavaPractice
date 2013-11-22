package com.nikul.javapractice.binarytree;

public class BinaryTreeImpl {

	private Node root;
	private Node temp;
	private Node current;
	
	/*
	 * This method is used to add new node in to binary tree
	 */
	public boolean addNewNode(int i) {
		temp = new Node(i);
		if(isEmpty()){
			root = current = temp;
		}else{
			current = root;
			while(true){
				if(i < current.getData()){
					if(current.getLeftChild() == null){
						current.setLeftChild(temp);
						temp.setParant(current);
						break;
					}else{
						current = current.getLeftChild();
					}
				}else{
					if(current.getRightChild() == null){
						current.setRightChild(temp);
						temp.setParant(current);
						break;
					}else{
						current = current.getRightChild();
					}
				}
			}
		}
		return true;
	}
	
	/*
	 * This methos is used to verify if the Binary tree is empty or not
	 * It will check if the Head is null i.e. the Tree is empty and root is never initialized
	 * Else the Tree is not Empty
	 */
	public boolean isEmpty() {
		if(root != null)
			return false;
		return true;
	}

	/*
	 * This method will just return the Head of the Tree
	 */
	public Node getTree() {
		return root;
	}
	
	/*
	 * Display the Binary tree
	 */
	public void showTree(Node root){
		if(root == this.root){
			System.out.println(root.getData());
		}
		System.out.println(root.getData() + "\'s - Left child is : "+ root.getLeftChild().getData()+" and Right child is : "+root.getRightChild().getData());
		showTree(root.getLeftChild());
		showTree(root.getRightChild());
	}

	/*
	 * This method is for searching a value in the tree and see if its present or not
	 */
	public boolean searchNode(Node root, int i) {
		if(i < root.getData() && root.getLeftChild() != null){
			return searchNode(root.getLeftChild(), i);
		}
		else if(i > root.getData() && root.getRightChild() != null ){
			return searchNode(root.getRightChild(), i);
		}
		else if(root.getData()==i){
			System.out.println(i +" is found as a child of " + root.getParant().getData());
			return true;
		}else{
			return false;
		}
	}
}
