
public class Driver {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		
		root.addNode(root, 5);
		root.addNode(root, 7);
		root.addNode(root, 1);
		root.inOrder(root);
		root.PreOrder(root);
		root.PostOrder(root);
	}

}
