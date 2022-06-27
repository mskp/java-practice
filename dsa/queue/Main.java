package com.sush.dsa.queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<>();
        myQueue.insert(45);
        myQueue.insert(659);
        myQueue.insert(59);
        myQueue.insert(95);
        myQueue.insert(96);
        System.out.println(myQueue.delete());
        myQueue.display();
    }
}
