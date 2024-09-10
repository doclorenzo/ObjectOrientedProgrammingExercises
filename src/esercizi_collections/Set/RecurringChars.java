package esercizi_collections.Set;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {
    public static Set<Character> recurringChars(String string){

        Set<Character> ret=new HashSet<Character>();
        Set<Character> dup=new HashSet<Character>();

        for(char c : string.toCharArray()){
            if(!ret.contains(c)) ret.add(c);
            else dup.add(c);
        }
        return dup;

        /*for(int i=0; i<string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    ret.add(string.charAt(i));
                    break;
                }
            }
        }
        return ret;*/
    }
}
