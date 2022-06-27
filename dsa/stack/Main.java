package com.sush.dsa.stack;

public class Main {

    public static void main(String[] args) throws Exception {
        Stack <Integer> myStack = new Stack<>();
        myStack.push(78);
        myStack.push(52);
        myStack.push(4);
        myStack.push(59*2);
        System.out.println(myStack.pop());
        myStack.push(4554);
        myStack.display();

    }
}
