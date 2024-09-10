package esercizi_collections.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InvertMap {

    public static Map<String, Integer> invertMap(Map<Integer, String> src){

        Set<Integer> vtk = new HashSet<Integer>(src.keySet());
        Map<String,Integer> ret = new HashMap<String,Integer>();

        for(Integer v : vtk){
            ret.put(src.get(v),v);
        }
    return ret;
    }

}
