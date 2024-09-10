package esercizi_collections.Set;

import java.util.HashSet;
import java.util.Set;

public class Union {

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second){

        Set<Integer> ret= new HashSet<Integer>();
        for(Integer i: first){
            ret.add(i);
        }
        for(Integer i: second) {
                  ret.add(i);
        }
        return ret;

    }
    public static Set<Integer> unionAddAll(Set<Integer> first, Set<Integer> second){
        Set<Integer> ret= new HashSet<Integer>();
               ret.addAll(first);
        ret.addAll(second);
        return ret;
    }

}
