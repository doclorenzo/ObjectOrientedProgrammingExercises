package esercizi_generics;

import java.util.*;

public class MapToPairs {

    //

    public static <K, V>  List<Pair<K, V>> mapToPairs(Map<K, V> src){

        Set<Map.Entry<K,V>> setpair = new HashSet<Map.Entry<K,V>>(src.entrySet());

        List<Pair<K,V>> ret = new ArrayList<Pair<K,V>>();

        for(Map.Entry<K,V> e: setpair){
            Pair<K,V> obj = new Pair<K,V>(e.getKey(),e.getValue());
            ret.add(obj);
        }
        return ret;
    }
}
