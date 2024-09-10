package esercizi_collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list){

        Set<Integer> tmp=new HashSet<>(list);
        List<Integer> ret=new ArrayList<Integer>(tmp);
        return ret;

    }

}
