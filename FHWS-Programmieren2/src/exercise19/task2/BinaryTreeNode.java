package exercise19.task2;

public class BinaryTreeNode<Type extends Comparable<Type>> {

	public Type element;

	public BinaryTreeNode<Type> left;
	public BinaryTreeNode<Type> right;

	public BinaryTreeNode(Type element) {
		this.element = element;
	}
	
	public void addNodeToNode(BinaryTreeNode<Type> node) {
		if(this.element.compareTo(node.element) > 0) {
			if(this.left == null) {
				this.left = node;
			}else {
				this.left.addNodeToNode(node);
			}
		}else if(this.element.compareTo(node.element) <= 0) {
			if(this.right == null) {
				this.right = node;
			}else {
				this.right.addNodeToNode(node);
			}
		}
	}
	
	public String toString() {
		String string = String.format("%s:(", element);
		if(left != null) {
			string += String.format("left %s", left);
		}
		if(right != null) {
			string += String.format("right %s", right);
		}
		string += ") ";
		return string;
	}
}