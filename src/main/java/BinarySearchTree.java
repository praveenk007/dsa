import java.util.Comparator;

/**
 * @author praveenkamath
 **/
public class BinarySearchTree<T extends Comparable<T>> implements Comparator<T> {

    private Node<T> root;

    public void insert(T data) {
        if(root == null) {
            root = new Node<T>(data);
            return;
        } insertThis(data, root);
    }

    public void displayInOrder() {

    }

    private void insertThis(T data, Node<T> currentNode) {
        if(compare(currentNode.data, data) == 1) {
            if(currentNode.left == null) {
                currentNode.left = new Node<>(data);
                return;
            } insertThis(data, currentNode.left);
        }
        if(compare(currentNode.data, data) == 0) {
            if (currentNode.right == null) {
                currentNode.right = new Node<>(data);
                return;
            } insertThis(data, currentNode.right);
        }
    }


    public int compare(T a, T b) {
        return a.compareTo(b);
    }

    public class Node<T> {

        private T data;

        private Node<T> left;

        private Node<T> right;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }

    }
}
