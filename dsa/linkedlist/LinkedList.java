package com.sush.dsa.linkedlist;

public class LinkedList<T> {

    private Node head = null;
    private int size = 0;

    private class Node {
        private final T data;
        private Node next;

        public Node(T value) {
            this.data = value;
            this.next = null;
        }

        public Node(T value, Node next) {
            this.data = value;
            this.next = next;
        }
    }

    public void append(T value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    public void prepend(T value) {
        Node node = new Node(value), temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
        size++;
    }

    public void insert(T value, int pos) {
        if (pos == 0) {
            append(value);
            return;
        } else if (pos == size) {
            prepend(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos; i++)
            temp = temp.next;
        temp.next = new Node(value, temp.next);
        size++;
    }

    private void removeFirst() {
        Node temp = head;
        head = head.next;
        temp = null;
        size--;
    }

    public void reverseList(){
        Node prevPtr = null, currentPtr = head, nextPtr;

        while(currentPtr != null){
            nextPtr = currentPtr.next;
            currentPtr.next = prevPtr;

            prevPtr = currentPtr;
            currentPtr = nextPtr;
        }
        head = prevPtr;
    }

    private void removeLast() {
        Node temp1 = head, temp2 = head.next;
        while (temp2.next != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        temp1.next = null;
        temp2 = null;
        size--;
    }

    public void remove(int pos) {
        if (pos == 0) {
            removeFirst();
            return;
        } else if (pos == size) {
            removeLast();
            return;
        }

        Node temp1 = head, temp2 = head.next;
        for (int i = 1; i < pos; i++) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp1.next = temp2.next;
        temp2 = null;
        size--;
    }

    public void display() {
        if(head == null){
            System.err.print("Error:- Linked List Empty");
            return;
        }
        for (Node temp = head; temp != null; temp = temp.next){
            System.out.print(temp.data + " -> ");
        }
        System.out.print("END");
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if(head == null){
//            System.err.print("Error:- Linked List Empty");
            return "Linked List Empty";
        }
        for (Node temp = head; temp != null; temp = temp.next) {
            str.append(temp.data).append(" -> ");
        }
        str.append("end");
        return str.toString();
    }

    public int len() {
        return this.size;
    }
}
