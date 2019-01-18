package com.pk.algos;

/**
 * @author praveenkamath
 **/
public class LinkedList<T> {

    private Node<T> head;

    private Node<T> start;

    private Node<T> end;

    private int size;

    public LinkedList() {
        this.head = null;
        this.start = null;
        this.end = null;
    }

    public void addAtFirst(T data) {
        Node node = new Node(data);
        if(head == null) {
            this.head   = node;
            this.end    = node;
            this.start  = node;
            return;
        }
        node.setNext(this.head);
        this.head = node;
        this.size++;
    }

    public void addAtEnd(T data) {
        if(head == null) {
            addAtFirst(data);
            return;
        }
        Node node = new Node(data);
        this.end.setNext(node);
        this.end = node;
        this.size++;
    }

    public void addAtEnd(Node<T> node) {
        if(node == null) {
            return;
        }
        if(head == null) {
            addAtFirst(node.getData());
            return;
        }
        this.end.setNext(node);
        this.end = node;
        this.size++;
    }

    public boolean isCyclic() {
        if(this.head == null || this.end == null) {
            return false;
        }
        Node slow = this.head;
        Node fast = this.head;
        while(slow != null && fast != null && slow.next != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                System.out.println(slow.data);
                System.out.println(fast.data);
                return true;
            }
        } return false;
    }

    @Override
    public String toString() {
        return "com.pk.algos.LinkedList{" +
                "head=" + head +
                ", end=" + end +
                '}';
    }

    public void displayLinkedList() {
        System.out.print("Displaying com.pk.algos.LinkedList [first--->last]: ");
        Node<T> tempDisplay = head; // start at the beginning of linkedList
        while (tempDisplay != null){ // Executes until we don't find end of list.
            tempDisplay.displayNode();
            tempDisplay = tempDisplay.next; // move to next Node
        }
        System.out.println();

    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getStart() {
        return start;
    }

    public void setStart(Node<T> start) {
        this.start = start;
    }

    public Node<T> getEnd() {
        return end;
    }

    public void setEnd(Node<T> end) {
        this.end = end;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static class Node<T> {

        private Node next;

        private T data;

        public Node(T data) {
            this.data = data;
        }

        public T getData() { return data; }

        public void setData(T data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void displayNode() {
            System.out.println("data :: "+this.data);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }
}
