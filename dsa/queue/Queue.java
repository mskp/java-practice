package com.sush.dsa.queue;

public class Queue <T>{
    private Object[] data;
    private static final int SIZE = 10;

    private int front, rear;

    public Queue(){
        this(SIZE);
    }

    public Queue(int size){
        this.data = new Object[size];
        this.front = this.rear = -1;
    }

    public boolean insert(T value){
        if(isFull())
                return false;

        data[++rear] = value;
        return true;
    }

    public boolean isFull() {
        return rear == data.length - 1;
    }

    public T delete(){
        if(isEmpty())
                return null;
        return (T) data[++front];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void display(){
        if(isEmpty())
            return;
//        for(Object i : data)
//            System.out.print(i + " ");
        for(int i = front + 1; i<=rear; i++){
            System.out.print(data[i] + " ");
        }
    }
}
