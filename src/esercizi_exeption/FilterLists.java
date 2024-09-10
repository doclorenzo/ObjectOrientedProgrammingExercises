package esercizi_exeption;

import java.util.ArrayList;
import java.util.List;

import static esercizi_exeption.FilterItems.filterItems;

public class FilterLists {

    public static List<List<String>> filterLists(List<List<String>> lists){

        List<List<String>> ret= new ArrayList<List<String>>();

        for(List<String> l: lists){
            if(l.equals(filterItems(l))) ret.add(l);
        }
        return ret;
    }

}
