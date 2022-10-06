package Oops6;

import java.util.Arrays;

public class Customarraygenerics {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public Customarraygenerics(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isfull()){
            resize();
        }
        data[size++]=num;            //intial it is like data[0]=num;
    }
    private void resize(){
        int[] temp= new int[data.length*2];

        //copy the current items in the new array
        for(int i=0; i<data.length; i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isfull(){
        return size==data.length;
    }

    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArraylist list=new CustomArraylist();
        list.add(4);
        System.out.println(list.toString());

    }

}
