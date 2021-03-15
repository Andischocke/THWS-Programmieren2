package exercise19.task3;

import exercise19.task2.BinaryTree;
import exercise19.task2.BinaryTreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestBinaryTree {
	BinaryTree<String> tree;
	
	@BeforeEach
	void setUp() throws Exception {
		tree = new BinaryTree<>();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRoot() {
		assertEquals(null, tree.root);
	}
	
	@Test
	void testNodes() {
		tree.addNodeToTree(new BinaryTreeNode<>("Cool"));
		tree.addNodeToTree(new BinaryTreeNode<>("Aaronson"));
		tree.addNodeToTree(new BinaryTreeNode<>("Zylla"));
		tree.addNodeToTree(new BinaryTreeNode<>("Garrett"));
		assertEquals("Cool", tree.root.element);
		assertEquals("Aaronson", tree.root.left.element);
		assertEquals("Zylla", tree.root.right.element);
		assertEquals("Garrett", tree.root.right.left.element);
	}
}