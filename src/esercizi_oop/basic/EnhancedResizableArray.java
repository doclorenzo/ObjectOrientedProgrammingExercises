package esercizi_oop.basic;

import java.util.Arrays;

public class EnhancedResizableArray {

    static final int DEFAULT_CAPACITY = 1;
    int[] v;

    public EnhancedResizableArray(){
        v=new int[DEFAULT_CAPACITY];
    }

    public int get(int index){
            return v[index];
    }

    public int length(){
        return v.length;
    }
    public int[] toArray(){
        return v.clone();
    }

    public void fill(int value){
        Arrays.fill(v, value);
    }
    public boolean contains(int value){
        for(int val:v){
            if(val==value) return true;
        }
        return false;
    }

    public void set(int index, int value){
        try{
            v[index]=value;
        }
        catch(ArrayIndexOutOfBoundsException e){
            int[] n=new int[index*2];
            System.arraycopy(v, 0, n, 0, v.length);
            v=n;
            v[index]=value;
        }
    }

}
