package esercizi_functional;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class JustPrintParametrized {

    public static <T> void justPrintList(List<T> list, Consumer<? super T> hello){
        list.forEach(x-> hello.accept(x));
    }
    public static <K,V> void justPrintMap(Map<K, V> map, BiConsumer<? super K, ? super V> temp){
        map.forEach((x,y)->temp.accept(x,y));
    }

    static Consumer hello= x-> System.out.println("Hello "+x+"!");
}
