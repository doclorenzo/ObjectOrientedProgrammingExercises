package esercizi_collections.Map;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {

    public static Map<Character,Integer> stringToMap(String string){

        HashMap<Character,Integer> mappa = new HashMap<Character,Integer>();

        for(Character c : string.toCharArray()){
            if(mappa.containsKey(c)){
                int valore = mappa.get(c);
                mappa.replace(c,valore+1);
            }
            else{
                mappa.put(c,1);
            }
        }
        return mappa;
    }

    public static boolean areAnagrams(String first, String second){

        Map<Character,Integer> mappa1 = stringToMap(first);
        Map<Character,Integer> mappa2 = stringToMap(second);

        return mappa1.equals(mappa2);

    }

}
