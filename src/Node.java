
public class Node {

	private int val;
	private Node left;
	private Node right;

	public Node(int val) {
		super();
		this.val = val;
		this.left = null;
		this.right = null;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node addNode(Node root, int val) {

		// Node currentNode = this;

		if (root == null) {
			root = new Node(val);
			return root;
		}

		else if (val < root.val) {
			root.left =	addNode(root.left, val);
			
		}

		else if (val > root.val) {
			root.right=	addNode(root.right, val);
			
		}

		else if (val == root.val) {
			System.out.println("Node already exists");
		}
		
		return root;

	}

	public void searchNode(Node root, int val) {

		if (root == null) {
			System.out.println("Node does not exist");
		}

		else if (val < root.val) {
			searchNode(root.left, val);
		}

		else if (val > root.val) {
			searchNode(root.right, val);
		}

		else if (val == root.val) {
			System.out.println("Node found");
		}

	}

	public void inOrder(Node root) {

		if (root == null) {
			return;
		}

		inOrder(root.left);
		System.out.println(root.val + " ");
		inOrder(root.right);

	}

	public void PreOrder(Node root) {

		if (root == null) {
			return;
		}

		System.out.println(root.val + " ");
		PreOrder(root.left);
		PreOrder(root.right);
	}

	public void PostOrder(Node root) {

		if (root == null) {
			return;
		}

		PostOrder(root.left);
		PostOrder(root.right);
		System.out.println(root.val + " ");

	}

}
