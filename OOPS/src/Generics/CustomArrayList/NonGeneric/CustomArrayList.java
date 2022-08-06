package Generics.CustomArrayList.NonGeneric;

public class CustomArrayList {
    private int[] data;
    private static final int DEFAULT_CAPACITY=5;
    private int size=0;

    public CustomArrayList(){
        this.data=new int[DEFAULT_CAPACITY];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    public int remove(){
        return data[--size];
    }

    public void set(int index,int value){
        if(index>size) return;
        data[index]=value;
    }

    private void resize() {
        int[] temp=new int[data.length * 2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    public int get(int index){
        if(index>size) return -1;
        return data[index];
    }

    public int size(){
        return size;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("[ ");
        for (int i=0;i<size;i++){
            stringBuilder.append(data[i]).append(" ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
