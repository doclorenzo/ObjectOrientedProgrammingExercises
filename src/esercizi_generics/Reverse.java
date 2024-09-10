package esercizi_generics;

import java.util.List;

public class Reverse {

    public static <T> void reverse(List<T> list){

        for(int i=0; i<(int)list.size()/2; i++){
            T tmp= list.get(list.size()-i-1);
            list.set(list.size()-i-1,list.get(i));
            list.set(i,tmp);
        }

    }

}
