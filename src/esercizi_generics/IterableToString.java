package esercizi_generics;

public class IterableToString {

    public static <E> String iterableToString(Iterable<E> src){

        StringBuilder ret=new StringBuilder();
        for(E e: src){
            ret.append(e.toString()).append(", ");
        }
        return ret.toString();

    }

}
