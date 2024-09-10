package esercizi_collections.Set;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){

        Set<Integer> ret = new HashSet<Integer>();
        for(Integer i: first){
            if(second.contains(i)) ret.add(i);
        }
        return ret;
    }
    public static Set<Integer> intersectionRetainAll(Set<Integer> first, Set<Integer> second){
        first.retainAll(second);
        return first;
    }

}
