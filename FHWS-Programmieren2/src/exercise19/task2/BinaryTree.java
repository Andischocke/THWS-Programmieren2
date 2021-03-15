package exercise19.task2;

public class BinaryTree<Type extends Comparable<Type>> {
	public BinaryTreeNode<Type> root;

	public void addNodeToTree(BinaryTreeNode<Type> node) {
		if (root == null) {
			root = node;
		} else {
			root.addNodeToNode(node);
		}
	}

	public void printTree() {
		System.out.println(root);
	}

	public static void main(String[] args) {
		BinaryTree<String> tree = new BinaryTree<>();
		tree.addNodeToTree(new BinaryTreeNode<>("Cool"));
		tree.addNodeToTree(new BinaryTreeNode<>("Aaronson"));
		tree.addNodeToTree(new BinaryTreeNode<>("Zylla"));
		tree.addNodeToTree(new BinaryTreeNode<>("Garrett"));
		tree.printTree();
	}
}