package esercizi_collections.Map;

import java.util.HashSet;
import java.util.Map;

public class ValuesKeys {

    public static boolean valuesKeys(Map<String, String> map){

        HashSet<String> keys = new HashSet<String>(map.keySet());
        HashSet<String> values = new HashSet<String>(map.values());

        for(String v: values){
            if(keys.contains(v)) return true;
        }
        return false;
    }

}
