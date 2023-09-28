public class BinarySearchTree {

    static class Node {
        private final int data;
        private Node left;
        private Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    BinarySearchTree(){
        root = null;
    }
    public Node getRootNode() {
        return this.root;
    }

    public void insert(int data) {
        root = insertNode(root, data);
    }

    public Node insertNode(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }
        else if (data < root.data) {
            root.left = insertNode(root.left, data);
        }
        else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    private Node searchNode(Node root, int data) {
        if(root == null) {
            return null;
        }
        else if(data == root.data) {
            return root;
        }
        else if(data < root.data) {
            return searchNode(root.left, data);
        }
        else {
            return searchNode(root.right, data);
        }
    }
    public void search(int data) {
        Node node = searchNode(this.root, data);
        if(node != null) {
            System.out.println(node.data);
        }
        else {
            System.out.println(String.format("The node contains the value %s is not found!", data));
        }
    }

    private Node findMinNode(Node root) {
        if(root == null) {
            return null;
        }
        else if(root.left == null) {
            return root;
        }
        else {
            return findMinNode(root.left);
        }
    }
    public void findMin() {
        Node node =  findMinNode(this.root);
        if(node != null) {
            System.out.println(String.format("Minimum Node value is %d", node.data));
        }
        else {
            System.out.println("Node does not exist");
        }
    }

    private void preOrderTraverse(Node root) {
        if (root != null) {
            System.out.print(root.data);
            System.out.print(" ");
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
    }
    public void preOrder() {
        preOrderTraverse(this.root);
    }

    private void postOrderTraverse(Node root) {
        if (root != null) {
            postOrderTraverse(root.left);
            postOrderTraverse(root.right);
            System.out.print(root.data);
            System.out.print(" ");
        }
    }
    public void postOrder() {
        postOrderTraverse(this.root);
    }

    private void inOrderTraverse(Node root) {
        if (root != null) {
            inOrderTraverse(root.left);
            System.out.print(root.data);
            System.out.print(" ");
            inOrderTraverse(root.right);
        }
    }
    public void inOrder() {
        inOrderTraverse(this.root);
    }

    public static void main(String args[]) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(8);
        binarySearchTree.insert(5);
        binarySearchTree.insert(11);
        binarySearchTree.insert(3);
        binarySearchTree.insert(2);
        binarySearchTree.insert(9);
        System.out.print("preOrder: \n");
        binarySearchTree.preOrder();
        System.out.println("\n");
        System.out.print("postOrder: \n");
        binarySearchTree.postOrder();
        System.out.println("\n");
        System.out.print("inOrder: \n");
        binarySearchTree.inOrder();
        System.out.println("\n");
        System.out.println("Search node: ");
        binarySearchTree.search(11);
        binarySearchTree.findMin();
    }
}
