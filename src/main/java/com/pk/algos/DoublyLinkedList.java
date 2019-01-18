package com.pk.algos;

/**
 * @author praveenkamath
 **/
public class DoublyLinkedList<T> {

    private DoublyLinkedList.Node<T> head;

    private DoublyLinkedList.Node<T> end;

    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.end = null;
    }

    public void addAtFirst(T data) {
        DoublyLinkedList.Node node = new DoublyLinkedList.Node(data);
        if(head == null) {
            this.head   = node;
            this.end    = node;
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
        DoublyLinkedList.Node node = new DoublyLinkedList.Node(data);
        this.end.setNext(node);
        node.setPrevious(this.end);
        this.end = node;
        this.size++;
    }

    public void addAtEnd(DoublyLinkedList.Node<T> node) {
        if(node == null) {
            return;
        }
        if(head == null) {
            addAtFirst(node.getData());
            return;
        }
        this.end.setNext(node);
        node.setPrevious(this.end);
        this.end = node;
        this.size++;
    }

    public boolean isCyclic() {
        if(this.head == null || this.end == null) {
            return false;
        }
        DoublyLinkedList.Node slow = this.head;
        DoublyLinkedList.Node fast = this.head;
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
        DoublyLinkedList.Node<T> tempDisplay = head; // start at the beginning of linkedList
        while (tempDisplay != null){ // Executes until we don't find end of list.
            tempDisplay.displayNode();
            tempDisplay = tempDisplay.next; // move to next Node
        }
        System.out.println();

    }

    public DoublyLinkedList.Node<T> getHead() {
        return head;
    }

    public void setHead(DoublyLinkedList.Node<T> head) {
        this.head = head;
    }

    public DoublyLinkedList.Node<T> getEnd() {
        return end;
    }

    public void setEnd(DoublyLinkedList.Node<T> end) {
        this.end = end;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static class Node<T> {

        private DoublyLinkedList.Node next;

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        private DoublyLinkedList.Node previous;

        private T data;

        public Node(T data) {
            this.data = data;
        }

        public T getData() { return data; }

        public void setData(T data) {
            this.data = data;
        }

        public DoublyLinkedList.Node next() {
            return next;
        }

        public void setNext(DoublyLinkedList.Node next) {
            this.next = next;
        }

        public void displayNode() {
            if(this.getPrevious() == null) {
                System.out.println("data :: "+this.data);
            } else {
                System.out.println("data :: "+this.data + ", previous :: "+this.getPrevious().getData());
            }
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
