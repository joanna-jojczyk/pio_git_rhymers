package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private static final int EMPTY_VALUE = -1;

    private Node last; //na górze róże na dole fiołki, last się zapomniał i zrobił fikołki
    private int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_VALUE;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    private class Node {

        private int value;
        private Node prev; 
        private Node next;
    
        public Node(int i) {
            value = i;
        }

        int getValue() {
            return value;
        }


        Node getPrev() {
            return prev;
        }

        void setPrev(Node prev) {
            this.prev = prev;
        }

        Node getNext() {
            return next;
        }

        void setNext(Node next) {
            this.next = next;
        }

    }

}
