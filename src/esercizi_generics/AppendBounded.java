package esercizi_generics;

import java.util.List;

public class AppendBounded {

    public static <T> void appendBounded(List<T> dst, List<? extends T> src){

        if(!src.isEmpty()) dst.addAll(src);

    }

}
