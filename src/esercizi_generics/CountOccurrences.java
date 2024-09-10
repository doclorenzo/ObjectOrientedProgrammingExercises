package esercizi_generics;

import java.util.Objects;

public class CountOccurrences {

    public static <T> int countOccurrencesPlain(T[] src, T item){

        int ret=0;

        for(T t: src){
            if(t==item) ret++;
        }
       return ret;
    }

    public static <T> int countOccurrencesObjects(T[] src, T item){
        int ret=0;

        for(T t: src){
            if(Objects.equals(item,t)) ret++;
        }
        return ret;
    }
}


