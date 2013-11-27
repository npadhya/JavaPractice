package com.nikul.javapractice.binarytree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestBinaryTree {

	@Test
	public void isTreeExist(){
		BinaryTreeImpl binaryTree = new BinaryTreeImpl();
		assertNotNull(binaryTree);
	}
	
	@Test
	public void testAddDataToTree(){
		BinaryTreeImpl binaryTree = new BinaryTreeImpl();
		assertTrue(binaryTree.addNewNode(3));
	}
	
	@Test
	public void testIfTreeIsEmpty(){
		BinaryTreeImpl binaryTree = new BinaryTreeImpl();
		assertTrue(binaryTree.isEmpty());
	}
	
	@Test
	public void testHeadIsPresent(){
		BinaryTreeImpl binaryTree = new BinaryTreeImpl();
		int i = 3;
		binaryTree.addNewNode(i);
		Node node = binaryTree.getTree();
		assertEquals(node.getData(),i);
	}
	
	@Test
	public void testIsDataAtRightPosition(){
		BinaryTreeImpl binaryTree = new BinaryTreeImpl();
		binaryTree.addNewNode(3);
		binaryTree.addNewNode(4);
		Node headOfTheTres = binaryTree.getTree();
		assertEquals(headOfTheTres.getRightChild().getData(),4);
	}
	
	@Test
	public void testIsDataAtLeftPosition(){
		BinaryTreeImpl binaryTree = new BinaryTreeImpl();
		binaryTree.addNewNode(3);
		binaryTree.addNewNode(2);
		Node headOfTheTres = binaryTree.getTree();
		assertEquals(headOfTheTres.getLeftChild().getData(),2);
	}
	
	@Test
	public void testLeftRightTree(){
		BinaryTreeImpl binaryTree = new BinaryTreeImpl();
		binaryTree.addNewNode(6);
		binaryTree.addNewNode(4);
		binaryTree.addNewNode(5);
		binaryTree.addNewNode(2);
		binaryTree.addNewNode(1);
		binaryTree.addNewNode(3);
		Node treeRoot = binaryTree.getTree();
		binaryTree.addNewNode(7);
		binaryTree.showTree(treeRoot);
		assertTrue(true);
	}
	
	@Test
	public void testSearchingInTree(){
		BinaryTreeImpl binaryTree = new BinaryTreeImpl();
		binaryTree.addNewNode(1);
		binaryTree.addNewNode(2);
		binaryTree.addNewNode(3);
		binaryTree.addNewNode(4);
		binaryTree.addNewNode(5);
		binaryTree.addNewNode(6);
		binaryTree.addNewNode(7);
		binaryTree.addNewNode(8);
		binaryTree.addNewNode(9);
		binaryTree.addNewNode(10);
		binaryTree.addNewNode(11);
		binaryTree.addNewNode(12);
		binaryTree.addNewNode(13);
		binaryTree.addNewNode(14);
		binaryTree.addNewNode(15);
		
		Node treeRoot = binaryTree.getTree();
		binaryTree.showTree(treeRoot);
		assertTrue(binaryTree.searchNode(treeRoot,2));
		assertTrue(binaryTree.searchNode(treeRoot,9));
	}
}