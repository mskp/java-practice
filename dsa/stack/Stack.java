package com.sush.dsa.stack;

import java.util.Arrays;

public class Stack <T>{

    Object[] data;
    private static final int SIZE = 10;
    private int topOfStack = -1;

    public Stack(){
        this(SIZE);
    }

    public Stack(int size){
        this.data = new Object[size];
    }



    public boolean push(T value){
        if(isFull())
            return false;

        data[++topOfStack] = value;
        return true;
    }

    public T pop() throws Exception {
        if(isEmpty())
            throw new Exception("Array is full");

        return (T)data[topOfStack--];
    }

    public boolean isFull() {
        return topOfStack == data.length - 1;
    }

    public boolean isEmpty(){
        return topOfStack == -1;
    }

    public void display(){
        if(isEmpty())
            return;

        for(int i = topOfStack; i>= 0; i--)
            System.out.print(data[i] + " ");
    }

}
