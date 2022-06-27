package com.sush.dsa.array;

public class Array<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size;
    private int len;

    public Array(){
        this(DEFAULT_SIZE);
    }

    public Array(int size){
        this.size = size;
        this.len= 0;
    }

    public void insertAtFirst(T value){
        if(this.len >= data.length)
            return;
        else if (this.len < 0){
            data[0] = value;
            len++;
            return;
        }
        len++;
        for(int i = 0; i < data.length; i++){
            Object temp = data[i];
            data[i] = data[i + 1];
            data[i + 1] = temp;
        }
        data[0] = value;
    }

    public Object removeFirst(){
        if(this.len < data.length){
            return null;
        }
        Object value = data[0];
        for(int i = 0; i < data.length; i++){
            Object temp = data[i + 1];
            data[i + 1] = data[i];
            data[i] = temp;
        }
        return value;
    }
}
