package Generics.CustomArrayList.Generic;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] data;
    private int INITIAL_CAPACITY=5;
    private int size=0;

    public CustomArrayList() {
        this.data = new Object[INITIAL_CAPACITY];
    }

    public void add(int data){
        if(isFull()){
            resize();
        }
        this.data[size++]=data;
    }
    private void resize() {
        Object[] temp=new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    private boolean isFull() {
        return data.length == size;
    }

    public T get(int index){
        return (T)data[index];
    }

    public void set(int index,T data){
        this.data[index]=data;
    }

    public T remove(){
        data[size--]=null;
        return (T)data[size];
    }

    public int size(){
        return this.size;
    }

    @Override
    public String toString() {
        return "\ndata=" + Arrays.toString(data) +
                ",\nsize=" + size +"\nlength = "+ data.length;
    }
}
