package esercizi_generics;

import static java.lang.Math.abs;

public class BinarySearch {

    public static <T extends Comparable<T>> int find(T[] array, T key){

        int a=0;
        int b = array.length-1;
        while(abs(a-b)>1){
            if(array[(int)((b-a)/2)].compareTo(key)>0) b=(int)((b-a)/2);
            else if (array[(int)((b-a)/2)].compareTo(key)<0) a=(int)((b-a)/2);
            else return (int)((b-a)/2);
        }
    return -1;
    }

}
