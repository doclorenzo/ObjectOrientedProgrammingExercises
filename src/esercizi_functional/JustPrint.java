package esercizi_functional;

import java.util.List;
import java.util.Map;

public class JustPrint {

    public static <T> void justPrintList(List<T> list){
        list.forEach(x-> System.out.println("Hello "+x+"!"));
    }
    public static <K,V> void justPrintMap(Map<K, V> map){
        map.forEach((x,y)-> System.out.println("k:"+x.toString()+", v:"+y.toString()));
    }

}
