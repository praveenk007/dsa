import java.util.Comparator;

/**
 * @author praveenkamath
 **/
public class BinarySearchTree<T extends Comparable<T>> implements Comparator<T> {

    private Node root;

    public void insert(T data) {
        if(root == null) {
            root = new Node(data);
            return;
        } insertThis(data, root);
    }

    public void displayInOrder() {
        inorder(root);
    }

    public void displayAntiClockLeafs() {
        printNode(root);
        anticlock(root);
    }

    private void anticlock(Node currentNode) {
        if(currentNode == null) {
            return;
        }

        anticlock(currentNode.left);
        if(currentNode.left == null && currentNode.right == null) {
            printNode(currentNode);
            return;
        }
        anticlock(currentNode.right);
    }

    private void inorder(Node currentNode) {
        if(currentNode == null) {
            return;
        }
        inorder(currentNode.left);
        printNode(currentNode);
        inorder(currentNode.right);
    }

    private void printNode(Node node) {
        System.out.println(node.data);
    }

    private void insertThis(T data, Node currentNode) {
        if(compare(currentNode.data, data) == 1) {
            if(currentNode.left == null) {
                currentNode.left = new Node(data);
                return;
            } insertThis(data, currentNode.left);
        }
        if(compare(currentNode.data, data) == 0) {
            if (currentNode.right == null) {
                currentNode.right = new Node(data);
                return;
            } insertThis(data, currentNode.right);
        }
    }


    public int compare(T a, T b) {
        return a.compareTo(b);
    }

    public class Node {

        private T data;

        private Node left;

        private Node right;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
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

    }
}
